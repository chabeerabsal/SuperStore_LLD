package Service;

import Modellor.Items;
import Modellor.User.Seller;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ListInventory {
    private Seller seller;
    public ListInventory(Seller seller) {
        this.seller = seller;
    }
    public void listInventory() {
        List<Items> list=seller.getItem();
        for(Items item:list){
            System.out.println(item);
        }


    }
}
