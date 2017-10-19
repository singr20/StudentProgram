import java.util.*;

public class Starter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your graduation year: ");
        int graduationYear = sc.nextInt();
        
        Student student = new Student();

        if(graduationYear >= 2022 && graduationYear <= 2024){ //middle school
           student = new Middle();
           System.out.println(student.getLunchBlock());
           System.out.println(student.getChapelDay());
        }
        if(graduationYear <= 2021 && graduationYear >= 2018){ //upper school
           student = new Upper(); 
           System.out.println(student.getLunchBlock());
           System.out.println(student.getChapelDay());
        }
    }
}