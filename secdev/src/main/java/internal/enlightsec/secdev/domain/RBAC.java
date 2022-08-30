/*
 * 
 */
package internal.enlightsec.secdev.domain;


import java.util.ArrayList;
import java.util.Collection;

import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.enums.RBACPermissionSet;
import internal.enlightsec.secdev.security.RBACPermissionContainer;

public class RBAC {
    private User user;
    private Collection<RBACPermissionContainer> permissionContainer;


    RBAC(User user, Collection<RBACPermissionContainer> permissionContainer) {
        this.user = user;
        this.permissionContainer = permissionContainer;

    }
}