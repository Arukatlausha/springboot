package com.Ust.Online_Ticket_booking.controller;

import com.Ust.Online_Ticket_booking.model.TrainTicketBooking;
import com.Ust.Online_Ticket_booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainticket")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @PostMapping("/addBooking")
    public TrainTicketBooking addBooking(@RequestBody TrainTicketBooking trainTicketBooking){
        return bookingService.addBooking(trainTicketBooking);

    }
    @PostMapping("/addBookings")
    public List<TrainTicketBooking> addBookings(@RequestBody List<TrainTicketBooking> trainTicketBookings){
        return bookingService.addBookings(trainTicketBookings);
    }
    @GetMapping("/listbookings")
    public List<TrainTicketBooking> listBookings(){
        return bookingService.listBookings();
    }
    @GetMapping("/getbooking/{id}")
    public TrainTicketBooking getBooking(@PathVariable int id){
        return bookingService.getBooking(id);
    }
    @DeleteMapping("/deletebooking/{id}")
    public String deleteBooking(@PathVariable int id){
        return bookingService.deleteBooking(id);
    }
    @PutMapping("/updatebooking/{id}")
    public TrainTicketBooking updateBooking(@PathVariable int id,@RequestBody TrainTicketBooking trainTicketBooking){
        return bookingService.updateBooking(id,trainTicketBooking);
    }




}
