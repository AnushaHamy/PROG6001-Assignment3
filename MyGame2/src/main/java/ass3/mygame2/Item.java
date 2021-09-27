
package ass3.mygame2;
/**
 * This is item class
 *
 * @author Anusha Hamy
 * @version 1.0
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;
    
    /**
     * 
     * @param name get the name
     * @param description get the description 
     * @param destructivePower get the descriptive power
     */
    public Item(String name, String description, int destructivePower)
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }
    
    /**
     * specify the item
     * @param name get the name
     * @param description get the description
     * @param healingPower get the healing power
     */
    public Item(String name, String description, double healingPower)
    {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }
    
    //write accessors and mutators
    
    /**
     * 
     * @return return name
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @return return the description
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * 
     * @return return the destructive power
     */
    public int getPower(){
        return destructivePower;
    }
}
