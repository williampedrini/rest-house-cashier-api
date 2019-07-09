package com.custodio.resthouse.cashier.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class RestHouseCashierApi
{
    public static void main(final String... args)
    {
        SpringApplication.run(RestHouseCashierApi.class, args);
    }
}
