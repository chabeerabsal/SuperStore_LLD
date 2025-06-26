import Modellor.Items;
import Modellor.User.Buyer;
import Modellor.User.Seller;
import Service.ListInventory;
import Service.RegisterService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        RegisterService registerService = new RegisterService();
        Buyer buyer= new Buyer();
        registerService.registerCrendials(buyer,"chabeer","1234");
       boolean loogedin= registerService.login(buyer,"chabeer","1234");
       System.out.println(loogedin);

       if(loogedin){
           Seller seller= new Seller();
           Items item =new Items("lenovo",2,30000);
           Items item1 =new Items("Samsung",1,30000);
           Items item2 =new Items("MAC",5,30000);
           Items item3 =new Items("HP",9,30000);
           seller.addItem(item);
           seller.addItem(item1);
           seller.addItem(item2);
           seller.addItem(item3);
          // seller.updateItem(item,"HP",0,0);
           ListInventory listInventory = new ListInventory(seller);
           listInventory.listInventory();

       }

    }
}