package jp.yokomark.widget.license.licensecreditview.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import jp.yokomark.widget.license.CreditEntry;
import jp.yokomark.widget.license.LicenseCreditView;
import jp.yokomark.widget.license.OpenSourceLicense;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LicenseCreditView credits = (LicenseCreditView) findViewById(R.id.list_credits);
        credits.addCredit(new CreditEntry("AutoValidationEditText", "KeithYokoma", 2014, OpenSourceLicense.APACHE_V2));
        credits.addCredit(new CreditEntry("Proton", "hnakagawa", 2011, OpenSourceLicense.APACHE_V2));
        credits.addCredit(new CreditEntry("Picasso", "Square, Inc.", 2013, OpenSourceLicense.APACHE_V2));
    }
}
