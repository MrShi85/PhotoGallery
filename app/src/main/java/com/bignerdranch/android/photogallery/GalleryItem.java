package com.bignerdranch.android.photogallery;

/**
 * Created by Sergey Shilkin on 22.08.2016.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mCUrl;

    @Override
    public String toString() {
        return mCaption;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getCUrl() {
        return mCUrl;
    }

    public void setCUrl(String CUrl) {
        mCUrl = CUrl;
    }
}
