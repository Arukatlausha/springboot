package com.Ust.Online_Ticket_booking.repository;

import com.Ust.Online_Ticket_booking.model.TrainTicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<TrainTicketBooking,Integer> {
}
