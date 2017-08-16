package tw.com.ei.myservicetest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.IOException;

/**
 manifest要新增這個serivce

 */

public class MyService extends Service {
    public MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("simon","onBind");
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        player=MediaPlayer.create(this,R.raw.test);
        player.start();

        Log.i("simon","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("simon","onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("simon","onUnbind");
        return super.onUnbind(intent);
    }
    @Override
    public void onDestroy() {
        Log.i("simon","onDestroy");
        super.onDestroy();
    }


}
