package com.genuss.oldies_genuss;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21/02/2016.
 */
public class Categories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view);
        RecyclerView mRecyclerV = (RecyclerView)findViewById(R.id.cardList);
        mRecyclerV.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerV.setLayoutManager(llm);

        ServicesAdapter sa = new ServicesAdapter(createList(4),Categories.this.getBaseContext());

        mRecyclerV.setAdapter(sa);
    }

    private List<ServiceInfo> createList(int size) {

        List<ServiceInfo> result = new ArrayList<ServiceInfo>();

        ServiceInfo ci = new ServiceInfo();
        ci.name = ServiceInfo.NAME_PREFIX1 ;
        ci.data = ServiceInfo.DATA_PREFIX2 ;
        result.add(ci);
        ci.name = ServiceInfo.NAME_2;
        ci.data = ServiceInfo.DATA_2;
        result.add(ci);
        ci.name = ServiceInfo.NAME_3;
        ci.data = ServiceInfo.DATA_3;
        result.add(ci);
        ci.name = ServiceInfo.NAME_4;
        ci.data = ServiceInfo.DATA_4;
        result.add(ci);


        return result;
    }

}
