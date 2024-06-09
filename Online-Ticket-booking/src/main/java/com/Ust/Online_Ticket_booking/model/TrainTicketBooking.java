package com.Ust.Online_Ticket_booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrainTicketBooking {
    @Id
    @GeneratedValue
    private int id;
    private String trainName;
    private String trainSource;
    private String trainDestination;
    private String trainDepartureTime;
    private String trainArrivalTime;
    private String trainPrice;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private String userCity;
    private String userState;
    private String userCountry;
    private String userZip;
    private String userGender;
    private String userAge;
    private String userPassword;


}
