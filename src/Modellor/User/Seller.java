package Modellor.User;

import Modellor.Items;

import java.util.ArrayList;
import java.util.List;

public class Seller implements User {


   private List<Items> items=new ArrayList<Items>();
    public  void user(){
        System.out.println("Iam a seller");
    }
  public  void addItem(Items item){
       items.add(item);
       for(Items i:items){
           System.out.println(i);
       }
   }
   public void updateItem(Items item,String name, int price,int quantity){
        System.out.println("before updating"+ item);
        if(items.contains(item))
        {
            for(Items i:items)
            {
                if(i.equals(item))
                {
                    if(name!=null)
                    {
                        i.setProduct(name);
                    }
                }
                if(price!=0)
                {
                    i.setPrice(price);
                }
                if(quantity!=0)
                {
                    i.setQuantity(quantity);
                }
            }
        }
       System.out.println("After updated"+ item);
   }



}
