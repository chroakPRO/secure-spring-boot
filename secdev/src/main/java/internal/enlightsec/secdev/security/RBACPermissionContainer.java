/*
 * class RBACPermissionContainer: Every container has a maximum of 1 permission. The idea is to create a collection of permission and append that to a RBAC Object. 
 * 
 *  param permission: The permission that is being added to the container.
 *  param granted: True if the permission is granted, false if it is revoked.  
 *  param user: The user that is being granted or revoked the permission
 * 
 * 
 * 
 * 
 */

package internal.enlightsec.secdev.security;

import internal.enlightsec.secdev.enums.RBACPermissionSet;
import internal.enlightsec.secdev.domain.User;

public class RBACPermissionContainer {
    private RBACPermissionSet permissionSet;
    private boolean granted;
    private int permissionId;
    private User user;

    public RBACPermissionContainer(RBACPermissionSet permissionSet, boolean granted, int permissionId, User user) {
        this.permissionSet = permissionSet;
        this.granted = granted;
        this.permissionId = permissionId;
        this.user = user;
    }

    public RBACPermissionSet getPermissionSet() {
        return permissionSet;
    }
}
