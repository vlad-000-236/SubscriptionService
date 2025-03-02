package com.VI__236.SubscriptionService.services;

import com.VI__236.SubscriptionService.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public User createUser(User user);

    public User getUserById(long id);

    public User updateUser(long id, User userDetails);

    public void deleteUser(long id);
}
