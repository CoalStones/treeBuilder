package JavaProjects;
import java.util.Scanner;

public class treeBuilder{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        System.out.println();
        String temp1 = "", temp2 = "";

        //top half
        for(int i = 0; i < word.length(); i++){
            spaces(word.length()-i-1);
            temp1 += word.charAt(i);
            
            for(int k = i-1; k >= 0; k--){
                temp2 += word.charAt(k);
            }

            System.out.print(temp1);
            System.out.println(temp2);
            temp2 = "";
        }
        
        //bottom half
        temp1 = "";
        for(int i = word.length()-1; i > 0; i--){
            spaces(word.length()-i);
            for(int c = 0; c < i-1; c++){
                temp1 += word.charAt(c);
            }
            /*System.out.print(i);
            System.out.print(" ");
            System.out.println(word.charAt(i));*/
            
            for(int k = i-1; k >= 0; k--){
                temp2 += word.charAt(k);
            }
            
            System.out.print(temp1);
            if(temp2 != "") System.out.println(temp2);
            temp1 = "";
            temp2 = "";
        }

        //stem
        for(int i = 1; i < word.length(); i++){
            spaces(word.length()-1);
            System.out.println(word.charAt(i));
        }
    }

    public static void spaces(int numOfSpaces) {
        for(int i = 0; i < numOfSpaces; i++){
            System.out.print(" ");
        }
    }

}