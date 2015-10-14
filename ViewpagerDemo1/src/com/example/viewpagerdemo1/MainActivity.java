package com.example.viewpagerdemo1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends Activity {

	private ViewPager mViewPager;
	private List<View> mViews;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mViewPager = (ViewPager) findViewById(R.id.vp_main);
		//mViewPager=new ArrayList<E>();
	}

	class AdpViewPager extends PagerAdapter {
		List<View> viewlist;

		AdpViewPager(List<View> list) {
			viewlist = list;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return viewlist.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

	}
}
