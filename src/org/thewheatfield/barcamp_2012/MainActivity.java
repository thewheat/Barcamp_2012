package org.thewheatfield.barcamp_2012;
import org.apache.cordova.*;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//public class MainActivity extends Activity {
public class MainActivity extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
