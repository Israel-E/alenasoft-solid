package edu.alenasoft.gildedrose;

public class ItemLegendary implements Quality {
    @Override
    public Item calculateQuality(Item itemLegendary) {
        itemLegendary.decreaseSelleIn(1);
        return  itemLegendary;
    }
}
