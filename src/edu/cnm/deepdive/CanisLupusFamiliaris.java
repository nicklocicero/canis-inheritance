package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

  private boolean goodBoy = true;

  public boolean isGoodBoy() {
    return goodBoy;
  }

  @Override
  public void hunt() {
    System.out.println("Throw the ball and I'll fetch it!");
  }

  @Override
  public void speak() {
    System.out.println("Bark at passing cars!");
  }

  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }
}
