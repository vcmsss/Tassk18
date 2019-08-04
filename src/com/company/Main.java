package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        String S;
        try (BufferedReader br = new BufferedReader(new FileReader("TXT.txt"))) {
            while ((S = br.readLine()) != null) {
                System.out.println(S);
            }

        } catch(IOException exc) {
            System.out.println("Ошибка:" + exc);
        }


        Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String a = in.nextLine();


        try {
            FileWriter writer = new FileWriter("TXT.txt");
            writer.write(a);
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error: + ex");



        }

    }
}
