package main.sg.edu.nus.iss;

import java.io.Console;
import java.util.Scanner;

public class solution {
    
    public static void main(String [] args) {
        Console con = System.console();
        String input = "";  

        while (!input.equals("quit")) {
            input = con.readLine("Type 'help' to show list of commands >>");
            
            if (input.equals("help")) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }

            if (input.startsWith("add")) {
                Scanner scan = new Scanner(input.substring(4));

                String content = "";
                while(scan.hasNext()) {
                    content = scan.next();
                    cartItems.add(content);
                }
            
            if (input.equals("list")) {
                int i =0;
                for (String item: cartItems) {
                    i++;
                    System.out.println(i + ". " + item);
                }
            }

            if (input.startsWith("delete")) {
                Scanner scan2 = new Scanner(input.substring(6));

                String content2 = "";
                while(scan.hasNext()) {
                    content = scan.next();
                    int listIndex = Integer.parseInt(content);

                    if (index < cartItems.size()) {
                        cartItems.remove(listIndex);
                    } else {
                        System.out.println("Incorrect item index");
                    }


                }
            }
        }

    }

}
}
