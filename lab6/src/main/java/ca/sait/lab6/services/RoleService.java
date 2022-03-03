package ca.sait.lab6.services;

import ca.sait.lab6.dataaccess.RoleDB;
import ca.sait.lab6.models.Role;
import java.util.List;

/**
 *
 * @author Regan
 */
public class RoleService {
    private RoleDB roleDB = new RoleDB();

    public List<Role> getAll() throws Exception{
            List<Role> roles = this.roleDB.getAll();
            return roles;
        }
}
