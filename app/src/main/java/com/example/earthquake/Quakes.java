package com.example.earthquake;

public class Quakes {
    private String magnitude;
    private String place;
    private String date;

    /**
     * constructor
     * @param magnitude for the magnitude
     * @param place for the place of occurrence
     * @param date and the date of occurrence
     */
    public Quakes(String magnitude, String place, String date) {
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
    }

    /**
     * getters for magnitude, place and date
     *
     */

    public String getMagnitude() {
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }

    //to string method for the class

    @Override
    public String toString() {
        return "Quakes{" +
                "magnitude='" + magnitude + '\'' +
                ", place='" + place + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
