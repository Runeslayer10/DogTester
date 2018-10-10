/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dogtester;

/**
 *
 * @author blhad3491
 */
public class DogTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Dog dog1 = new Dog("Rover", "Spaniel", 3, 4);
    Dog dog2 = new Dog("Spot", "Border Collie");

    //Values for dog1
    System.out.println(dog1.getName() + "'s Aggression: "
      + dog1.getAggression());
    //Values for dog2
    System.out.println(dog2.getName() + "'s Aggression: "
      + dog2.getAggression());

    //Factors control behaviour
    if (dog1.getAggression() > 5) {
      //dog1 is aggressive
      System.out.print(dog1.getName() + ": ");
      dog1.barkAngry();
    } else {
      //dog1 is not aggressive
      System.out.print(dog1.getName() + ": ");
      dog1.barkFriendly();
    }

    if (dog2.getAggression() > 5) {
      //dog2 is aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkAngry();
    } else {
      //dog2 is not aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkFriendly();
    }
  }
}
    
    
