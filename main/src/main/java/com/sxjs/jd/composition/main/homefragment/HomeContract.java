package com.sxjs.jd.composition.main.homefragment;

import com.sxjs.jd.entities.HomeIndex;

/**
 * @author xp
 */

public interface HomeContract {
    interface View {
        void setHomeIndexData(HomeIndex find);
        void setRecommendedWares(HomeIndex find);
        void setMoreRecommendedWares(HomeIndex find);
    }

    interface Presenter {
        void getHomeIndexData(int flag);
        void getRecommendedWares();
        void getMoreRecommendedWares();
    }

}