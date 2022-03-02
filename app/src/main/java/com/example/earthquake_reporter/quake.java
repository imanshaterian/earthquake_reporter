package com.example.earthquake_reporter;

public class quake {

    String time, location, city, date, mag;

    public quake(String time, String location, String city, String date, String mag) {
        this.time = time;
        this.location = location;
        this.city = city;
        this.date = date;
        this.mag = mag;


        }
    public String getTime(){
        return time;
    }

    public String getmag(){
        return mag;
    }

    public String getdate(){
        return date;
    }

    public String getcity(){
        return city;
    }

    public String getlocation(){
        return location;
    }
}


