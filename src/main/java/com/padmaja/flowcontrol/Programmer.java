package com.padmaja.flowcontrol;

public class  Programmer extends Employee{
    private String[] programmingLanguages;
    public void writeCode(){
        System.out.println("writecode");
    }

    public void accessBaseClassMembers(){
        name = "Programmer";
        System.out.println(name);
    }
}
