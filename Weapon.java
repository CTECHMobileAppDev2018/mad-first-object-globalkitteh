public class Weapon{
  
  private int wear;
  private String color;
  
  Weapon(){
    this.wear = 0;
  }
  
  public void setColor(String wepColor){
    if (wepColor.length() < 1){
      System.out.println("you forgot to type something.");
      return;
    }
    
    this.color = wepColor;
  }
  
  
  public String getColor(){
    return this.color;
  }
  
}
  