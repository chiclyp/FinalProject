package Atm;

import java.util.Scanner;

/**
 *
 * @author Pauline Chicoye
 */
public class ATM {
    
    public static void main(String[] args) {
       Account details = new Account(1000.00);
       
        System.out.println("Hello. Welcome to your virtual ATM machine.");
        System.out.println("Let's start by having you provide your full name");
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        System.out.println("Welcome back " + name + " What is your nip?");
        
        int nip = scan.nextInt();
        String sentVal = "stop";
        String input = "";
        
        while (nip != details.nip()){
            System.out.println(details.falseNip());
            nip = scan.nextInt();
        }
        if (nip == details.nip()){
            System.out.println(details.correctNip());
        }
        while (!input.equalsIgnoreCase(sentVal)){
            System.out.println("What do you want to do today?");
            System.out.println("(1)Withdraw");
            System.out.println("(2)Deposit");
            System.out.println("(3)See Account Balance");
            
            switch(input){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println(details.toString());
                    break;
                    
            }
        }
        
    }
      
    
}

