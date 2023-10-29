package HomeWork;

import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[] =s.toCharArray();
        for (int i = 0; i <s.length(); i++) {
            ch[i]+=5;
            System.out.print(ch[i]);
        }
    }
}
