package pl.marcingorski.tourguidegliwice;


import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class PageAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;


    public PageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new InterestingFragment ();
        } else if (position == 1){
            return new PlaygroundsFragment ();
        } else if (position == 2) {
            return new HotelsFragment ();
        } else {
            return new FoodFragment ();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_interesting);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_playgrounds);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_hotels);
        } else {
            return mContext.getString(R.string.tab_food);
        }
    }
}
