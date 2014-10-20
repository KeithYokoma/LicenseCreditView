LicenseCreditView
=================

Utility view for creating a simple credit for acknowledgement of the library license.

## Usage

Put a view, and add credits by java program.

```xml
<jp.yokomark.widget.license.LicenseCreditView
    android:id="@+id/list_credits"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

```java
public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LicenseCreditView credits = (LicenseCreditView) findViewById(R.id.list_credits);
        credits.addCredit(new CreditEntry("AutoValidationEditText", "KeithYokoma", 2014, CreditEntry.LicenseType.APACHE_V2));
        credits.addCredit(new CreditEntry("Proton", "hnakagawa", 2011, CreditEntry.LicenseType.APACHE_V2));
        credits.addCredit(new CreditEntry("Picasso", "Square, Inc.", 2013, CreditEntry.LicenseType.APACHE_V2));
    }
}

```

## Sample Application

Sample app is available [here](https://deploygate.com/distributions/31a4a4398e40ec62ec5b5e65f3353d699827da30).

## Download

Via gradle

```
repositories {
    mavenCentral()
    maven { url 'https://raw.github.com/KeithYokoma/LicenseCreditView/master/repository/' }
}
android {
    dependencies {
        compile 'com.github.keithyokoma:LicenseCreditView:1.0.0'
    }
}
```

## License

```
Copyright (C) 2014 KeithYokoma. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
