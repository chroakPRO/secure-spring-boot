

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
