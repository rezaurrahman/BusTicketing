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
public class BuyTicketModel {
    
    private String slno;
    private String date;
    private String customername;
    private String contact;
    private String type;
    private String destination;
    private String time;
    private String seat;
    private String fare;
    private String payment;
    private String comment;
    private String busname;
    //private double total;

    public BuyTicketModel() {
    }

    public BuyTicketModel(String slno, String date, String customername, String contact, String type, String destination, String time, String seat, String fare, String payment, String comment, String busname, double total) {
        this.slno = slno;
        this.date = date;
        this.customername = customername;
        this.contact = contact;
        this.type = type;
        this.destination = destination;
        this.time = time;
        this.seat = seat;
        this.fare = fare;
        this.payment = payment;
        this.comment = comment;
        this.busname = busname;
        
    }

    public String getSlno() {
        return slno;
    }

    public void setSlno(String slno) {
        this.slno = slno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

   
    
    
    
}


