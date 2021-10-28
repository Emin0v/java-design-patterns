package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneFacade {

    private final Phone iPhone;
    private final Phone samsung;

    public PhoneFacade(){
       iPhone = new Iphone();
       samsung = new Samsung();
    }

    public void iPhoneWork(){
        iPhone.work();
    }

    public void samsungWork(){
        samsung.work();
    }

    public String getString(String s){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(s);
            return br.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public Double getDouble(String s){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(s);
            return Double.parseDouble(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
