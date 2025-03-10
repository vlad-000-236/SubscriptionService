package com.VI__236.SubscriptionService.controllers;

import com.VI__236.SubscriptionService.models.Subscription;
import com.VI__236.SubscriptionService.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/subscriptions")
public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping
    public Subscription addSubscription(@PathVariable long userId, @RequestParam String serviceName) {
        return subscriptionService.addSubscription(userId, serviceName);
    }

    @GetMapping
    public List<Subscription> getSubscriptions(@PathVariable long userId) {
        return subscriptionService.getSubscriptionsByUserId(userId);
    }

    @DeleteMapping("/{subId}")
    public void deleteSubscription(@PathVariable long subId) {
        subscriptionService.deleteSubscription(subId);
    }

    @GetMapping("/top")
    public List<String> getTopSubscriptions() {
        return subscriptionService.getTop3Subscriptions();
    }
}
