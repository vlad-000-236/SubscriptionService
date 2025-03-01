package com.VI__236.SubscriptionService.services;

import com.VI__236.SubscriptionService.models.User;

public interface UserService {

    public User createUser(User user);

    public User getUserById(Long id);

    public User updateUser(Long id, User userDetails);

    public void deleteUser(Long id);
}
