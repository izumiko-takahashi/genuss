package com.genuss.oldies_genuss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21/02/2016.
 */
public class Categories extends Activity {
    private Button nextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view);
        nextActivity = (Button)findViewById(R.id.siguiente);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(Categories.this, Formulario.class);
                        startActivity(intent);
            }
        });
        RecyclerView mRecyclerV = (RecyclerView)findViewById(R.id.cardList);
        mRecyclerV.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerV.setLayoutManager(llm);

        ServicesAdapter sa = new ServicesAdapter(createList(8));

        mRecyclerV.setAdapter(sa);
    }

    private List<ServiceInfo> createList(int size) {

        List<ServiceInfo> result = new ArrayList<ServiceInfo>();

        ServiceInfo ci = new ServiceInfo();
        ci.name = ServiceInfo.NAME_PREFIX1 ;
        ci.data = ServiceInfo.DATA_PREFIX2 ;
        result.add(ci);
        ServiceInfo c2 = new ServiceInfo();
        c2.name = ServiceInfo.NAME_2;
        c2.data = ServiceInfo.DATA_2;
        result.add(c2);
        ServiceInfo c3 = new ServiceInfo();
        c3.name = ServiceInfo.NAME_3;
        c3.data = ServiceInfo.DATA_3;
        result.add(c3);
        ServiceInfo c4 = new ServiceInfo();
        c4.name = ServiceInfo.NAME_4;
        c4.data = ServiceInfo.DATA_4;
        result.add(c4);
        for(int j=1;j<4;j++)
        {
            result.add(c3);
        }

        return result;
    }

}
