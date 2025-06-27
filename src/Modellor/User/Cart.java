package Modellor.User;

import Modellor.Items;
import Service.Payment;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Items> items=new ArrayList<>();
    private List<Items> selectItems=new ArrayList<>();
   public void addtoCart(Items item){
    items.add(item);
     }
    public int printtotal(List<Items> selectItems){
       int total=0;
       for(Items item:selectItems){
           total=total+item.getPrice();
       }
       return total;
    }
   public void removefromCart(Items item){
       items.remove(item);
   }

   public Payment checkout(int total){
       return new Payment(total);
   }


    public List<Items> selectItemsforPurchase(List<Items> items) {
       selectItems.addAll(items);
       return selectItems;
    }
}
