package com.example.demo.Controller;

import com.example.demo.Service.EarlyBirdDiscountService;
import com.example.demo.Service.EarlyBirdDiscountServiceImpl;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class DiscountController {
    private final EarlyBirdDiscountService earlyBirdDiscountService;
    public DiscountController(EarlyBirdDiscountService earlyBirdDiscountService) {
        this.earlyBirdDiscountService=earlyBirdDiscountService;
    }

    @GetMapping("/discount")
    public String returnDiscountResult(@RequestParam LocalDate bookingDate,@RequestParam LocalDate eventDate){
         if(earlyBirdDiscountService==null){
             return "Discount Service is disabled";
         }
         return earlyBirdDiscountService.CalculateDiscount(bookingDate,eventDate);
    }

}
