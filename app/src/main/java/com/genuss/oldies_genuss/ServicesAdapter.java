package com.genuss.oldies_genuss;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by user on 21/02/2016.
 */
public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ServicesViewFolder> {

        private List<ServiceInfo> serviceList;

        public ServicesAdapter(List<ServiceInfo> serviceList ) {
            this.serviceList = serviceList;
        }

        @Override
        public int getItemCount() {
            return serviceList.size();
        }

        @Override
        public void onBindViewHolder(ServicesViewFolder servicesViewFolder, int i) {
            ServiceInfo ci = serviceList.get(i);
            servicesViewFolder.vName.setText(ci.name);
            servicesViewFolder.vData.setText(ci.data);
        }

        @Override
        public ServicesViewFolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.
                    from(viewGroup.getContext()).
                    inflate(R.layout.activity_main, viewGroup, false);

            return new ServicesViewFolder(itemView);
        }

    public static class ServicesViewFolder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected TextView vData;
        protected ImageView vPhoto;

        public ServicesViewFolder(View v) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.textService1);
            vData = (TextView)  v.findViewById(R.id.contentService2);
            vPhoto = (ImageView) v.findViewById(R.id.image1);
        }
    }
}
