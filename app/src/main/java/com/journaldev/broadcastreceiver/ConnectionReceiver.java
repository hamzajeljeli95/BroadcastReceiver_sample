package com.journaldev.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by anupamchugh on 11/04/16.
 */


public class ConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("API123", "" + intent.getAction());
        if (intent.getAction().equals("com.journaldev.broadcastreceiver.SOME_ACTION"))
            Toast.makeText(context, "SOME_ACTION is received", Toast.LENGTH_LONG).show();
        else if (intent.getAction().equals("android.intent.action.BATTERY_LOW")) {
            Toast.makeText(context, "BATTERY_CHANGED is received", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "OTHER is received", Toast.LENGTH_LONG).show();
        }
    }
}
