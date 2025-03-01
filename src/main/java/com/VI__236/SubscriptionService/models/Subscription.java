package com.VI__236.SubscriptionService.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Subscriptions")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String serviceName; // Название сервиса (YouTube Premium, Netflix и т.д.)

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id", nullable = false)
    private User user;
}
