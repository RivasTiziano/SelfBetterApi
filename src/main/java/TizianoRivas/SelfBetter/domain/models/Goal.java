package TizianoRivas.SelfBetter.domain.models;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Goals")
public class Goal {

    private String title;

    private String habit;

    private Integer alertDelay;

    private LocalDateTime createdDate;
    
}
