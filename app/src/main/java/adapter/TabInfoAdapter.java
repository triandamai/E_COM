package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.info_kucing;


/**
 * Created by wolfsoft3 on 24/7/18.
 */

public class TabInfoAdapter extends FragmentPagerAdapter {
    int numoftabs;

    public TabInfoAdapter(FragmentManager fm, int  mnumoftabs ) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                info_kucing tab1 = new info_kucing();
                return tab1;

            case 1:
                info_kucing tab2 = new info_kucing();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
            return numoftabs;
    }
}
