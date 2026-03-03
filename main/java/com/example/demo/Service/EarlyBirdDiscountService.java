package com.example.demo.Service;

import java.time.LocalDate;

public interface EarlyBirdDiscountService {
    String CalculateDiscount(LocalDate bookingDate,LocalDate eventDate);
}
