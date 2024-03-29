package model;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Account {
    private Integer Id;
    private Integer userId;
    private String accountNo;
    private BigDecimal balance;
    private String currency;
    private String accountType;
}
