/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.verisoft_exec;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zivyahd
 */
public class Verisoft_Exec{

    public static void main(String[] args) {
        Animal d = new Dog(false,true,1);
        Animal c = new Cat(true, true, 1);
        Animal f=new Frog(false,false,1);
        ArrayList<Animal> Animals = new ArrayList<Animal>();
        Animals.add(d);
        Animals.add(c);
        Animals.add(f);
        
        System.out.println("usually Dogs");
        d.sayHello();
        System.out.println("Happy Dogs");
        d.sayHello(0);
        System.out.println("Scare Dogs");
        d.sayHello(1);
        
         System.out.println("usually Cats");
        c.sayHello();
        System.out.println("Happy Cats");
        c.sayHello(0);
        System.out.println("Scare Cats");
        c.sayHello(1);
        
         System.out.println("usually Frogs");
        f.sayHello();
        System.out.println("Happy Frogs");
        f.sayHello(0);
        System.out.println("Scare Frogs");
        f.sayHello(1);
        
        System.out.println("Is dogs mammals?");
        d.isMammals();
        System.out.println("Is Cats mammals?");
        c.isMammals();
        System.out.println("Is Frogs mammals?");
        f.isMammals();
        
        System.out.println("Dog numLengs:");
        d.getNumberOfLengs();
        System.out.println("Cat numLengs:");
        c.getNumberOfLengs();
        System.out.println("Frog numLengs:");
        f.getNumberOfLengs();
      
    }
}
