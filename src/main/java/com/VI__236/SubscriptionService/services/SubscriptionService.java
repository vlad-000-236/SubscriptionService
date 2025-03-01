package com.VI__236.SubscriptionService.services;

import com.VI__236.SubscriptionService.models.Subscription;

import java.util.List;

public interface SubscriptionService {

    public Subscription addSubscription(Long userId, String serviceName);

    public List<Subscription> getSubscriptionsByUserId(Long userId);

    public void deleteSubscription(Long id);

    public List<String> getTop3Subscriptions();
}
