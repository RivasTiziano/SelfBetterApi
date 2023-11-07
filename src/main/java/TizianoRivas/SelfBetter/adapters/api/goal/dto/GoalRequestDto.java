package TizianoRivas.SelfBetter.adapters.api.goal.dto;

import lombok.Data;

@Data
public class GoalRequestDto {
    private String title;
    private String habit;
    private Integer alertDelay;
}