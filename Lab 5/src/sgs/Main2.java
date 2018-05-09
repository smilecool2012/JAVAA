package sgs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String mainString = "";
        System.out.println("End to end:" );
        while(!mainString.equals("end")){
            mainString = input.readLine();
            System.out.println(mainString);
        }

    }
}
