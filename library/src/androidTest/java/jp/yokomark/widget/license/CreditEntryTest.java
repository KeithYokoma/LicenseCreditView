package jp.yokomark.widget.license;

import android.os.Parcel;
import android.test.AndroidTestCase;
import android.util.Log;

/**
 * @author ichigotake
 */
public class CreditEntryTest extends AndroidTestCase {

    private final String LOG_TAG = CreditEntryTest.class.getSimpleName();

    public void testBuild() {
        String sampleLibraryName = "LicenseCreditView";
        String sampleOwnerName = "KeithYokoma";
        int sampleSince = 2014;
        CreditEntry.LicenseType sampleLicenseType = CreditEntry.LicenseType.APACHE_V2;

        CreditEntry credit = new CreditEntryBuilder()
                .setLibraryName(sampleLibraryName)
                .setLicenseType(sampleLicenseType)
                .setOwnerName(sampleOwnerName)
                .setSince(sampleSince)
                .build();

        assertEquals(sampleLibraryName, credit.getLibraryName());
        assertEquals(sampleLicenseType, credit.getType());
        assertEquals(sampleOwnerName, credit.getOwnerName());
        assertEquals(sampleSince, credit.getSince());
    }

    public void testRestore() {
        String sampleLibraryName = "LicenseCreditView";
        String sampleOwnerName = "KeithYokoma";
        int sampleSince = 2014;
        CreditEntry.LicenseType sampleLicenseType = CreditEntry.LicenseType.APACHE_V2;

        CreditEntry expect = new CreditEntry(
                sampleLibraryName, sampleOwnerName, sampleSince, sampleLicenseType
        );

        try {
            CreditEntry restoredCredit = restore(expect);

            assertEquals(expect.getLibraryName(), restoredCredit.getLibraryName());
            assertEquals(expect.getOwnerName(), restoredCredit.getOwnerName());
            assertEquals(expect.getSince(), restoredCredit.getSince());
            assertEquals(expect.getType(), restoredCredit.getType());
        } catch (Exception e) {
            Log.e(LOG_TAG, "Can't restore CreditEntry object.", e);
        }
    }

    private CreditEntry restore(CreditEntry credit) throws Exception {
        Parcel parcel = Parcel.obtain();

        credit.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);

        CreditEntry restoredCredit = CreditEntry.CREATOR.createFromParcel(parcel);
        if (restoredCredit == null) {
            throw new NullPointerException();
        }

        return restoredCredit;
    }

}
