package com.VI__236.SubscriptionService.repositories;

import com.VI__236.SubscriptionService.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    List<Subscription> findByUserId(Long userId);
    List<Subscription> findTop3ByOrderByServiceNameAsc();
}