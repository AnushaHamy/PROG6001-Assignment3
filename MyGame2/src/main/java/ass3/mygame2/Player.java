package ass3.mygame2;


import java.util.ArrayList;


/**
 * Write a description of class Player here.
 *
 * @author Anusha Hamy
 * @version 1.0
 */
public class Player
{
    
    private ArrayList<Item> playerItem;
     
    /**
     * create new player array
     */
    public Player()
    {
        playerItem = new ArrayList();
    }
    
  
    /**
     * Add items to inventory
     * @param item get item that needs to be added to inventory
     */  
    public void addItemInventory(Item item){
        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
        System.out.println(item.getDescription() + " was removed from the room"); // add extra information to inform user that the item has been taken
    }
    
    /**
     * Remove items from inventory
     * @param item that the item that needs to be removed
     */
    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    
    /**
     * Get the player item
     * @param stringItem get the item name
     * @return  return the item 
     */
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    
   /**
    * Print ll inventory
    * @return return all items in
    */
    public String printAllInventory(){

        String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    
}
