package homework.test.domain;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter
public class Customer extends User {
    private String name;
    private String billingAddress;
    private String defaultShoppingAddress;
}
