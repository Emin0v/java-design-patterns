package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Data
@NoArgsConstructor
public class Iphone extends Phone {

    @Override
    public void work() {

        System.out.println("iPhone is working...");
    }

}