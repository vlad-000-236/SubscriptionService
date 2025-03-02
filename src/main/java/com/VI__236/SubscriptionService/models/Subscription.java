package com.VI__236.SubscriptionService.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;


@Entity
@Data
@Table(name = "subscription")
@Component
public class Subscription {

    public Subscription() {
    }

    public Subscription(Long id, String serviceName, User user) {
        this.id = id;
        this.serviceName = serviceName;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String serviceName; // Название сервиса (YouTube Premium, Netflix и т.д.)

    /*@ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id", nullable = false)*/
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
