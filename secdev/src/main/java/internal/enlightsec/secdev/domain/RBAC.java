/*
    class: RBAC
    
    param user: User object

    param permissionContainer: Every container has a maximum of 1 permission. The idea is to create a collection of permission and append that to a RBAC Object.

    param





 
*/

package internal.enlightsec.secdev.domain;


import java.util.ArrayList;
import java.util.Collection;

import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.enums.RBACPermissionSet;

public class RBAC {
    private User user;
    private Collection<RBACPermissionContainer> permissionContainer;


    RBAC(User user, Collection<RBACPermssionContainer> permissionContainer) {
        this.user = user;
        this.permissionContainer = permissionContainer;

    }
}