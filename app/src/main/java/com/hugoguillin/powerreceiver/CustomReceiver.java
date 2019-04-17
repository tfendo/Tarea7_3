package com.hugoguillin.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST = BuildConfig.APPLICATION_ID
            + ".ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
        String accion = intent.getAction();
        if(accion != null){
            String toast = "unknown intent action";
            switch (accion){
                case Intent.ACTION_POWER_CONNECTED:
                    toast = "Power connected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toast = "Power disconnected";
                    break;
                case ACTION_CUSTOM_BROADCAST:
                    toast = "Custom Broadcast Received";
                    break;
            }
            Toast.makeText(context, toast, Toast.LENGTH_LONG).show();
        }
    }
}
