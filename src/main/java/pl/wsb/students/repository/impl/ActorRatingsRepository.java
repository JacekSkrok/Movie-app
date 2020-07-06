package pl.wsb.students.repository.impl;

import pl.wsb.students.api.model.ActorRatings;
import pl.wsb.students.repository.AbstractRepository;

public class ActorRatingsRepository extends AbstractRepository<ActorRatings, Integer> {

    @Override
    protected  Class<ActorRatings> getPersistentClass() {
        return ActorRatings.class;
    }

}
