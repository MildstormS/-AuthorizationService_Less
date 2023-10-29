package com.example.serviceathorization.repository;

import com.example.serviceathorization.controller.Authorities;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("aaa")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("ivan") && password.equals("555")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else {
            return Collections.EMPTY_LIST;
        }
        return authorities;
    }
}