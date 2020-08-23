package com.example.testjavacamera.blinkid;


import com.example.testjavacamera.BaseResultExtractorFactory;
import com.example.testjavacamera.BlinkIDCombinedRecognizerResultExtractor;
import com.microblink.entities.recognizers.blinkid.generic.BlinkIdCombinedRecognizer;

public class BlinkIdResultExtractorFactory extends BaseResultExtractorFactory {

    @Override
    protected void addExtractors() {
        add(BlinkIdCombinedRecognizer.class,
                new BlinkIDCombinedRecognizerResultExtractor());
    }
}
