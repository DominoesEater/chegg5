package week3;

import java.util.Scanner;

public class DessertShop {

    public static void main(String[] args) {
            Order order1 = new Order();
            Scanner sIn = new Scanner(System.in);
            String choice, payMethod;
            DessertItem orderItem;

            boolean done = false;
            while (!done) {
                System.out.println("\n1: Candy");
                System.out.println("2: Cookie");
                System.out.println("3: Ice Cream");
                System.out.println("4: Sunday");

                System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
                choice = sIn.nextLine();

                if (choice.equals("")) {
                done = true;
                } else {
                switch (choice) {
                case "1":
                orderItem = userPromptCandy();
                order1.add(orderItem);
                break;
                case "2":
                orderItem = userPromptCookie();
                order1.add(orderItem);
                break;
                case "3":
                orderItem = userPromptIceCream();
                order1.add(orderItem);
                break;
                case "4":
                orderItem = userPromptSundae();
                order1.add(orderItem);
                break;
                }//end of switch (choice)
                }//end of if (choice.equals(""))
                }//end of while (!done)
               
            boolean validPayment = false;
            // loop that continues until user enters a valid payment type
            do
            {
                // input the payment method
                System.out.print("\nWhat form of payment will be used? (CASH, CARD, PHONE): ");
                payMethod = sIn.nextLine().toUpperCase();
               
                // loop to validate input payment method is valid
                for(Payable.PayType type : Payable.PayType.values())
                {
                    if(type.name().equals(payMethod))
                    {
                        validPayment = true;
                       
                    }
                }
                if(!validPayment)
                    System.out.println("\nThat's not a valid form of payment.");  
            }
            while(!validPayment);
           
            // based on input payment method set the PayType for order
            switch(payMethod)
            {
            case "CARD":
                order1.setType(Payable.PayType.CARD);
                break;
               
            case "CASH":
                order1.setType(Payable.PayType.CASH);
                break;
               
            case "PHONE":
                order1.setType(Payable.PayType.PHONE);
                break;
            }
            System.out.println("\n");
            System.out.println(order1);

            }
            
    
    private static DessertItem userPromptSundae() {
        System.out.println("Enter the type of Sundae:  ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter topping name: ");
        String topping = sc.nextLine();
        
        System.out.println("Enter topping price: ");
        double price = sc.nextDouble();
        return new Sundae(name,topping,price);
}

private static DessertItem userPromptIceCream() {
        System.out.println("Enter the type of Ice Cream: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter scoop count: ");
        int cnt = sc.nextInt();
        System.out.println("Enter price per scoop: ");
        double price = sc.nextDouble();
        return new IceCream(name,cnt,price);
}

private static DessertItem userPromptCookie() {
        System.out.println("Enter the type of Cookie: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter cookie count: ");
        int cnt = sc.nextInt();
        System.out.println("Enter price per dozen: ");
        double price = sc.nextDouble();
        return new Cookie(name,cnt,price);
}

private static DessertItem userPromptCandy() {
        System.out.println("Enter the type of Candy: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter candy weight: ");
        double weight = sc.nextDouble();
        System.out.println("Enter price per pound: ");
        double price = sc.nextDouble();
        return new Candy(name,weight,price);
}
}

  
     
       
