package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void hunt() {
    System.out.println("Hunt other animals in packs.");
  }

  public void speak() {
    System.out.println("Howl!");
  }


}
