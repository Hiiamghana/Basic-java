import java.util.*;
public class Strings {
    public static void main(String args[]){
//    //Declaration of string
//        String name="Biswajit";
//        String fullName="Biswajit Dalai";
//        String sentance="Hii iam Biswajit Dalai";
        //for user string input
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("your name is "+ name);
//        // concatenation
//        Scanner sc=new Scanner(System.in);
//        System.out.println(" enter the first name");
//        String firstName=sc.nextLine();
//        System.out.println("enter the last name");
//        String lastName=sc.nextLine();
//        String fullName=firstName+" "+lastName;
//        System.out.println("your full name is "+fullName);
//
//        // for string length find
//        System.out.print(" total numbers of elements is");
//        System.out.println(fullName.length());
//        // charAt function is use to print every value individually
//        // example of charAt
//        for (int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }
//        // for compere strings
//        String name1="biswajit";
//        String name2="biswajit";
//        if (name1.compareTo(name2)==0){
//            System.out.println("equal");
//        }else {
//            System.out.println("not equal");
//        }
        // substring
        String sentence="my name is Biswajit";
        String name=sentence.substring(11,sentence.length());
        // syntax is .substring(start,end)
        System.out.println(name);
    }
}
