package TizianoRivas.SelfBetter.domain.ports.goal;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TizianoRivas.SelfBetter.adapters.api.goal.dto.GoalRequestDto;
import TizianoRivas.SelfBetter.domain.models.Goal;
import jakarta.annotation.PreDestroy;

@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    //Drops all the Documents for the collection before the server stop running
    @PreDestroy
    public void cleanup() {
        goalRepository.deleteAll();
    }


    public void createGoal(GoalRequestDto request){
        Goal goal = new Goal();
        goal.setTitle(request.getTitle());
        goal.setHabit(request.getHabit());
        goal.setAlertDelay(request.getAlertDelay());
        goal.setCreatedDate(LocalDateTime.now().minus(3, ChronoUnit.HOURS)); //This substract 3 hours to adapt to Argentina time zone

        
        goalRepository.insert(goal);

        
    }



}