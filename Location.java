import java.util.ArrayList;
public class Location {
    private String name;
    private String description;
    private ArrayList<Item> items;

    public Location(String pName, String pDescription){
        name = pName;
        description = pDescription;
        items = new ArrayList<Item>();
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void setName(String pName){
        name = pName;
    }

    public void setDescription(String pDescription){
        description = pDescription;
    }

    public void addItem(Item pItem){
        items.add(pItem);
    }

    public boolean hasItem(String pName){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getName().equalsIgnoreCase(pName)){
                return true;
            }
        }
        return false;
    }

    public Item getItem(String pName){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getName().equalsIgnoreCase(pName)){
                return items.get(i);
            }
        }
        return null;
    }

    //check w/ group
    public Item getItem(int index){
        if(index < items.size()){
            return items.get(index);
        }

        return null;
    }

    public int numItems(){
        return items.size();
    }

    public Item removeItem(String pName){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getName().equalsIgnoreCase(pName)){
                Item rItem = items.get(i);
                items.remove(i);
                return rItem;
            }
        }
        return null;
    }
}
