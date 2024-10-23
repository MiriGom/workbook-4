package com.pluralsight;
import java.time.LocalDate;
import java.util.ArrayList;

public class HotelOperations {
    public static void main(String[] args){

        //create the list of Rooms.
        ArrayList<Room> hotelRooms = new ArrayList<>();
        hotelRooms.add(new Room(4, "king",false, false, true));
        hotelRooms.add(new Room(2, "double", false, false, true));
        hotelRooms.add(new Room(4, "king", false, false, true));
        hotelRooms.add(new Room(2, "double", false, false, true));

        //checking if prints list of rooms
         System.out.println("List of rooms");
        for (Room room: hotelRooms) {
            System.out.println(room);
        }
        //occupy the first Room
        Room room1 = hotelRooms.get(0);
        room1.checkIn();
        System.out.println("\nAfter occupying room 1:");
        System.out.println("Room 1: available? " + room1.isAvailable());
        System.out.println(room1);

        //vacate the room
        room1.checkOut();
        System.out.println("\nAfter vacating room 1:");
        System.out.println("Room 1: available? " + room1.isAvailable());
        System.out.println(room1);

        //clean room and check availability
        room1.cleanUp();
        System.out.println("\nAfter Cleaning room 1:");
        System.out.println("Room 1: available?" + room1.isAvailable());
        System.out.println(room1);

        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(new Reservation("Miriam", room1, 4, true));
        Reservation reservation1 = reservations.get(0);
        System.out.println(reservation1);
    }

}