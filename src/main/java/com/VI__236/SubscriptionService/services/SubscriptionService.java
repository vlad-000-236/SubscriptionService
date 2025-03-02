package com.VI__236.SubscriptionService.services;

import com.VI__236.SubscriptionService.models.Subscription;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SubscriptionService {

    public Subscription addSubscription(long userId, String serviceName);

    public List<Subscription> getSubscriptionsByUserId(long userId);

    public void deleteSubscription(long id);

    public List<String> getTop3Subscriptions();
}
