//import scanner so that I can access the Scanner class
import java.util.Scanner;

public class MyClass {

    public static void main (String []args){
         //ref the scanner so that I know how to call it
        Scanner scan = new Scanner(System.in);
        //variable x,y,z in order to add
        double x , y,z;
        double ans;

        //Message to user to find out what option they want
        System.out.println("Welcome to the calculator choose from the options below:" +'\n'+
                "1. Addition"+'\n'+
                "2. Subtraction"+'\n'+
                "3. Multiplication"+'\n'+
                "4. Division"+'\n'+"5. Exit");

        // the scanner used to get the option from the user
        x = scan.nextDouble();


        // this is what happens what user chooses option 1
        if(x==1){
            System.out.println("Enter the two numbers you would like to add:");
            y = scan.nextDouble();
            z = scan.nextDouble();
            ans = y+z;
            System.out.println("The answer of the addition of "+y+" and "+z+" is: "+ans);
        }

      else if(x==2){
            System.out.println("Enter the two numbers you would like to subract:");
            y = scan.nextDouble();
            z = scan.nextDouble();
            ans = y-z;
            System.out.println("The answer of the subtraction of "+y+" and "+z+" is: "+ans);

        }

      else if (x==3){
            System.out.println("Enter the two numbers you would like to multiply:");
            y = scan.nextDouble();
            z = scan.nextDouble();
            ans = y*z;
            System.out.println("The answer of the multiplication of "+y+" and "+z+" is: "+ans);



        }

      else if (x==4){

            System.out.println("Enter the two numbers you would like to divide:");
            y = scan.nextDouble();
            z = scan.nextDouble();
            ans = y/z;
            System.out.println("The answer of the division of "+y+" and "+z+" is: "+ans);
        }
        
        else if (x==5){
        System.exit();
        
        }

      else{
          System.out.println("You have entered an invalid option");

        }


    }


}
