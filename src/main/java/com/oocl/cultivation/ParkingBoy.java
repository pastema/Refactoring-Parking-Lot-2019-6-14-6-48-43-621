package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private  String provideParkingTicketMessage = "Please provide your parking ticket.";
    private  String validTicketMessage = "Unrecognized parking ticket.";

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        return parkingLot.addCar(car);
    }

    public Car fetch(ParkingTicket ticket) {
        return parkingLot.getCar(ticket);
    }

    public String IsValidTicket(ParkingTicket parkingTicket, ParkingLot parkingLot) {
        if(parkingTicket == null){
            return provideParkingTicketMessage;
        }
        else if(parkingLot.IsValidTicket(parkingTicket) == null) {
            return validTicketMessage;
        }
        return "";
    }
}