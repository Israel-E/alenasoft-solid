package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = new ArrayList<>();

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    System.out.println(items);
  }

  public static void updateQuality() {
    for (int i = 0; i < items.size(); i++) {
      switch (items.get(i).getName()) {
        case "+5 Dexterity Vest": case "Elixir of the Mongoose":
          ItemNormal normal = new ItemNormal();
          items.set(i, normal.calculateQuality(items.get(i)));
          break;
        case "Aged Brie": case "Backstage passes to a TAFKAL80ETC concert":
          ItemIncrement increment = new ItemIncrement();
          items.set(i, increment.calculateQuality(items.get(i)));
          break;
        case "Sulfuras, Hand of Ragnaros":
          ItemLegendary legendary = new ItemLegendary();
          items.set(i, legendary.calculateQuality(items.get(i)));
          break;
        case "Conjured Mana Cake":
          ItemConjured conjured = new ItemConjured();
          items.set(i, conjured.calculateQuality(items.get(i)));
          break;
        default: throw new UnsupportedOperationException();
      }
    }
  }
}
