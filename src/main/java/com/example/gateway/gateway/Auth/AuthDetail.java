package com.coin.portfolio.portfolio.Auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public interface AuthDetail {
    public Collection<? extends GrantedAuthority> getAuthorities();

    String getPassword();

    String getUsername();

    boolean isAccountNonExpired();

    boolean isAccountNonLocked();

    boolean isCredentialsNonExpired();

    boolean isEnabled();

}
