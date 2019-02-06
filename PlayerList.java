public class PlayerList{
  
  private static Player[] playerArray = new Player[4];
  
  public static void addPlayer0(String playerName) {
    Player player0 = new Player();
    player0.setName(playerName);
    playerArray[0] = player0;
  }
  
  public Player getPlayer0() { //gets player 0
    return playerArray[0];
  }
  
  public Player getPlayer(int i) { 
    return playerArray[i];
  }
}