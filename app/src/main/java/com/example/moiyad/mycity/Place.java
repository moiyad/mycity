package com.example.moiyad.mycity;

/**
 * Created by Moiyad on 14/04/17.
 */

public class Place {
    private int placeName;
    private int placeDescruption;
    private int placeImage= noimage;
    private static final int noimage=-1;

    public Place(int placeName, int placeDescruption, int placeImage) {
        this.placeName = placeName;
        this.placeDescruption = placeDescruption;
        this.placeImage = placeImage;
    }

    public int getPlaceName() {
        return placeName;
    }

    public int getPlaceDescruption() {
        return placeDescruption;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public static int getNoimage() {
        return noimage;
    }
}
