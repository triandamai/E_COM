package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Frag_Foto_kucing;
import fragment.Frag_Foto_kucing1;

public class Adapter_Foto_Kucing_viewpager extends FragmentStatePagerAdapter {
    public Adapter_Foto_Kucing_viewpager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Frag_Foto_kucing tab1 = new Frag_Foto_kucing();
                return tab1;
            case 1:
                Frag_Foto_kucing1 tab2 = new Frag_Foto_kucing1();
                return tab2;
            case 2:
                Frag_Foto_kucing tab3 = new Frag_Foto_kucing();
                return tab3;
            case 3:
                Frag_Foto_kucing1 tab4 = new Frag_Foto_kucing1();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
