import java.util.Scanner;
import java.util.Random;

public class StartGame {
  public static void main(String[] args) {
    
    PlayerList playerArray = new PlayerList();
    
    //Player tempPlayer = playerArray.getPlayer(0);
    //System.out.println(tempPlayer.getName());
    
    Player player0 = new Player();
    Weapon weapon0 = new Weapon();
    
    Scanner plrScn = new Scanner(System.in); //playerName input scanner
    System.out.println("Enter player one's name");
    String plrName = plrScn.nextLine();
    PlayerList.addPlayer0(plrName);
    
    //player0.setName(plrName);
    
    System.out.println("Player one's name is: " + player0.getName());
    System.out.println("Is this correct? y/n");
    Scanner confirmation = new Scanner(System.in);
    char confInput = confirmation.next().charAt(0);//gets the y/n input from user
    if (confInput == 'y'){
      System.out.println("Glad to hear it."); //set of conditionals to respond to the user input
    }
    else if (confInput == 'n'){
      System.out.println("Too bad.");
    }
    else{
      System.out.println("That's not a valid input. Eh, whatever.");
    }
    
    System.out.println(player0.getName() + "'s health is: " + player0.getHealth()); //prints health
    
    //Player 1 weapon creation
    
    System.out.println("What would you like to name your weapon?");
    Scanner wepName0 = new Scanner(System.in);
    String wep0Name = wepName0.nextLine();
    weapon0.setName(wep0Name);
    
    System.out.println("Your weapon is now named " + weapon0.getName());
    System.out.println("Let's go!");
    
    // Ready Player... 2?
    
    Player player1 = new Player();
    Weapon weapon1 = new Weapon();
    
    Scanner plr1Scn = new Scanner(System.in); //playerName input scanner
    System.out.println("Enter player two's name");
    String plr1Name = plr1Scn.nextLine();
    player1.setName(plr1Name);
    
    System.out.println("Player two's name is: " + player1.getName());
    System.out.println("Is this correct? y/n");
    Scanner confirmation1 = new Scanner(System.in);
    char confInput1 = confirmation1.next().charAt(0);//gets the y/n input from user
    if (confInput1 == 'y'){
      System.out.println("Glad to hear it."); //set of conditionals to respond to the user input
    }
    else if (confInput1 == 'n'){
      System.out.println("Too bad.");
    }
    else{
      System.out.println("That's not a valid input. Eh, whatever.");
    }
    
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth()); //prints health*/
    
    //Player 2 weapon creation
    
    System.out.println("What would you like to name your weapon?");
    Scanner wepName1 = new Scanner(System.in);
    weapon1.setName(wepName1.nextLine());
    
    System.out.println("Your weapon is now named " + weapon1.getName());
    System.out.println("Let's go!");
    
    // Player creation completed
    //-----------------------------------------------------------------------------------------------------------
    // Time to battle
    
    while (player0.getHealth() != 0 && player1.getHealth() != 0){
      //Player 1's turn
      Random plr0dmg = new Random();
      int temp0dmg = plr0dmg.nextInt(10); // Damage generator
      System.out.println(player0.getName() + ", it's your turn. You attack " + player1.getName() + " using " + weapon0.getName() + " for " + temp0dmg + " damage.");
      player1.setHealth((player1.getHealth() -  temp0dmg)); // Health calculator
      if (player1.getHealth() == 0){
        System.out.println(player1.getName() + " has died."); //Ending conditional
      }
      else{
      System.out.println(player1.getName() + " has " + player1.getHealth() + " HP left.");
      }
      
      //
      
      if (player0.getHealth() == 0 || player1.getHealth() == 0){ //interturn test for death
        break;
      }
      
      //Player 2's turn
      Random plr1dmg = new Random();
      int temp1dmg = plr1dmg.nextInt(10);
      System.out.println(player1.getName() + ", it's your turn. You attack " + player0.getName() + " using " + weapon1.getName() + " for " + temp1dmg + " damage.");
      player0.setHealth((player0.getHealth() -  temp1dmg)); 
      if (player0.getHealth() == 0){
        System.out.println(player0.getName() + " has died.");
      }
      else{
      System.out.println(player0.getName() + " has " + player0.getHealth() + " HP left.");
      }
      
      //
      
    }
    
    //Somebody has won
    
    if (player0.getHealth() < player1.getHealth()) {
      System.out.println("---------------------------------------------");
      System.out.println("Good job, " + player1.getName() + ", you won!");
    }
    else if (player1.getHealth() < player0.getHealth()) {
      System.out.println("---------------------------------------------");
      System.out.println("Good job, " + player0.getName() + ", you won!");
    }
    else {
      System.out.println("Well, this is awkward. I'm not sure who won.");
    }
  }  
}