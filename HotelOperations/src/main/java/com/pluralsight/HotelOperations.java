package com.pluralsight;
import java.util.ArrayList;

public class HotelOperations {
    public static void main(String[] args){
        //create the list of Rooms.
        ArrayList<Room> hotelRooms = new ArrayList<>();
        hotelRooms.add(new Room(2, 100.50, false, false, true));
        hotelRooms.add(new Room(4, 160.00, false, false, true));
        hotelRooms.add(new Room(6, 210.00, false, false, true));
        hotelRooms.add(new Room(10, 600.00, false, false, true));

        //checking if prints list of rooms
         System.out.println("List of rooms");
        for (Room room: hotelRooms) {
            System.out.println(room);
        }
        //occupy the first Room
        Room room1 = hotelRooms.get(0);
        room1.occupy();
        System.out.println("\nAfter occupying room 1:");
        System.out.println("Room 1: available? " + room1.isAvailable());
        System.out.println(room1);

        //vacate the room
        room1.vacate();
        System.out.println("\nAfter vacating room 1:");
        System.out.println("Room 1: available? " + room1.isAvailable());
        System.out.println(room1);

        //clean room and check availability
        room1.cleanUp();
        System.out.println("\nAfter Cleaning room 1:");
        System.out.println("Room 1: available?" + room1.isAvailable());
        System.out.println(room1);
    }

}