package pl.wsb.students.repository.impl;

import pl.wsb.students.model.MovieGenre;
import pl.wsb.students.repository.AbstractRepository;

public class MovieGenreRepository extends AbstractRepository<MovieGenre, Integer> {

    @Override
    protected  Class<MovieGenre> getPersistentClass() {
        return MovieGenre.class;
    }

}
