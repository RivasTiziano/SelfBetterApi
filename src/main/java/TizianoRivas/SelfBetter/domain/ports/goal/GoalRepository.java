package TizianoRivas.SelfBetter.domain.ports.goal;

import org.springframework.data.mongodb.repository.MongoRepository;

import TizianoRivas.SelfBetter.domain.models.Goal;


public interface GoalRepository extends MongoRepository<Goal, String> {

}

