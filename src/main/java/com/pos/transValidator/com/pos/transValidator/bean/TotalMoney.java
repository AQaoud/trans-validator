package com.pos.transValidator.com.pos.transValidator.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@NoArgsConstructor
public class TotalMoney{
    private double amount;
    private String currency;
}