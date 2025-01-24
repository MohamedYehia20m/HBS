package com.example.paymentservice.controller;

import com.example.paymentservice.model.Payment;
import com.example.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> processPayment(@RequestBody Payment payment) {
        return ResponseEntity.ok(paymentService.processPayment(payment));
    }



    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id) {
        return ResponseEntity.ok(paymentService.getPayment(id));

    }
}
