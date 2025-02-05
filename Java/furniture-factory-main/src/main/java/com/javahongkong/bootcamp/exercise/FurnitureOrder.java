package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;
    

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
                this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float totalCost = 0.0f;
        for (Furniture furniture : Furniture.values()) {
            totalCost += this.ordersOfFurnitures.get(furniture) * furniture.cost();
        }
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return this.ordersOfFurnitures.getOrDefault(type, 0);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (!this.ordersOfFurnitures.containsKey(type)) {
            return 0.0f;
        }
        return this.ordersOfFurnitures.get(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int totalQuantity = 0;
        for (Furniture furniture : Furniture.values()) {
            totalQuantity += this.ordersOfFurnitures.get(furniture);
        }
        return totalQuantity;
    }
}