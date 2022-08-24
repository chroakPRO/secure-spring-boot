package internal.enlightsec.secdev.domain;


import java.util.ArrayList;
import java.util.Collection;

import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.enums.RBACPermissionSet;

public class RBAC {
    private User user;
    private Collection<RBACPermissionSet> permissionSet;
    private Collection<RBACPermissionContainer> permissionContainer;


    RBAC(User user, Collection<RBACPermissionSet> permissionSet) {
        this.user = user;
        this.permissionSet = permissionSet;

    }
}