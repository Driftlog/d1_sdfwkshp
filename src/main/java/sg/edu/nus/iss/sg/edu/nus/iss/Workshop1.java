package sg.edu.nus.iss;
import java.util.ArrayList;
import java.io.Console;
import java.util.List;
import java.util.Arrays;

public class Workshop1 {
    public void main (String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Console con = System.console();
        System.out.println("Welcome to your shopping cart");

        while (true) {
            String command = con.readLine();

            if (command.equals("list")) {
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty");
                } else {
                for (int i = 1 ; i < cart.size() ; i++) {
                    for (String fruit : cart) {
                        System.out.println(i + ". " + fruit);
                    }
                }
            }
            }

            if (command.contains("add")) {
                String sub = command.substring(4, command.length()-1);
                List<String> subCart = Arrays.asList(sub.split(","));
                
                for (String fruits : subCart) {
                    if (!cart.contains(fruits)) {
                        cart.add(fruits);
                    } else {
                        System.out.println("You have " + fruits + " in your cart");
                    }
                }
            }

            if (command.contains("delete")) {
                String sub = command.substring(7, command.length()-1);
                Integer index = Integer.parseInt(sub);

                if (index > cart.size()) {
                    System.out.println("Incorrect item index");
                }
                System.out.println(cart.get(index) + " removed from the cart");
                cart.remove(index);
            }
        

            if (command.equals("quit")) {
            break;
         }
        }
    }
}