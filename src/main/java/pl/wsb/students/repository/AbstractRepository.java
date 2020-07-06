package pl.wsb.students.repository;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractRepository <T, ID extends Serializable> implements  IRepository<T, ID> {

    @Override
    public T merge(T entity) {
        return EntityManagerHelper.entityManager().merge(entity);
    }

    @Override
    public void delete(T entity) {
        if (entity != null) {
            EntityManagerHelper.entityManager().remove(entity);
        }
    }

    @Override
    public T find(ID id) {
        return EntityManagerHelper.entityManager().find(getPersistentClass(), id);

    }

    protected T getFirstResultOrNull(List<T> results) {
        if (results == null) {
            return null;
        }
        if (results.isEmpty()) {
            return null;
        }
        return results.get(0);
    }

    protected  abstract  Class<T> getPersistentClass();

}
