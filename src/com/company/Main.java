package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        Coche coche1 = new Coche("Jaguar","XF","3453WRD",4000,80000.00);
        Coche coche2 = new Coche("Mercedes","Benz","3234RRRD",8000,160000.00);
        Coche coche3 = new Coche("BMW","M3","4853WRD",4000,80000.00);

        List<Coche> cocheList = new ArrayList<>();

        cocheList.add(coche1);
        cocheList.add(coche2);
        cocheList.add(coche3);

        System.out.println("Muestro el coche1:" + cocheList.get(0));

        System.out.println("Muestro el coche2:" + cocheList.get(1));

        System.out.println("Muestro el coche3:" + cocheList.get(2));



        Map<String, Coche> cocheMap = new HashMap<>();

        cocheMap.put("3453WRD" , coche1);

        System.out.println("Muestro el Coche1 a partir de su matricula " + cocheMap.get("3453WRD"));
        System.out.println(cocheMap.keySet());

    }
}
