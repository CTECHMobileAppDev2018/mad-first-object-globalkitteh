import java.util.Scanner;

public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    Weapon weapon1 = new Weapon();
    
    Scanner plrScn = new Scanner(System.in); //playerName input scanner
    System.out.println("Enter player one's name");
    String plrName = plrScn.nextLine();
    player1.setName(plrName);
    
    System.out.println("Player one's name is: " + player1.getName());
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
    
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth()); //prints health
    
    //Player 1 weapon creation
    
    System.out.println("What would you like to name your weapon?");
    Scanner wepName1 = new Scanner(System.in);
    String wep1Name = wepName1.nextLine();
    weapon1.setName(wep1Name);
    
    System.out.println("Your weapon is now named " + weapon1.getName());
    System.out.println("Let's go!");
    
    // Ready Player... 2?
    
    Player player2 = new Player();
    Weapon weapon2 = new Weapon();
    
    Scanner plr2Scn = new Scanner(System.in); //playerName input scanner
    System.out.println("Enter player two's name");
    String plr2Name = plr2Scn.nextLine();
    player2.setName(plr2Name);
    
    System.out.println("Player two's name is: " + player2.getName());
    System.out.println("Is this correct? y/n");
    Scanner confirmation2 = new Scanner(System.in);
    char confInput2 = confirmation2.next().charAt(0);//gets the y/n input from user
    if (confInput2 == 'y'){
      System.out.println("Glad to hear it."); //set of conditionals to respond to the user input
    }
    else if (confInput2 == 'n'){
      System.out.println("Too bad.");
    }
    else{
      System.out.println("That's not a valid input. Eh, whatever.");
    }
    
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth()); //prints health*/
    
    //Player 2 weapon creation
    
    System.out.println("What would you like to name your weapon?");
    Scanner wepName2 = new Scanner(System.in);
    weapon2.setName(wepName2.nextLine());
    
    System.out.println("Your weapon is now named " + weapon2.getName());
    System.out.println("Let's go!");
    
    // Player creation completed
    //-----------------------------------------------------------------------------------------------------------
    
    

  }  
  
}