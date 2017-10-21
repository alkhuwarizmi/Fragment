package alkhawarizmi.fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
ViewPager vwPager;
    adapter adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   this.requestWindowFeature(Window.FEATURE_NO_TITLE);
     //   this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        vwPager = (ViewPager) findViewById(R.id.vwPager);
        adapt = new adapter(this);
        vwPager.setAdapter(adapt);
        vwPager.setCurrentItem(adapt.getCount() - 1);
    }
}
