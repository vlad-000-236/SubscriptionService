package com.VI__236.SubscriptionService.repositories;

import com.VI__236.SubscriptionService.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> findByUserId(long userId);

    @Query("SELECT s.serviceName, COUNT(s.serviceName) as serviceCount " +
            "FROM Subscription s " +
            "GROUP BY s.serviceName " +
            "ORDER BY serviceCount DESC")
    List<Object[]> findTopByOrderByServiceName();
}