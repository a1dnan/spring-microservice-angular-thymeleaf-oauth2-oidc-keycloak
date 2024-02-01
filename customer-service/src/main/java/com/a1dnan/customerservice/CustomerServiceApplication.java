package com.a1dnan.customerservice;

import com.a1dnan.customerservice.entities.Customer;
import com.a1dnan.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("Adnan")
                            .email("adnan@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Mohamed")
                    .email("med@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Issam")
                    .email("issam@gmail.com")
                    .build());
        };
    }
}
