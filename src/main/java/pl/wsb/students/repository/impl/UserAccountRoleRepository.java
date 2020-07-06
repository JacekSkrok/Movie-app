package pl.wsb.students.repository.impl;

import pl.wsb.students.exceptions.ValidationException;
import pl.wsb.students.model.Role;
import pl.wsb.students.model.UserAccount;
import pl.wsb.students.model.UserAccountRole;
import pl.wsb.students.repository.AbstractRepository;

import java.sql.Timestamp;
import java.util.Date;

public class UserAccountRoleRepository extends AbstractRepository<UserAccountRole, Integer> {

    @Override
    protected  Class<UserAccountRole> getPersistentClass() {
        return UserAccountRole.class;
    }

    public void assignUserToRole(UserAccount userAccount, Role role) throws ValidationException {
        if (role == null) {
            throw new ValidationException("role");
        }
        if (userAccount == null) {
            throw new ValidationException("user account");
        }
        UserAccountRole userAccountRole = new UserAccountRole();
        userAccountRole.setCreated((Timestamp) new Date());
        userAccount.setCreated((Timestamp) new Date());
        userAccount.setModified((Timestamp) new Date());
    }

}
