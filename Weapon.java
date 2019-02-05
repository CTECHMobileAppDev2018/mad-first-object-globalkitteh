public class Weapon{
  
  private int wear;
  private String name;
  
  Weapon(){
    this.wear = 0;
  }
  
  public void setName(String wepName){
    if (wepName.length() < 1){
      System.out.println("you forgot to type something.");
      return;
    }
    
    this.name = wepName;
  }
  
  
  public String getName(){
    return this.name;
  }
  
}
  