package me.valizadeh.practices.springdataexample;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "transaction")
@Getter @Setter @ToString
public class Transaction {

    @Id
    private Integer id;

    private String userName;

    private Integer amount;

    private Character amountIndicator;

    private LocalDateTime bookedDate;

}
