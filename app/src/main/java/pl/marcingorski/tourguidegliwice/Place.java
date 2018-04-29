package pl.marcingorski.tourguidegliwice;

/**
 * {@link Place} Place Name, Adress and an image of that place.
 */
public class Place {

    /** Name of place */
    private String mPlaceName;

    /** Address */
    private String mAddress;


    /** Image resource ID for the place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param placeName is the name of this place
     * @param placeAddress is address
     */
    public Place(String placeName, String placeAddress) {
        mPlaceName = placeName;
        mAddress = placeAddress;
    }

    /**
     * Create a new Word object.
     *
     * @param placeName is the name of this place
     * @param placeAddress is address
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     *
     */
    public Place(String placeName, String placeAddress, int imageResourceId) {
        mPlaceName = placeName;
        mAddress = placeAddress;
        mImageResourceId = imageResourceId;
        }

    /**
     * Get the place name.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the address.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

        /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}