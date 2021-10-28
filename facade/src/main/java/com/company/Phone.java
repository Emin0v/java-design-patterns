package com.company;

import lombok.ToString;

import java.math.BigDecimal;

public abstract class Phone {

    public String name;
    public String modelNo;
    public Double weight;
    public BigDecimal price;

    public abstract void work();

}
