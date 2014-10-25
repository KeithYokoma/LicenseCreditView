package jp.yokomark.widget.license;

/**
 * @author ichigotake
 */
public enum OpenSourceLicense implements CreditEntry.LicenseType {

    APACHE_V2(R.string.license_header_apache_v2, R.string.license_content_apache_v2),
    MIT(R.string.license_header_mit, R.string.license_content_mit),
    BSD_V2(R.string.license_header_bsd_v2, R.string.license_content_bsd_v2);

    private final int mHeaderResource;
    private final int mBodyResource;

    private OpenSourceLicense(int resource, int resource1) {
        mHeaderResource = resource;
        mBodyResource = resource1;
    }

    @Override
    public int getHeaderResource() {
        return mHeaderResource;
    }

    @Override
    public int getBodyResource() {
        return mBodyResource;
    }
}
