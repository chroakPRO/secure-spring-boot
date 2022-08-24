package internal.enlightsec.secdev.service;
import internal.enlightsec.*;
import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.enums.RBACCommandResults;
import internal.enlightsec.secdev.enums.RBACPermissionSet;

import java.util.ArrayList;
import java.util.Collection;
// this is the service class that implements the RBACService interface.
// and sends it repo
private class RBACServiceImpl implements RBACService {
    private RBACRepository repo;
    private UserService userService;
    
    @Override
    public RBACCommandResults HasPermission(int permissionId) {
        return RBACCommandResults.RBAC_OK;
    }
    @Override
    public RBACCommandResults GrantPermission(int permissionId, boolean granted, User user){
        return RBACCommandResults.RBAC_OK;
    }
    @Override
    public RBACCommandResults RevokePermission(int permissionId, boolean granted, User user){
        return RBACCommandResults.RBAC_ERROR_INVALID_ARGUMENT;
    }
}