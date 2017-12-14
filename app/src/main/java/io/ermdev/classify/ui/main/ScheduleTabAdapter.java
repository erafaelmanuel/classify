package io.ermdev.classify.ui.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.schedule.Schedule;
import io.ermdev.classify.data.local.schedule.ScheduleDto;

/**
 * Created by erafaelmanuel on 12/12/2017.
 */

public class ScheduleTabAdapter extends RecyclerView.Adapter<ScheduleTabAdapter.ScheduleViewHolder> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<ScheduleDto> schedules;

    public ScheduleTabAdapter(Context mContext, ArrayList<ScheduleDto> schedules) {
        this.mContext=mContext;
        this.schedules=schedules;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = mLayoutInflater.inflate(R.layout.adapter_main_schedule, parent, false);
        return new ScheduleViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ScheduleViewHolder holder, int position) {
        holder.setView(position);
    }

    @Override
    public int getItemCount() {
        return schedules.size();
    }

    class ScheduleViewHolder extends RecyclerView.ViewHolder {

        private TextView textView1;
        private TextView textView2;
        private ScheduleDto schedule = new ScheduleDto();

        public ScheduleViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
        }

        public void setView(final int position) {
            schedule = schedules.get(position);
            textView1.setText(schedule.getDay());
            textView2.setText(schedule.getRoom());
        }
    }
}
