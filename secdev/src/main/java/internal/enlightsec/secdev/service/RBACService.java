package internal.enlightsec.secdev.service;
import internal.enlightsec.*;
import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.enums.RBACCommandResults;
import internal.enlightsec.secdev.enums.RBACPermissionSet;

import java.util.ArrayList;
import java.util.Collection;

public interface RBACService {

    RBACCommandResults HasPermission(int permissionId);
    RBACCommandResults GrantPermission(int permissionId, boolean granted, User user);
    RBACCommandResults RevokePermission(int permissionId, boolean granted, User user);

}
