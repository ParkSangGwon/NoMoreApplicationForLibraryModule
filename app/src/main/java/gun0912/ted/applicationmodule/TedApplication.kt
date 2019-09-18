package gun0912.ted.applicationmodule

import android.app.Application
import android.util.Log

class TedApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("ted", "TedApplication::onCreate")
    }
}