package pl.wsb.students.repository.impl;

import pl.wsb.students.model.MovieComments;
import pl.wsb.students.repository.AbstractRepository;

public class MovieCommentsRepository extends AbstractRepository<MovieComments, Integer> {

    @Override
    protected  Class<MovieComments> getPersistentClass() {
        return MovieComments.class;
    }

}
