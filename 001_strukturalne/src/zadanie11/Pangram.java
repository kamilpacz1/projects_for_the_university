package zadanie11;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WEJŚCIE:");
        String tekst=scanner.nextLine();

        tekst=tekst.replaceAll("","").toLowerCase();

        String pustyString="";

        for(char i='a';i<='z';++i){

            if(tekst.indexOf(i)!=-1){
                pustyString=pustyString + i;
            }
        }
        if(pustyString.length()==26){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
