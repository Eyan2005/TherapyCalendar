package com.example.therapycalendar;

import java.time.LocalTime;
import java.util.ArrayList;

class HourEvent
{
    LocalTime time;
    ArrayList<Event> events;

    public HourEvent(LocalTime time, ArrayList<Event> events)
    {
        this.time = time;
        this.events = events;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time)
    {
        this.time = time;
    }

    public ArrayList<Event> getEvents()
    {
        return events;
    }

    public void setEvents(ArrayList<Event> events)
    {
        this.events = events;
    }//constructor for setting the current time as the time of the event added
}
