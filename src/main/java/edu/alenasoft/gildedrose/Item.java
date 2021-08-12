package edu.alenasoft.gildedrose;

public class Item {

  private String name;
  private int sellIn;
  private int quality;

  public Item(String name, int sellIn, int quality) {
    this.setName(name);
    this.setSellIn(sellIn);
    this.setQuality(quality);
  }

  /* Generated getter and setter code */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSellIn() {
    return sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  @Override
  public String toString() {
    return "Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}';
  }

  public int decreaseSelleIn(int valueTotalDecrease) {
    setSellIn(getSellIn() - valueTotalDecrease);
    return getSellIn();
  }

  public int decreaseQuality(int valueTotalDecrease) {
    setQuality(getQuality() - valueTotalDecrease);
    return getQuality();
  }

  public int incremaseQuality(int valueTotalIncrease) {
    setQuality(getQuality() + valueTotalIncrease);
    return getQuality();
  }
}
