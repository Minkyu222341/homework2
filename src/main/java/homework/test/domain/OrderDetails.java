package homework.test.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    private String shoppingAddress;
    private String shoppingType;
    private String shoppingCost;
    private String billingAddress;
    private LocalDateTime createdDate;
}
