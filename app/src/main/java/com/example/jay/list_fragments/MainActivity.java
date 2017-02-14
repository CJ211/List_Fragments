package com.example.jay.list_fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends Activity implements
        ListFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {
// TODO Auto-generated method stub
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

       l1 layout1; //Fragment 1
       l2 layout2; //Fragment 2
       l3 layout3; //Fragment 3
       l4 layout4; //Fragment 4

        if (link.equals("layout1")) {
            layout1 = new l1();
            fragmentTransaction.replace(R.id.detailFragment, layout1);
            fragmentTransaction.commit();
        } else if (link.equals("layout2")) {
            layout2 = new l2();
            fragmentTransaction.replace(R.id.detailFragment, layout2);
            fragmentTransaction.commit();
        } else if (link.equals("layout3")) {
            layout3 = new l3();
            fragmentTransaction.replace(R.id.detailFragment, layout3);
            fragmentTransaction.commit();
        } else if (link.equals("layout4")) {
            layout4 = new l4();
            fragmentTransaction.replace(R.id.detailFragment, layout4);
            fragmentTransaction.commit();
        }
    }
}
