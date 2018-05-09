package sgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main1 {
    public static void main(String[] args) throws IOException {
        String str = "Hello, London is the capital of Great Britain";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(input.readLine());
        int count = 0;
        for (String mainString : str.split(" |,")) {
            if(mainString.length()<number){
                count=count+1;
            }
        }

        System.out.println("Count = " + count);
    }

}
