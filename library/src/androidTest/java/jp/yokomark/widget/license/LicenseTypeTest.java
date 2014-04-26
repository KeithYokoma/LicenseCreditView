package jp.yokomark.widget.license;

import android.test.AndroidTestCase;

/**
 * @author ichigotake
 */
public class LicenseTypeTest extends AndroidTestCase {

    public void testCustomLicense() {
        CreditEntry.LicenseType sampleLicense = new MockLicenseType();
        CreditEntry credit = new CreditEntry("MyLibrary", "Yamada Taro", 2014, sampleLicense);
        assertEquals(sampleLicense.getHeaderResource(), credit.getType().getHeaderResource());
        assertEquals(sampleLicense.getBodyResource(), credit.getType().getBodyResource());
    }

    private static class MockLicenseType implements CreditEntry.LicenseType {

        @Override
        public int getHeaderResource() {
            return jp.yokomark.widget.license.test.R.string.test_license_mock_header;
        }

        @Override
        public int getBodyResource() {
            return jp.yokomark.widget.license.test.R.string.test_license_mock_content;
        }
    }
}
