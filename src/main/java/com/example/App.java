package com.example;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner {
    @Autowired // DI컨테이너가 엔트리 포인트에 서비스를 주입한다.
    CustomerService customerService;

    @Override
    public void run(String... strings) throws Exception {
        customerService.save(new Customer(1, "A", "AA"));
        customerService.save(new Customer(2, "B", "BB"));
        customerService.save(new Customer(3, "C", "CC"));

        // customerService.findAll().forEach(System.out::println);
        List<Customer> customerList = customerService.findAll();
        for(Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
