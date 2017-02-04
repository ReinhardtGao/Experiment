package com.java21days;

import java.util.*;

public class CodeKeeper {
    ArrayList<String> list;
    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};

    public CodeKeeper(String[] userCodes){
        list = new ArrayList<>();
        // load built-in codes
        for (int i = 0; i < codes.length; i++ ){
            addCode(codes[i]);
        }
        //load user codes
        for (int j = 0; j < userCodes.length; j++){
            addCode(userCodes[j]);
        }
        //display all codes
        for(String code : list){
            System.out.println(code);
        }
    }

    private void addCode(String code){
        if(!list.contains(code)){
            list.add(code);
        }
    }

    public static void main(String[] arguments){
        new CodeKeeper(arguments);
    }
}
