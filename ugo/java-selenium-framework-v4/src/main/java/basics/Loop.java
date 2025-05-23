package basics;

public class Loop {

    public static void main(String[] args) {

        // print out numbers from 1 to 10

        // for (initialise; set condition to exit; how to progress;)
// Normal Loop
//        for(int x = 1; x < 10+1; x+=1){
//            System.out.println("This is number "+ x);
//        }
// Advance Loop
//        int[] nums = {2, 4, 6, 8, 12, 14, 16, 18, 20};
//
//        for(int x : nums){
//            if(x == 8){
//                System.out.println("This is number "+ x);
//            }
//        }

// While & do...while
        int x = 0;
        while(x < 3){
            System.out.println("x = "+ x);
            x++; // increase x by 1
        }

        int j = 4;
        do {
            System.out.println("j = "+ j);
            j--;
        }while (j > 0);


    }
}
