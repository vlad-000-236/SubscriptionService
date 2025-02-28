package com.VI__236.SubscriptionService.repositories;

import com.VI__236.SubscriptionService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
