import java.util.Scanner;
public class examques2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int Grade = input.nextInt();
        String result = (Grade >= 40) ? "Pass" : "Fail";
        System.out.println("\n Grade result"); // \n used for New line
        System.out.println("Grade:\t" + Grade); // \t is used for Tabspace
        System.out.println("Result:\t" + result);
        
    }
}