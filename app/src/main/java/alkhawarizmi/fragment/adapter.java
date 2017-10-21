package alkhawarizmi.fragment;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


/**
 * Created by Alhawarizmi on 10/22/2017.
 */

public class adapter extends PagerAdapter {
    private int[] image_res = {
            R.drawable.hal_100, R.drawable.hal_99, R.drawable.hal_98, R.drawable.hal_97,R.drawable.hal_96, R.drawable.hal_95, R.drawable.hal_94, R.drawable.hal_93, R.drawable.hal_92, R.drawable.hal_91,
            R.drawable.hal_90, R.drawable.hal_89, R.drawable.hal_88, R.drawable.hal_87,R.drawable.hal_86, R.drawable.hal_85, R.drawable.hal_84, R.drawable.hal_83, R.drawable.hal_82, R.drawable.hal_81,
            R.drawable.hal_80, R.drawable.hal_79, R.drawable.hal_78, R.drawable.hal_77,R.drawable.hal_76, R.drawable.hal_75, R.drawable.hal_74, R.drawable.hal_73, R.drawable.hal_72, R.drawable.hal_71,
            R.drawable.hal_70, R.drawable.hal_69, R.drawable.hal_68, R.drawable.hal_67,R.drawable.hal_66, R.drawable.hal_65, R.drawable.hal_64, R.drawable.hal_63, R.drawable.hal_62, R.drawable.hal_61,
            R.drawable.hal_60, R.drawable.hal_59, R.drawable.hal_58, R.drawable.hal_57,R.drawable.hal_56, R.drawable.hal_55, R.drawable.hal_54, R.drawable.hal_53, R.drawable.hal_52, R.drawable.hal_51,
            R.drawable.hal_50, R.drawable.hal_49, R.drawable.hal_48, R.drawable.hal_47,R.drawable.hal_46, R.drawable.hal_45, R.drawable.hal_44, R.drawable.hal_43, R.drawable.hal_42, R.drawable.hal_41,
            R.drawable.hal_40, R.drawable.hal_39, R.drawable.hal_38, R.drawable.hal_37,R.drawable.hal_36, R.drawable.hal_35, R.drawable.hal_34, R.drawable.hal_33, R.drawable.hal_32, R.drawable.hal_31,
            R.drawable.hal_30, R.drawable.hal_29, R.drawable.hal_28, R.drawable.hal_27,R.drawable.hal_26, R.drawable.hal_25, R.drawable.hal_24, R.drawable.hal_23, R.drawable.hal_22, R.drawable.hal_21,
            R.drawable.hal_20, R.drawable.hal_19, R.drawable.hal_18, R.drawable.hal_17,R.drawable.hal_16, R.drawable.hal_15, R.drawable.hal_14, R.drawable.hal_13, R.drawable.hal_12, R.drawable.hal_11,
            R.drawable.hal_10, R.drawable.hal_9, R.drawable.hal_8, R.drawable.hal_7,R.drawable.hal_6, R.drawable.hal_5, R.drawable.hal_4, R.drawable.hal_3, R.drawable.hal_2, R.drawable.hal_1} ;
    private Context context;
    private LayoutInflater inflater;

    public adapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return image_res.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       // context.requestWindowFeature(Window.FEATURE_NO_TITLE);
       // context.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View item = inflater.inflate(R.layout.image_slide, container, false);
        ImageView img = (ImageView) item.findViewById(R.id.imgView);
        img.setImageResource(image_res[position]);
        container.addView(item);
        return item;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
