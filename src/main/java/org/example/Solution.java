package org.example;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();
        String aux = "";

        for(int i = 1; i<n + 1; i++){

            if(i % 3 == 0 && i % 5 == 0){
                aux = "FizzBuzz";
            }else if(i % 3 == 0){
                aux = "Fizz";
            }else if(i % 5 == 0){
                aux = "Buzz";
            }else{
                aux = Integer.toString(i);
            }

            result.add(aux);
        }

        return result;
    }
}