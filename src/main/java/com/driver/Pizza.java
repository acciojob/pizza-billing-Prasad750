package com.driver;

import javax.sound.midi.Soundbank;
import java.net.StandardSocketOptions;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    // adding require parameter

    private int basePriceOfPizza;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int paperBagPrice;

    private boolean isTakeAway;
    private boolean isAddedExtraCheese;
    private boolean isAddedExtraToppings;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
            this.basePriceOfPizza=300;
            this.extraToppingPrice=70;
        }
        else
        {
            this.basePriceOfPizza=400;
            this.extraToppingPrice=120;

        }
        this.extraCheesePrice=80;
        this.paperBagPrice=20;
        this.price=this.basePriceOfPizza;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isAddedExtraCheese)
        {
            this.price+=extraCheesePrice;
            isAddedExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isAddedExtraToppings)
        {
            this.price+=extraToppingPrice;
            isAddedExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway)
        {
            this.price+=this.paperBagPrice;
            isTakeAway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            this.bill="Base Price Of The Pizza: "+ this.basePriceOfPizza+"\n";
            if (isAddedExtraCheese)
            {
                this.bill+="Extra Cheese Added: "+ this.extraCheesePrice+"\n";
            }
            if (isAddedExtraToppings)
            {
                this.bill+="Extra Toppings Added: "+this.extraToppingPrice+"\n";
            }
            if (isTakeAway)
            {
                this.bill+="Paperbag Added: "+ this.paperBagPrice+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
