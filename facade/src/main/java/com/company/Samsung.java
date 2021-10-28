package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Samsung extends Phone{

    @Override
    public void work() {
        toString();

        System.out.println("Samsung is working...");
    }
}
