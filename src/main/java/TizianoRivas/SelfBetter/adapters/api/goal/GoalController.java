package TizianoRivas.SelfBetter.adapters.api.goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TizianoRivas.SelfBetter.adapters.api.goal.dto.GoalRequestDto;
import TizianoRivas.SelfBetter.domain.ports.goal.GoalService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/goal")
public class GoalController {
    @Autowired private GoalService goalService;

    @PostMapping
    public String createNewGoal( @RequestBody GoalRequestDto request ) {

        goalService.createGoal(request);

        return "Meta creada";
    }
    
}
