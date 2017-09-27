package edu.cnm.deepdive.inheritance;

public class CallOfTheWild {

  private CallOfTheWild() {
  }
  public static void main(String[] args) {
    Canis dogA = new CanisLupus("Buck", 175);
    Canis dogB = new CanisLupusFamiliaris("Fido", 75);
    
   // Canis dogC = new Canis("Proto", 100);   this won't work because cannot
   // create an instance of the Canis
    
    dogA.hunt();
    dogB.hunt();
    ((CanisLupus) dogA).speak();
    ((CanisLupus) dogB).speak();
  }

}
