package pl.wsb.students.repository.impl;

import org.apache.commons.lang3.StringUtils;
import pl.wsb.students.model.UserAccount;
import pl.wsb.students.repository.AbstractRepository;
import pl.wsb.students.repository.EntityManagerHelper;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class UserAccountRepository extends AbstractRepository<UserAccount, Integer> {

    @Override
    protected Class<UserAccount> getPersistentClass() {
        return UserAccount.class;
    }


    public UserAccount findByEmail(String email) {
        if (StringUtils.isBlank(email)) {
            return null;
        }
        CriteriaBuilder criteriaBuilder = EntityManagerHelper.entityManager().getCriteriaBuilder();
        CriteriaQuery<UserAccount> criteriaQuery = criteriaBuilder.createQuery(UserAccount.class);
        Root<UserAccount> userAccouts = criteriaQuery.from(UserAccount.class);
        criteriaQuery.where(
                criteriaBuilder.equal(
                        criteriaBuilder.lower(
                                userAccouts.<String>get("email")
                        ),
                        email.toLowerCase())
        );
        return getFirstResultOrNull(EntityManagerHelper.entityManager().createQuery(criteriaQuery).getResultList());
    }
}




