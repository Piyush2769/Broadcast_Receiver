package com.piyushmaheswari.broadcastreceiverworking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction()))
        {
            Toast.makeText(context, "Boot Completed", Toast.LENGTH_SHORT).show();
        }

        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction()))
        {
            Toast.makeText(context, "Connection Changed", Toast.LENGTH_SHORT).show();
        }

    }
}
