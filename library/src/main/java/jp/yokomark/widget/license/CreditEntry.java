package jp.yokomark.widget.license;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author yokomakukeishin
 * @since 2014/03/15
 * @version 1.0.0
 */
@SuppressWarnings("unused") // public APIs
public class CreditEntry implements Parcelable {
    public static final Creator<CreditEntry> CREATOR = new Creator<CreditEntry>() {
        @Override
        public CreditEntry createFromParcel(Parcel source) {
            return new CreditEntry(source);
        }

        @Override
        public CreditEntry[] newArray(int size) {
            return new CreditEntry[0];
        }
    };
    private final String mLibraryName;
    private final String mOwnerName;
    private final int mSince;
    private final LicenseType mType;

    public CreditEntry(Parcel source) {
        mLibraryName = source.readString();
        mOwnerName = source.readString();
        mSince = source.readInt();
        mType = (LicenseType) source.readSerializable();
    }

    public CreditEntry(String libraryName, String ownerName, int since, LicenseType type) {
        mLibraryName = libraryName;
        mOwnerName = ownerName;
        mSince = since;
        mType = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mLibraryName);
        dest.writeString(mOwnerName);
        dest.writeInt(mSince);
        dest.writeSerializable(mType);
    }

    public String getLibraryName() {
        return mLibraryName;
    }

    public String getOwnerName() {
        return mOwnerName;
    }

    public int getSince() {
        return mSince;
    }

    public LicenseType getType() {
        return mType;
    }

    public static enum LicenseType {
        APACHE_V2(R.string.license_header_apache_v2, R.string.license_content_apache_v2),
        MIT(R.string.license_header_mit, R.string.license_content_mit),
        BSD_V2(R.string.license_header_bsd_v2, R.string.license_content_bsd_v2);

        private final int mHeaderResource;
        private final int mBodyResource;

        private LicenseType(int resource, int resource1) {
            mHeaderResource = resource;
            mBodyResource = resource1;
        }

        public int getHeaderResource() {
            return mHeaderResource;
        }

        public int getBodyResource() {
            return mBodyResource;
        }
    }
}
