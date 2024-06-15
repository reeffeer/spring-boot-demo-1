package com.example.springbootdemo1.service;

import com.example.springbootdemo1.model.PaymentDetails;
import com.example.springbootdemo1.exception.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void processPayment(PaymentDetails paymentDetails) {
        if (paymentDetails.getAmount() <= 0 || paymentDetails == null) {
            throw new NotEnoughMoneyException();
        }
    }
}
