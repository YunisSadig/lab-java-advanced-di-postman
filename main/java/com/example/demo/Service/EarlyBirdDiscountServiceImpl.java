package com.example.demo.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EarlyBirdDiscountServiceImpl implements EarlyBirdDiscountService {
    private static final int EARLY_BIRD_DAYS = 30;
    private static final double EARLY_BIRD_DISCOUNT = 0.15;

    @Override
    public String CalculateDiscount(LocalDate bookingDate,LocalDate eventDate){
        if (bookingDate == null || eventDate == null) {
            return "Booking date and event date cannot be null.";
        }
        long daysBetween = ChronoUnit.DAYS.between(bookingDate, eventDate);

        if(daysBetween>=EARLY_BIRD_DAYS){
            return "Early bird discount applied"+(EARLY_BIRD_DISCOUNT *100) + "%";
        } else if (daysBetween > 0) {
            return "Booking made late: No discount.";
        } else {
            return "Invalid booking or dates has  passed.";
        }

    }
}