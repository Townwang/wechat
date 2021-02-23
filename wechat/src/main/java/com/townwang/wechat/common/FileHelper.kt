@file:Suppress("DEPRECATION")

package com.townwang.wechat.common

import android.annotation.SuppressLint
import android.content.ContentUris
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.view.View
import com.townwang.wechat.R
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

@SuppressLint("InlinedApi")
internal fun File.snapShot(context: Context, view: View) {
    val bitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas()
    canvas.setBitmap(bitmap)
    view.draw(canvas)
    var fos: FileOutputStream? = null
    var isSuccess = false
    try {
        fos = FileOutputStream(this)
        isSuccess = bitmap.compress(Bitmap.CompressFormat.PNG, 80, fos)
        fos.flush()
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        try {
            fos?.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    if (isSuccess) {
        val contentResolver = context.contentResolver
        val values = ContentValues(4)
        values.put(MediaStore.Images.Media.DATE_TAKEN, System.currentTimeMillis())
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/png")
        values.put(MediaStore.Images.Media.ORIENTATION, 0)
        values.put(
            MediaStore.Images.Media.TITLE,
            context.getString(R.string.donate)
        )
        values.put(
            MediaStore.Images.Media.DESCRIPTION,
            context.getString(R.string.donate_qa)
        )
        values.put(MediaStore.Images.Media.DATA, this.absolutePath)
        values.put(
            MediaStore.Images.Media.DATE_MODIFIED,
            System.currentTimeMillis() / 1000
        )
        var url: Uri? = null
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                context.grantUriPermission(
                    context.packageName,
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    Intent.FLAG_GRANT_WRITE_URI_PERMISSION
                )
            }
            url = contentResolver.insert(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                values
            )
            url?.also {
                val imageOut = contentResolver.openOutputStream(it)
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, imageOut)
                } finally {
                    try {
                        imageOut?.close()
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
                val id = ContentUris.parseId(it)
                MediaStore.Images.Thumbnails.getThumbnail(
                    contentResolver,
                    id,
                    MediaStore.Images.Thumbnails.MINI_KIND,
                    null
                )
            }
        } catch (e: Exception) {
            if (url != null) {
                contentResolver.delete(url, null, null)
            }
        }
    }
}