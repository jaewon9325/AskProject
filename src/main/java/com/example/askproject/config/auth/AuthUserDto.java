package com.example.askproject.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.askproject.Model.DTO.UserDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthUserDto implements UserDetails{
    private UserDTO userDTO;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return userDTO.getUserRole();
            }
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return userDTO.getUserPassword();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return userDTO.getUserId();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

    
    
}
