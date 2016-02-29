package fr.iutvalence.info.m4104.gildedroseinn;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by berthmat on 29/02/16.
 */
public class Inventory {
    private static Inventory inventory;
    private LinkedList<Item> items;

    public static Inventory getInstance(){
        if(inventory == null){
            inventory = new Inventory(new LinkedList<Item>());
        }
        return inventory;
    }

    private Inventory(LinkedList<Item> items){
        super();
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void useItem(int location){
        this.items.remove(location);
    }

    public int getItemNumber(){
        return this.items.size();
    }

    public Item getItem(int location){
        return this.items.get(location);
    }


    public List<Item> getItems() {
        return this.items;
    }
}
