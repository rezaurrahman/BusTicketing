/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rana.Model;

/**
 *
 * @author Rana
 */
public class SeatModel {
    int slno;
    String date;
    String seat;
    String busname;
    String type;
    String destination;
    String time;
    double fare;

    public SeatModel() {
    }

    public SeatModel(int slno, String date, String seat, String busname, String type, String destination, String time, double fare) {
        this.slno = slno;
        this.date = date;
        this.seat = seat;
        this.busname = busname;
        this.type = type;
        this.destination = destination;
        this.time = time;
        this.fare = fare;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

   


       
    
}
