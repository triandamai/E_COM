package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.Frag_Jenis;
import fragment.Frag_Home;


/**
 * Created by wolfsoft3 on 24/7/18.
 */

public class TabAdapter extends FragmentPagerAdapter {
    int numoftabs;

    public TabAdapter(FragmentManager fm, int  mnumoftabs ) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Frag_Home tab1 = new Frag_Home();
                return tab1;

            case 1:
                        Frag_Jenis tab2 = new Frag_Jenis();
                return tab2;

            case 2:
                Frag_Home tab3 = new Frag_Home();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
            return numoftabs;
    }
}
