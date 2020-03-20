package com.mdev.user;

import java.util.Collection;

/**
 * Created by Giuseppe on 20/03/2020.
 * <p>
 * Common interface to represent a user.
 */
public interface User {

    /**
     * @return the password.
     */
    String getPassword();

    /**
     * @param password the password.
     */
    void setPassword(String password);

    /**
     * @return the username.
     */
    String getUsername();

    /**
     * @param username the username.
     */
    void setUsername(String username);

    /**
     * @return true if account is not expired, otherwise false.
     */
    boolean isAccountNonExpired();

    /**
     * @param accountNonExpired value for accountNonExpired.
     */
    void setAccountNonExpired(boolean accountNonExpired);

    /**
     * @return true if account is not locked, otherwise false.
     */
    boolean isAccountNonLocked();

    /**
     * @param accountNonLocked value for accountNonLocked.
     */
    void setAccountNonLocked(boolean accountNonLocked);

    /**
     * @return true if credentials are not expired, otherwise false.
     */
    boolean isCredentialsNonExpired();

    /**
     * @param credentialsNonExpired value for credentialsNonExpireds.
     */
    void setCredentialsNonExpired(boolean credentialsNonExpired);

    /**
     * @return true if user is enabled, otherwise false.
     */
    boolean isEnabled();

    /**
     * @param enabled value for enabled.
     */
    void setEnabled(boolean enabled);

    /**
     * @return the permissions.
     */
    Collection<? extends Permission> getPermissions();

    /**
     * @param permissions value for permissions.
     */
    void setPermissions(Collection<? extends Permission> permissions);

}
