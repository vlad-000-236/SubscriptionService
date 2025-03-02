package com.VI__236.SubscriptionService.services;

import com.VI__236.SubscriptionService.models.Subscription;
import com.VI__236.SubscriptionService.models.User;
import com.VI__236.SubscriptionService.repositories.SubscriptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@Slf4j
public class SubscriptionServiceImplementation implements SubscriptionService{

    private SubscriptionRepository subscriptionRepository;
    private Subscription subscription;
    private User user;

    @Autowired
    public SubscriptionServiceImplementation(User user, SubscriptionRepository subscriptionRepository,
                                             Subscription subscription){
        this.user = user;
        this.subscriptionRepository = subscriptionRepository;
        this.subscription = subscription;
    }

    public Subscription addSubscription(long userId, String serviceName) {
        user.setId(userId);
        subscription.setServiceName(serviceName);
        subscription.setUser(user);
        return subscriptionRepository.save(subscription);
    }

    public List<Subscription> getSubscriptionsByUserId(long userId) {
        return subscriptionRepository.findByUserId(userId);
    }

    public void deleteSubscription(long id) {
        subscriptionRepository.deleteById(id);
    }

    public List<String> getTop3Subscriptions() {
        List<Object[]> results = subscriptionRepository.findTopByOrderByServiceName();
        //List<String> top3Subscriptions = new ArrayList<>();
        return results.stream()
                .limit(3) // Ограничиваем результат тремя записями
                .map(result -> (String) result[0]) // Извлекаем serviceName
                .toList();
    }
}
