package edu.alenasoft.gildedrose;

public class ItemNormal implements Quality {

    @Override
    public Item calculateQuality(Item itemNormal) {
        if(itemNormal.getQuality() > 0)
        {
            if(itemNormal.getSellIn() <= 0 && itemNormal.getQuality() >= 2)
                itemNormal.decreaseQuality(2);
            else
                itemNormal.decreaseQuality(1);
        }

        itemNormal.decreaseSelleIn(1);

        return itemNormal;
    }
}
