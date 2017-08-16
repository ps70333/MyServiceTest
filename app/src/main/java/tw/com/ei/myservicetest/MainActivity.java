package tw.com.ei.myservicetest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public MyServiceConnection myServiceConnection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //myServiceConnection=new MyServiceConnection();
        //Intent it=new Intent(MainActivity.this,MyService.class);
        //bindService(it,myServiceConnection, Context.BIND_AUTO_CREATE);
    }
    public class MyServiceConnection implements ServiceConnection{
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }
    public void start(View v){
        Intent it=new Intent(MainActivity.this,MyService.class);
        startService(it);
    }
    public void pause(View v){
        Intent it=new Intent(MainActivity.this,MyService.class);
        startService(it);
    }
    public void stop(View v){
        Intent it=new Intent(MainActivity.this,MyService.class);
        stopService(it);
    }
    public void unbind(View v){
        //unbindService(MyServiceConnection);
    }
}
