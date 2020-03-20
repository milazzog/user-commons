package com.mgdev.user;

/**
 * Created by Giuseppe on 20/03/2020.
 * <p>
 * Common interface to represent a permission.
 */
public interface Permission {

    /**
     * @return the permission.
     */
    String getPermission();

    /**
     * @param permission value for permission
     */
    void setPermission(String permission);

}
