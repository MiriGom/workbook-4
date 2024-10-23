package com.pluralsight;

import java.time.LocalDate;

public class Reservation {
    private String guestName;
    private Room room;
    //private LocalDate checkInDate;
    //private LocalDate checkOutDate;
    private int numberOfNights;
    private boolean weekend;
    //private

    Reservation(String guestName, Room room, int numberOfNights, boolean weekend) {
        this.guestName = guestName;
        this.room = room;
        //this.checkInDate = checkInDate;
        //this.checkOutDate = checkOutDate;
        //this.roomPrice = room;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

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

    @Override
    public String toString() {
        return "Reservation{" +
                "guestName='" + guestName + '\'' +
                ", room=" + room +
              //  ", checkInDate=" + checkInDate +
              //  ", checkOutDate=" + checkOutDate +
              //  ", confirmed=" + confirmed +
                ", roomPrice=" + room.getPrice() +
                ", numberOfNights=" + numberOfNights +
                ", weekend=" + weekend +
                '}';
    }
}
