package com.example.notification.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    @RabbitListener(queues = "TransactionQueue")
    public void receiveMessage(String message) {
        // Proses pesan dan kirimkan notifikasi
        System.out.println("Received transaction message: " + message);
        // Implementasi logika notifikasi di sini
        sendNotification(message);
    }

    private void sendNotification(String message) {
        // Implementasi pengiriman notifikasi (misal via email atau SMS)
        System.out.println("Sending notification: " + message);
    }
}
