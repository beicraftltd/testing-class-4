package basics;

public class ControlFlow {

//    public static void main(String[] args) {
//
//        // if-else statement, switch case
//
//        // make an app that can give customer a discount when they purchase above certain price.
//        // if purchase is above 1000, give a discount of 10% if above 500 and less than 1000 give a discount of 5% else no discount
//
//        double purchase = 500;
//        double discount = 0;
//        double pay = purchase;
//
//        if(purchase >= 1000){
//            discount = 0.1*purchase;
//            pay = pay - discount;
//            System.out.println("10% discount applied: "+pay);
//        }else if (purchase >= 500 && purchase < 1000){
//            discount = 0.05*purchase;
//            pay = pay - discount;
//            System.out.println("5% discount applied: "+pay);
//        }else{
//            discount = 0*purchase;
//            pay = pay - discount;
//            System.out.println("0% discount applied: "+pay);
//        }
//
//
//
//    }


    public static void main(String[] args) {

        // the use of control flow  on days of the week

        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(dayName);
    }
}
