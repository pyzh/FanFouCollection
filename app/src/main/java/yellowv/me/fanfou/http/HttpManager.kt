package yellowv.me.fanfou.http

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.lzy.okgo.OkGo

class HttpManager private constructor() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var mContext: Context
        lateinit var mInstance: HttpManager
        fun init(context: Context) {
            mContext = context
            mInstance = HttpManager()
        }
    }

    val mManager: HttpManager = mInstance

    init {
        if (mContext is Application) {
            // init 网络请求框架
            OkGo.getInstance().init(mContext as Application)
        }
    }

    fun get(url: String, params: Map<String, String>, listener: HttpListener) {
        val get = OkGo.get<String>(url)
        get.params(params)
    }
}
