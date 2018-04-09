package yellowv.me.fanfou.http

abstract class HttpListener {
    abstract fun onSuccess()

    fun onFailure() {

    }

    fun onError() {

    }
}