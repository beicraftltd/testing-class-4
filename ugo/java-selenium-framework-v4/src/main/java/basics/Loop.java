package basics;

public class Loop {

    public static void main(String[] args) {

        // print out numbers from 1 to 10

        // for (initialise; set condition to exit; how to progress;)

//        for(int x = 1; x < 10+1; x+=1){
//            System.out.println("This is number "+ x);
//
//        }

        int[] nums = {2, 4, 6, 8, 12, 14, 16, 18, 20};

        for(int x : nums){
            if(x == 8){
                System.out.println("This is number "+ x);
            }
        }




    }
}
