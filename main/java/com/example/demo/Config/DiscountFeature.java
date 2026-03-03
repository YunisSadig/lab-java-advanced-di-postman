package com.example.demo.Config;


import com.example.demo.Service.EarlyBirdDiscountServiceImpl;
import com.example.demo.Service.EarlyBirdDiscountService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscountFeature {

    @Bean
    @ConditionalOnProperty(
            name = "feature.earlybird.enabled",
            havingValue = "true"
    )
    public EarlyBirdDiscountService earlyBirdDiscountService(){
        return new EarlyBirdDiscountServiceImpl();
    }
}
