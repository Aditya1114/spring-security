package com.security.JwtToken.services;

import com.security.JwtToken.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Ram", "ram@dev.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sam", "sam@dev.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ankit", "ankit@dev.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sita", "sita@dev.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}
