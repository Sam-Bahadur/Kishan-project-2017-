package com.example.madhu.kishann;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private int position;
    // private SectionPagerAdapter mSectionPagerAdapter;
    //TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // tv=(TextView)findViewById(R.id.textView9);
        //loadText();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
//if(id==R.id.nav_home){
//
//}
        if (id == R.id.forum) {
   Intent i=new Intent(this,MainActivity.class);
          // w Intent(Intent.ACTION_VIEW, Uri.parse("http://kisanforum.boards.net/board/1/general-discussion")); Intent i = ne
            startActivity(i);
            // Handle the camera action


        } else if (id == R.id.nav_contactus) {
    Intent i = new Intent(this, ContactUs.class);
    startActivity(i);
    // Handle the camera action
}
        else if (id == R.id.photo) {
            Intent i = new Intent(this, Photogallery.class);
            startActivity(i);
        } else if (id == R.id.logout) {
            //Intent i = new Intent(this, MainActivity.class);
           // startActivity(i);
            finish();
        }
else if (id == R.id.video) {
    Intent i = new Intent(this, videogallary.class);
    startActivity(i);


}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    /* public void loadText(){
          String s="विश्वको जनसङ्ख्याको आधा अर्थात् साढे तीन अर्ब मानिसको \nमुख्य " +
                  "खाना नै चामल हो । नब्बे ९० प्रतिशत धान एसियामै \nउत्पादन हुने गर्छ ।" +
                  " उत्पादनको आधा एसियामै \nखपत हुने गरेको छ ।" +
                  "नेपालको कुल गार्हस्थ\n उत्पादनमा २९.४ प्रतिशत योगदान कृषि\n क्षेत्रको छ ।" +
                  " कृषिमा ६०.४ प्रतिशत जनसङ्ख्या आश्रित \nछन् । कृषि गार्हस्थ उत्पादनमा धानको योगदान २०\n प्रतिशत रहेको कृषि विकास मन्त्रालयले जनाएको छ ।\n हाल नेपालमा १५ लाख ५२ हजार हेक्टरमा धान खेती भइरहेको \nछ । खेती गरिने ५०.२ प्रतिशत जमिनमा धान खेती हुने गरेको छ ।" +
                  "\nमौसमका आधारमा चैते, बर्खे, भदैया, घैया, हिउँदे (बोरो)\n धानको खेती हुन्छ । मनाङ र मुस्ताङबाहेक ७३ जिल्लामा \nधान खेती हुन्छ । तराई, मध्य पहाड र उच्च पहाडमा \nनेपाल कृषि अनुसन्धान परिषद्ले विकास गरेको ६३ जातका \nधानको खेती गरिन्छ ।\n" +
                  "";
          tv.setMovementMethod(new ScrollingMovementMethod());
          tv.setText(s);
      }*/
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override

        public Fragment getItem(int position) {
            switch (position) {

                case 0:
                    Rog tab2 = new Rog();
                    return tab2;

                case 1:
                    parkaar tab3 = new parkaar();
                    return tab3;


                default:
                    return null;
            }
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
//                case 0:
//                    return "गृह पृष्ठ";
                case 0:
                    return "रोग ";
                case 1:
                    return "प्रकार ";
            }
            return null;
        }
    }
}
