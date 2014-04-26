package jp.yokomark.widget.license;

/**
 * @author ichigotake
 */
public class CreditEntryBuilder {

    private String mLibraryName;
    private String mOwnerName;
    private int mSince;
    private CreditEntry.LicenseType mLicenseType;

    public CreditEntry build() {
        return new CreditEntry(mLibraryName, mOwnerName, mSince, mLicenseType);
    }

    public CreditEntryBuilder setLibraryName(String libraryName) {
        mLibraryName = libraryName;
        return this;
    }

    public CreditEntryBuilder setOwnerName(String ownerName) {
        mOwnerName = ownerName;
        return this;
    }

    public CreditEntryBuilder setSince(int since) {
        mSince = since;
        return this;
    }

    public CreditEntryBuilder setLicenseType(CreditEntry.LicenseType license) {
        mLicenseType = license;
        return this;
    }
}
