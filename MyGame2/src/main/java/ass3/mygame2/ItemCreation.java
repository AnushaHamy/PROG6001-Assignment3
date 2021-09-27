package ass3.mygame2;

import java.util.ArrayList;


/**
 * This is ItemCreation class.
 *
 * @author Anusha Hamy
 * @version 1.0
 */
public class ItemCreation
{
    
    private ArrayList<Item> allItemsInGame;
    
    /**
     * This will crete items
     */
    public ItemCreation()
    {       
        allItemsInGame = new ArrayList();
        createItems();
    }
    
    /**
     * create items
     */
    public void createItems(){
        
        Item item1, item2, excaliburSword, key, frontGateKey;
        
        
        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
    }
   /**
    * Get the item
    * @param stringItem get the item 
    * @return return the item
    */
    public Item getItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: allItemsInGame){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
  
    
}
