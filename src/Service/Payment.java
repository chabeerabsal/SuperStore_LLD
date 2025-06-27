package Service;

import Modellor.Items;

import java.util.List;

public class Payment {
    int total;
    int payment;
   // boolean cash;
    public Payment(int total) {
        this.total = total;
    }

    public boolean cashONDelivery(boolean cashONDelivery, List<Items> items)
    {
        if(cashONDelivery==true)
        {
            System.out.println("order Places"+total+"amount to pay");
            System.out.println("Your ordrs");
            {
                for(Items item:items) {
                    System.out.println(item);

                }


            }
            return true;
        }
        return false;
    }

}
