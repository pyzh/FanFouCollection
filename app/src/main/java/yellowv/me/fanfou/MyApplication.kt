package yellowv.me.fanfou

import android.app.Application
import yellowv.me.fanfou.http.HttpManager

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        HttpManager.init(this)
    }
}