package edu.alenasoft.gildedrose;

public class ItemConjured implements Quality {
    @Override
    public Item calculateQuality(Item itemConjured) {
        if(itemConjured.getQuality() > 0)
        {
            if(itemConjured.getSellIn() <= 0)
                if(itemConjured.getQuality() >= 4)
                    itemConjured.decreaseQuality(4);
                else
                    itemConjured.decreaseQuality(itemConjured.getQuality());
            else
                if(itemConjured.getQuality() >= 2)
                    itemConjured.decreaseQuality(2);
                else
                    itemConjured.decreaseQuality(itemConjured.getQuality());
        }

        itemConjured.decreaseSelleIn(1);
        return itemConjured;
    }
}
