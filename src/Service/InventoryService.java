package Service;
import Modellor.Product;

import java.util.*;

public class InventoryService {

       private Map<String, Product> productDB = new HashMap<>();

        public void addProduct(Product product) {
            productDB.put(product.getProductID(), product);
            System.out.println("Product added: " + product);
        }

        public List<Product> getAllProducts() {
            return new ArrayList<>(productDB.values());
        }

        public Product getProduct(String productId) {
            return productDB.get(productId);
        }
    }


