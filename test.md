# Architecture & Design
## links
- [Gitbook, INFO-TALK](https://gitbook.oaksec.dev)

## Layer (`Layered Architecture`)
1. 01 Model `Just like blueprints or scha`
2. 02 Service `ABSTRACTION betwen Model and Repos.`
3. 03 Repos `this deals with actual data mapping and this is not necessarly the last layer, but it's supposed to handle stuff between domain/business layer and data mapping layer.`



## Classes
1. **RBACController** `api entrypoint`
2. **RBAC** `not sure, but some sort of decrorator that is the final object.`
3. **User** `this is the "user" that performs the requests, this class is supposed to act as the Player, here we find paramters like uuid, permission object, that contains permissioncontainerobjects`
4. **RBACPermissionContainer** `is supposed to have (id, name. permission) There is 1 container per permission. You then link all the related containers together, and holds that information within RBAC?`
5. **RBACService && RBACSericeImpl** `Is the service that actually appends and removes permission from User or Command objects, RBACService is an interface that provdides a layer of abstraction for RBACServiceImpl`


## Enums
1. **RBACCommandResults** `Enum that contains predefined CommandsResults, like RBAC_OK or RBAC_ALREADY_ADDED are a few examples.`
2. **RBACPermissionSet** `ENUM that is supposed to contain all the possible Permissions a users can have.` 