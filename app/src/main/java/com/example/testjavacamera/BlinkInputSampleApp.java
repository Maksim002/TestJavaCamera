package com.example.testjavacamera;

import android.app.Application;

import com.microblink.MicroblinkSDK;
import com.microblink.intent.IntentDataTransferMode;

public final class BlinkInputSampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // obtain your licence at http://microblink.com/login or
        // contact us at http://help.microblink.com
        MicroblinkSDK.setLicenseKey("sRwAAAAOY29tLmphdmFjYW1lcmF/OqSe5WgxmSxBSsOl0Azv2g0gjcVGJ5N7VXXMgnw7y20RimFBFtdRs82PZSVnPvufUxptPQUs+8QB4soAiCBezXpLVH1NduQhLz000uHRMQBernxj13rPva7sR9VypEeKfXCvTR8rm1rrqvY8jQB792s9RfZeBHzZbFXVUwA6wnpbfhPKd5+jg1QEuotVBN7T9ci5gFVh1veBBI3H6Q6/omVS5zcgH7lVZZ4CTxb1IvWhD/IVpLGeZKKHsYz4ue7E66iyEPM+It0=", this);

        // use optimised way for transferring RecognizerBundle between activities, while ensuring
        // data does not get lost when Android restarts the scanning activity
        MicroblinkSDK.setIntentDataTransferMode(IntentDataTransferMode.PERSISTED_OPTIMISED);
    }
}
