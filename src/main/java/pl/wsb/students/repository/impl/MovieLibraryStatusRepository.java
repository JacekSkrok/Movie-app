package pl.wsb.students.repository.impl;

import pl.wsb.students.model.MovieLibraryStatus;
import pl.wsb.students.repository.AbstractRepository;

public class MovieLibraryStatusRepository extends AbstractRepository<MovieLibraryStatus, Integer> {

    @Override
    protected  Class<MovieLibraryStatus> getPersistentClass() {
        return MovieLibraryStatus.class;
    }

}
