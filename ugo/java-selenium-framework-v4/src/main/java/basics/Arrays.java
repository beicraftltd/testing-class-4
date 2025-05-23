package basics;

public class Arrays {


    public static void main(String[] args) {
//        // declaration of array size
//        String[] fruits = new String[4];
//        fruits[0] = "Apple";
//        fruits[1] = "Banana";
//        fruits[2] = "Orange";
//        fruits[3] = "Kiwi";
//
//        int arraySize = fruits.length;
//
////        for(initialise; set a condition; how we progress)
//
//        for(int a = 0; a < arraySize; a+=1){
//            System.out.println(fruits[a]);
//        }


        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // print out even numbers and odd numbers from the array

        for(int value : values){
            if(value % 2 == 0){
                System.out.println(value + " is an even number");
            }else{
                System.out.println(value + " is an odd number");
            }
        }



    }
}
