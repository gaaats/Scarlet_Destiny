package com.socialquantum.west.bggthhyhyh

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.bngjgtitghgtg
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.hy59hy59hy59hy
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.instIdgttg
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.vfbrfgfrgrfgrfgyrfgy
import com.socialquantum.west.nhhjujuj.bgbgnhhy5995uj5ju
import com.socialquantum.west.nhhjujuj.hhy5hy595hy95hy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class MainClaaaasss:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val gtkotgjgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val bhyhjyujujuj = getSharedPreferences("PREFS_NAME", 0)

        val gtgt5hyhy5hy5 = MyTracker.getTrackerParams()
        val gtngtgtjiogtji = MyTracker.getTrackerConfig()
        val hy5ju5ju9ujuj5ujuj = MyTracker.getInstanceId(this)
        gtngtgtjiogtji.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (bhyhjyujujuj.getBoolean("my_first_time", true)) {
            gtgt5hyhy5hy5.setCustomUserId(IDINgtgtgt)
            gtkotgjgt.edit().putString(hy59hy59hy59hy, IDINgtgtgt).apply()
            gtkotgjgt.edit().putString(instIdgttg, hy5ju5ju9ujuj5ujuj).apply()
            bhyhjyujujuj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val nrfedfrerfrf = gtkotgjgt.getString(hy59hy59hy59hy, IDINgtgtgt)
            gtgt5hyhy5hy5.setCustomUserId(nrfedfrerfrf)
        }
        MyTracker.initTracker(bngjgtitghgtg, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MainClaaaasss)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hhy5hy595hy95hy
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }
}