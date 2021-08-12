package edu.alenasoft.gildedrose;

public class ItemIncrement implements Quality {

    int limitQuality = 50;
    int sellInFivaDays = 5;
    int sellInTenDays = 10;

    @Override
    public Item calculateQuality(Item itemIncrement) {
        if(itemIncrement.getSellIn() > 0)
        {
            if(itemIncrement.getSellIn() <= sellInFivaDays && itemIncrement.getQuality() <= (limitQuality - 3))  {
                itemIncrement.incremaseQuality(3);
            }
            else if(itemIncrement.getSellIn() <= sellInTenDays && itemIncrement.getQuality() <= (limitQuality - 2))
                itemIncrement.incremaseQuality(2);
            else {
                if(itemIncrement.getQuality() <= (limitQuality - 1)) {
                    itemIncrement.incremaseQuality(1);
                }
            }
        }
        else
            itemIncrement.decreaseQuality(itemIncrement.getQuality());
        itemIncrement.decreaseSelleIn(1);
        return itemIncrement;
    }
}
