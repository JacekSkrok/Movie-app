package pl.wsb.students.repository.impl;

import pl.wsb.students.model.MovieRequestStatus;
import pl.wsb.students.repository.AbstractRepository;

public class MovieRequestStatusRepository extends AbstractRepository<MovieRequestStatus, Integer> {

    @Override
    protected  Class<MovieRequestStatus> getPersistentClass() {
        return MovieRequestStatus.class;
    }

}
