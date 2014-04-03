/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import java.util.Scanner;

/**
 *
 * @author Taner
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorld myApp = new HelloWorld();
        System.out.println("Hello World");
        String name = myApp.readName();
        
        System.out.print("Hello"+ name);
      
    }
    private String readName(){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("What is your name");
        name = sc.nextLine();
        return name;
    }
    
}
