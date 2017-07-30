package in.codingninjas.firebasedemo;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/**
 * Created by manishakhattar on 29/07/17.
 */

public class DemoFirebaseMessagingService extends FirebaseMessagingService {

    final static  String TAG = "FCMTag";


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // ...

        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

           Map<String,String> map =  remoteMessage.getData();
            String activity_name = map.get("action");
            if(activity_name.equals("MainActivity")){
                    // Launch Notificaion with MainActivity as start Activity
            }
        }
        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }

    }
}
