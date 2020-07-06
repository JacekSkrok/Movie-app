package pl.wsb.students.repository.impl;

import pl.wsb.students.model.MovieActor;
import pl.wsb.students.repository.AbstractRepository;

public class MovieActorRepository extends AbstractRepository<MovieActor, Integer> {

    @Override
    protected  Class<MovieActor> getPersistentClass() {
        return MovieActor.class;
    }

}
