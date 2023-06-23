import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    static void password(int length){
        String word_char="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890!@#$^&*";
        char passchar[]=word_char.toCharArray();
        char result[]=new char[length];
        Random random_number=new Random();
        for(int i=0;i<length;i++){
            //Random random;
            result[i]=passchar[random_number.nextInt(word_char.length())];
            System.out.print(result[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("Password generator......");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the password: ");
        int password_length=sc.nextInt();
        password(password_length);
    }
    
}
