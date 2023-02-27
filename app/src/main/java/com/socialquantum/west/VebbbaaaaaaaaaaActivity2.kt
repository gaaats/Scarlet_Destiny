package com.socialquantum.west

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.ghgtgt59
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.gtitghugt
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.hy59hy59hy59hy
import com.socialquantum.west.databinding.ActivityVebbbaaaaaaaaaa2Binding
import com.socialquantum.west.njjuikkiik.Gygfrgygrfrfrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VebbbaaaaaaaaaaActivity2 : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != gtktgotgkogtkogt || nhjuujkikiik == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var hyh5uj95uj59uj: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (gtmgtmhyiojhyjhy != null) {
                    hyh5uj95uj59uj = arrayOf(Uri.parse(gtmgtmhyiojhyjhy))
                }
            } else {
                val gt5gt5gt5gt = data.dataString
                if (gt5gt5gt5gt != null) {
                    hyh5uj95uj59uj = arrayOf(Uri.parse(gt5gt5gt5gt))
                }
            }
        }
        nhjuujkikiik!!.onReceiveValue(hyh5uj95uj59uj)
        nhjuujkikiik = null
        return
    }

    inner class OIFrjrfrfhhfruh : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gthgtihtghtggthgtugt.efrhjbrfbbfr(url)) {

                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    startActivity(intent)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            hyhyju5hj59uj5uj(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VebbbaaaaaaaaaaActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        htmklhymklhymhykohy = ActivityVebbbaaaaaaaaaa2Binding.inflate(layoutInflater)
        hy5hy5hy5h99hy = WebView(this)
        setContentView(hy5hy5hy5h99hy)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(hy5hy5hy5h99hy, true)
        gthgtihtghtggthgtugt.gtntgkgtkngt(hy5hy5hy5h99hy)

        hy5hy5hy5h99hy.webViewClient = OIFrjrfrfhhfruh()
        hy5hy5hy5h99hy.webChromeClient = FUiihufrf()
        hy5hy5hy5h99hy.loadUrl(ururururururururgtthyhyhy())
    }

    private lateinit var htmklhymklhymhykohy: ActivityVebbbaaaaaaaaaa2Binding
    lateinit var hy5hy5hy5h99hy: WebView
    private var nhjuujkikiik: ValueCallback<Array<Uri>>? = null
    private var gtmgtmhyiojhyjhy: String? = null
    private val gtktgotgkogtkogt = 1




    private val gthgtihtghtggthgtugt by viewModel<Gygfrgygrfrfrf>(
        named("BeamModel")
    )


    inner class FUiihufrf : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            nhjuujkikiik?.onReceiveValue(null)
            nhjuujkikiik = filePath
            var vbgbhy5yh59yh59hy: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (vbgbhy5yh59yh59hy!!.resolveActivity(packageManager) != null) {
                var photoFile: File? = null
                try {
                    photoFile = h59uj59uj59uj59uj()
                    vbgbhy5yh59yh59hy.putExtra("PhotoPath", gtmgtmhyiojhyjhy)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (photoFile != null) {
                    gtmgtmhyiojhyjhy = "file:" + photoFile.absolutePath
                    vbgbhy5yh59yh59hy.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile)
                    )
                } else {
                    vbgbhy5yh59yh59hy = null
                }
            }
            val nhnjuujkkiki95ik = Intent(Intent.ACTION_GET_CONTENT)
            nhnjuujkkiki95ik.addCategory(Intent.CATEGORY_OPENABLE)
            nhnjuujkkiki95ik.type = "image/*"
            val h5995ju9ujuj: Array<Intent?> =
                vbgbhy5yh59yh59hy?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val hy5hy5999 = Intent(Intent.ACTION_CHOOSER)
            hy5hy5999.putExtra(Intent.EXTRA_INTENT, nhnjuujkkiki95ik)
            hy5hy5999.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            hy5hy5999.putExtra(Intent.EXTRA_INITIAL_INTENTS, h5995ju9ujuj)
            startActivityForResult(hy5hy5999, gtktgotgkogtkogt)
            return true
        }

        fun h59uj59uj59uj59uj(): File? {
            val gt5gt5gt5 = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val g2hy5hy5hy = "JPEG_" + gt5gt5gt5 + "_"
            val gt59gt59gt = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                g2hy5hy5hy,
                ".jpg",
                gt59gt59gt
            )
        }
    }

    var bghyhyujujujujuj = ""
    fun hyhyju5hj59uj5uj(bgbg5: String?) {
        if (!bgbg5!!.contains("t.me")) {

            if (bghyhyujujujujuj == "") {
                bghyhyujujujujuj = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    bgbg5
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", bgbg5)
                ededededededed.apply()
            }
        }
    }


    private var fggtghyhyju5uj599uj = false
    override fun onBackPressed() {

        if (hy5hy5hy5h99hy.canGoBack()) {
            if (fggtghyhyju5uj599uj) {
                hy5hy5hy5h99hy.stopLoading()
                hy5hy5hy5h99hy.loadUrl(bghyhyujujujujuj)
            }
            this.fggtghyhyju5uj599uj = true
            hy5hy5hy5h99hy.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                fggtghyhyju5uj599uj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun ururururururururgtthyhyhy(): String {

        val gt5hy5hyhy9hy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val hy5hy5hy59hy = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val hyhyh5 = hy5hy5hy59hy.getString(gtitghugt, null)
        Log.d("lolo", hyhyh5.toString())
        Toast.makeText(this, "${hyhyh5}", Toast.LENGTH_SHORT).show()

        val j59uj5ju5ik5ik = hy5hy5hy59hy.getString(hy59hy59hy59hy, null)

        val ju559ki995ik = hy5hy5hy59hy.getString(ghgtgt59, null)


        when (hy5hy5hy59hy.getString("WebInt", null)) {
            "campaign" -> {
                gthgtihtghtggthgtugt.gtijojji(ju559ki995ik.toString())
            }
            "deepLink" -> {
                gthgtihtghtggthgtugt.gtijojji(ju559ki995ik.toString())
            }
            "deepLinkNOApps" -> {
                gthgtihtghtggthgtugt.gtijojji(j59uj5ju5ik5ik.toString())
            }
            "geo" -> {
                gthgtihtghtggthgtugt.gtijojji(j59uj5ju5ik5ik.toString())
            }
        }


        return gt5hy5hyhy9hy.getString("SAVED_URL", hyhyh5).toString()
    }

}