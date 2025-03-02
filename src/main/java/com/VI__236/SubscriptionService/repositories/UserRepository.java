package com.VI__236.SubscriptionService.repositories;

import com.VI__236.SubscriptionService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
