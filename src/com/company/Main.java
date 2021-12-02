package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Type type = new Type("фрукт");
        Type type2 = new Type("яблоко");

        Fruits objectA =new Fruits(EnumTaste.OTVRATNYI,type);
        objectA.norm();
        System.out.println(objectA.getInfo());
        System.out.println("\n");

        Apple objectB = new Apple(type2,2);
        System.out.println(objectB.getInfo());

        Apple objectC = new Apple(EnumTaste.VKUSNYI,type2,10);
        System.out.println(objectC.getInfo());



    }
}
