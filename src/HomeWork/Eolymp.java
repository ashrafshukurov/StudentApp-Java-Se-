package HomeWork;

import java.util.Scanner;
import java.util.Stack;

public class Eolymp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        String s=sc.nextLine();
        int n,m;
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){//8 9 + 1 7 - *
            if(Character.isDigit(ch[i])){
               stack.push((int)(ch[i])-48);
            }
            else{
                if(ch[i]=='+'){
                    n=stack.peek();
                    stack.pop();
                    m=stack.peek();
                    stack.pop();
                    stack.push(m+n);
                }
                if(ch[i]=='-'){
                    n=stack.peek();
                    stack.pop();
                    m=stack.peek();
                    stack.pop();
                    stack.push(m-n);
                }
                if(ch[i]=='*'){
                    n=stack.peek();
                    stack.pop();
                    m=stack.peek();
                    stack.pop();
                    stack.push(m*n);
                }
            }
        }
        System.out.println(stack.pop());

    }
}
