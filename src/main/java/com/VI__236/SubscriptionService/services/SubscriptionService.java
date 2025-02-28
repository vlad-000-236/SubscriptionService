package com.VI__236.SubscriptionService.services;

import com.VI__236.SubscriptionService.models.Subscription;
import com.VI__236.SubscriptionService.models.User;
import com.VI__236.SubscriptionService.repositories.SubscriptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class SubscriptionService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription addSubscription(Long userId, String serviceName) {
        User user = new User();
        user.setId(userId);
        Subscription subscription = new Subscription();
        subscription.setServiceName(serviceName);
        subscription.setUser(user);
        return subscriptionRepository.save(subscription);
    }

    public List<Subscription> getSubscriptionsByUserId(Long userId) {
        return subscriptionRepository.findByUserId(userId);
    }

    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    public List<Subscription> getTop3Subscriptions() {
        return subscriptionRepository.findTop3ByOrderByServiceNameAsc();
    }
}
