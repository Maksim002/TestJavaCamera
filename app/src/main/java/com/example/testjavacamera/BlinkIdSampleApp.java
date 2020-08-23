package com.example.testjavacamera;

import com.example.testjavacamera.blinkid.BlinkIdResultExtractorFactory;

public final class BlinkIdSampleApp extends SampleApplication {

    @Override
    protected BaseResultExtractorFactory createResultExtractorFactory() {
        return new BlinkIdResultExtractorFactory();
    }

    @Override
    protected String getLicenceFilePath() {
        return "sRwAAAAOY29tLmphdmFjYW1lcmF/OqSe5WgxmSxBSsOl0Azv2g0gjcVGJ5N7VXXMgnw7y20RimFBFtdRs82PZSVnPvufUxptPQUs+8QB4soAiCBezXpLVH1NduQhLz000uHRMQBernxj13rPva7sR9VypEeKfXCvTR8rm1rrqvY8jQB792s9RfZeBHzZbFXVUwA6wnpbfhPKd5+jg1QEuotVBN7T9ci5gFVh1veBBI3H6Q6/omVS5zcgH7lVZZ4CTxb1IvWhD/IVpLGeZKKHsYz4ue7E66iyEPM+It0=";
    }

}
