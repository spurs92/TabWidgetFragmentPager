package com.spurs.tabwidgetfragmentpager;

import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;

    ViewPager pager;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost=(FragmentTabHost) findViewById(android.R.id.tabhost);

        //탭버튼(TabSpec) 추가작업을 위한 셋업메소드
        tabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("PAGE1"),DummyFragment.class,null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("PAGE2"),DummyFragment.class,null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("PAGE3"),DummyFragment.class,null);

        /////////////////////////////////////////////////////////////////뷰페이져 생성
        pager=(ViewPager)findViewById(R.id.pager);
        adapter=new MyAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


        ////////////////////////////////////////////////////////////////////탭클릭했을때
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if(tabId.equals("tab1")){
                    pager.setCurrentItem(0,true);
                }else if(tabId.equals("tab2")){
                    pager.setCurrentItem(1,true);
                }else if(tabId.equals("tab3")){
                    pager.setCurrentItem(2,true);
                }
            }
        });

        /////////////////////////////////////////////////////////////////뷰 페이지 바뀔때 탭 변경
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabHost.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
