import java.util.Scanner;
 
public class Employee

{


    public static void main(String args[])
    {

    int age;
    String name, address, gender;
    Scanner get = new Scanner(System.in);

        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter Gender of the Employee:");
        gender = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter Age:");
        age = get.nextInt();

      System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
  

        
       
    }
}