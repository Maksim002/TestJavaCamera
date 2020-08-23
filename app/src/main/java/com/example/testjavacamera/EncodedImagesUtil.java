package com.example.testjavacamera;

public class EncodedImagesUtil {

    public static boolean shouldShowEncodedImageEntry(byte[] encodedImage) {
        return encodedImage != null && encodedImage.length > 0;
    }

}
