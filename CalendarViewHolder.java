package com.example.therapycalendar;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDate;
import java.util.ArrayList;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    private final ArrayList<LocalDate> days;
    public final View parentView;
    public final TextView dayOfMonth;
    private final CalendarAdapter.OnItemListener onItemListener;
    public CalendarViewHolder(@NonNull View itemView, CalendarAdapter.OnItemListener onItemListener, ArrayList<LocalDate> days)
    {
        super(itemView);
        parentView = itemView.findViewById(R.id.parentView);
        dayOfMonth = itemView.findViewById(R.id.cellDayText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this);
        this.days = days;
    } //to display the calendar views when the client opens
    //the app or scrolls to another month, week or day and
    //how it should change when interacted with

    @Override
    public void onClick(View view)
    {
        onItemListener.onItemClick(getAdapterPosition(), days.get(getAdapterPosition()));
    } //to retrieve the adapter, which binds calendar views with the data they request
}
