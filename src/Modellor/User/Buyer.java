package Modellor.User;

import Modellor.Items;

public class Buyer implements User {
    private Cart cart;

    @Override
   public void user()
   {
       System.out.println("Iam a buyer");

   }

   public void setCart(Cart cart)
   {
       this.cart=cart;
   }

   public void addCard(Items item)
   {
       this.cart.addtoCart(item);
   }


}
