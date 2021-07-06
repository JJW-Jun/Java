package jpql.item;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;


@Embeddable
public class Period {

    // Period:
    private LocalDateTime startDate;
    private LocalDateTime endDate;


    protected Period() {
    }


    public Period(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}