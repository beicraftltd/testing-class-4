package basics;

public class Person {

    // variables

    // a person can have a name, an age, date of birth, height, complexion, hair

    //name: Peter Gregory Obi
    //age: 62
    // dateOfBirth: 11th September, 2001
    // height: 7.3
    // complexion: isWhite: false



    // characteristics of main method
    // Must be public
    // Must be static
    // Must be void
    // Must have a name called 'main'
    // Must have a parenthesis just after the name
    // Must have parameter of string array e.g. String[]
    // Must start and end with curly braces

    public static void main (String[] args){
        // where block of codes can be added

        String name = "Peter Gregory Obi";
        int age = 62;
        String dateOfBirth = "11th September, 2001";
        double height = 7.3;
        boolean isWhite = false;

        System.out.println(isWhite);
        System.out.println(name);
        System.out.println(age);
        System.out.println(dateOfBirth);
        System.out.println(height);
    }


}

