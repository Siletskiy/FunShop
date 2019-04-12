package com.example.fun;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ProductDetailsAdapter extends FragmentPagerAdapter {

    private int totalTabs;


    public ProductDetailsAdapter(FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                ProdactDescriptonFragment prodactDescriptonFragment1 = new ProdactDescriptonFragment();
                return prodactDescriptonFragment1;


            case 1:
                ProductSpecificationFragment productSpecificationFragment = new ProductSpecificationFragment();
                return productSpecificationFragment;
            case 2:
                ProdactDescriptonFragment prodactDescriptonFragment2 = new ProdactDescriptonFragment();
                return prodactDescriptonFragment2;
            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
