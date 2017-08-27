import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    int i=4;
    double d =4.0;
    String s="HackerRank";
    Scanner scan = new Scanner(System.in);
    int i1;
    String s1;
    double d1;
    i1=scan.nextInt();// here scan is object of scanner class using that you can scan value and take value from user you also can use buffercalss that 
    d1=scan.nextDouble();
    s1=scan.next();
    s1+=scan.nextLine();
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s+s1);
scan.close();
        }
    }

