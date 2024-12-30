import java.util.Scanner;

public class HaberdasheryApp {


    public static void main(String[] args) {

        //wholesale haberdashery
        //Less than 5 packs, Not for sale
        //Between 5 and 15 packages, shipping costs $10.
        //More than 15 packages, FREE shipping.

        int amountPackages;
        double TotalAmount, diference, discount, totalDiscount;
        Scanner keyborad = new Scanner(System.in);

        System.out.println("Enter the amounts if packages: ");
        amountPackages = keyborad.nextInt();

        // testing all cases

        if (amountPackages < 5) {
            if (amountPackages < 0) {
                System.out.println("Error - you can not buy packages with negative values");
            } else {

                System.out.println("It is not allowed to sell packages for less than 5  ");
            }
        } else {

            System.out.println("Enter the total amount to purchase ");
            keyborad = new Scanner(System.in);
            TotalAmount = keyborad.nextDouble();

            if (amountPackages >= 5 && amountPackages <= 15) {

                System.out.println("The shipping costs are $10.00");
                TotalAmount = TotalAmount + 10;

            } else {
                System.out.println("Thank your for your purchase - Free Shipping, ");
            }

            if (TotalAmount < 100) {
                diference = 100 - TotalAmount;
                System.out.println("The amount is lower than 100,which the promotion doesnt apply " +
                        "you need " + diference + "€ for participate this promo  ");
            } else {
                if (TotalAmount >= 100 && TotalAmount <= 300) {
                    discount = TotalAmount * 0.05;
                    totalDiscount = TotalAmount - discount;
                    System.out.println("Your purchase has a discount of 5% equivalent a " + discount +
                            " The new total amount is: " + totalDiscount);
                } else {

                    discount = TotalAmount * 0.10;
                    totalDiscount = TotalAmount - discount;
                    System.out.println("Your purchase has a discount of 10% equivalent a " + discount +
                            " The new total amount is: " + totalDiscount);

                }


            }


        }

    }

//22:30
}
