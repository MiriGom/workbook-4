package com.pluralsight;

import java.time.LocalDate;

public class Reservation {
    private String guestName;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean confirmed;
    private String roomType;
    private double roomPrice;
    private int numberOfNights;
    private boolean weekend;

    Reservation(String roomType, double roomPrice, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getRoomPrice(){
        if (roomType == "king") {
            roomPrice = 139.00;
        } else if (roomType == "double") {
            roomPrice = 124.00;
        }
        return roomPrice;
    }
    public void setRoomPrice(double roomPrice){
        this.roomPrice = roomPrice;
    }
    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public void isWeekend(){
        this.weekend = true;
    }
    public void setIsWeekend( boolean isWeekend){

    }
    public void getReservationTotal(){
        return ;
    }


}
