package com.security.demo.userservice.service;

import com.security.demo.userservice.domain.AppUser;
import com.security.demo.userservice.domain.Role;

import java.util.List;

public class UserServiceImpl implements  UserService{
    @Override
    public AppUser saveUser(AppUser user) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public AppUser getUser(String username) {
        return null;
    }

    @Override
    public List<AppUser> getUsers() {
        return null;
    }
}
