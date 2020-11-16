
package strategypatterngame;

import java.util.Scanner;

/**
 * @author Mickael Walters
 * ID: 2016111033
 */
public class StrategyPatternGame {

    public static void main(String[] args) {
        //input object
        Scanner input = new Scanner(System.in);
        
        //variables
        Integer choice = null;
        Integer option = null;
        int age = 0;
        Integer weapon = null;
        String name;
        boolean check = false;
        
        System.out.print(" Welcome to DUEL MONSTERS simulation. Please register to begin playing... "
                + "\n \t 1. Account Registration "
                + "\n \t 2. Exit"
                + "\n ************************ \n");
        
        //User validation for Registration menu INTEGER check
        do {
            try {
                System.out.print("\t Enter selection here --> ");
                choice = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.err.println("You did not enter an integer");
                input.next();
                check = false;
            }
        } while (!check); 
        //END INTEGER CHECK VALIDATION
        
        
        //START registration ceck
        switch (choice) {
            case 1:
                System.out.print("\n \t Please type in your name : ");
                name = input.next().toUpperCase();
                
                    //Check if age is above 18 and user enters an INTEGER for age
                do {
                    try {
                       System.out.print("\t Enter your age : ");
                        age = input.nextInt(); 
                        check = true;
                    } catch (Exception ex){
                        System.err.println("Age is just a number...");
                        input.next();
                        check = false;
                    }
                    if (age <= 17) {
                        System.err.println("You're to yooung to play");
                        check = false;
                    } else {
                        System.out.println("\n Thank you " + name + " for joining 👾 DUEL MONSTERS!");
                    }
                } while(check == false);
                
            break;
            
            case 2:
                System.out.println("Good bye...Hope you REGISTER to play next time.");
            break;
            
            default:
                System.err.println("Out of range selection");
        } //END registration check
        
        //CHARACTER CHOOSING AND GAME PLAY
        System.out.println("\n Here's the list of monsters to with awesome battle attacks... "
                + "Choose your favorite to see its powers through weak opponents!"
                + "\n \t 1 - 🤺 Elemental HERO NEOS"
                + "\n \t 2 - 🤖 Aplha the Magnet Warrior"
                + "\n \t 3 - 🐉 Slifer the Sky Dragon");
        
        //User validation for GAME menu INTEGER check
        do {
            try {
                System.out.print("\n Monster selection ➡ ");
                option = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.err.println("You did not enter an integer");
                input.next();
                check = false;
            }
        } while (!check); 
        //END INTEGER CHECK VALIDATION
        
        switch (option) {
            case 1:
                Characters eHero = new ElementalHeroNEOS();
                eHero.performSound();
                System.out.println("\t I am a LIGHT ⚡ ⚡ type LEVEL 7 monster");
                eHero.performAttack(); 
                System.out.println(" Select a WEAPON :" + "\n \t [1] - ARMS" + "\n \t [2] - FOREHEAD");                  
                        
                    switch (option) {
                        case 1:
                            //do {
                                try {
                                    System.out.print("Weapon Choice: ");
                                    weapon = input.nextInt();
                                    eHero.displayAttackA();
                                    check = true;
                                } catch (Exception e) {
                                    System.err.println("You did not enter an integer. ");
                                    input.next();
                                    check = false;
                                }
                            //} while (check == false);
                        //break;
                        
                        case 2:
                            //do{
                            try {
                                System.out.print("Weapon Choice: ");
                                weapon = input.nextInt();
                                eHero.displayAttackB();
                                check = true;
                                } catch (Exception e) {
                                    System.err.println("You did not enter an integer. ");
                                    input.next();
                                    check = false;
                                }
                            //} while (check == false);
                        break;
                        
                        default:
                            System.err.println("Out of range weapon choice ❗");
                                
                            //} while (!check);
                        } //end inner switch for weapons
                break;
                
            case 2:
                Characters alpha = new AlphaTheMagnetWorrior();
                alpha.performSound();
                System.out.println("\t I am an EARTH 🌎 type LEVEL 4 monster");
                alpha.performAttack();
                System.out.println(" My only weapon is a 🗡 Type 'any integer' and stand back.");
                do {
                    try {
                        System.out.print("Input: ");
                        weapon = input.nextInt();
                        alpha.displayAttackA();
                        check = true;
                        
                    } catch (Exception e) {
                        System.err.println("\t No weapon choosen! ");
                        input.next();
                        check = false;
                    }
                } while (check == false);
                
                break;
            
            case 3:
                Characters slifer = new SliferTheSkyDragon();
                slifer.performSound();
                System.out.println("I am of a DIVINE 🌟 🌠 level 10 type monster...");
                slifer.performAttack();
                System.out.print("\n SELECT a WEAPON: " + "\n \t [1] MOUTH" + "\n \t [2] TAIL");
                
                    try {
                        System.out.print("\n Enter Weapon of Choice: ");
                        weapon = input.nextInt();
                        check = true;
                            if (weapon.equals(1)) {
                                slifer.displayAttackA();
                            } 
                            else if (weapon.equals(2)) {
                                slifer.displayAttackB();
                            } else {
                                System.err.println("Out of range weapon selection");
                            } 
                    } catch (Exception e) {
                        System.err.println("Invalid input!");
                        input.next();
                        check = false;
                    }
                break;
                
            default:
                System.err.println("\t ⚠ There's no monsters in that range ❗");
        } //END OUTER SWITCH
    }
    
}
