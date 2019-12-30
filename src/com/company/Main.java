package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String secretKey = "Encrpytion";

        System.out.print("Masukkan Password : ");
        String originalString = scanner.nextLine();

        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;



        System.out.println("Password yang dimasukkan : " + originalString);
        System.out.println("Password hasil enkripsi : "+encryptedString);
        System.out.println("Password hasil deskripsi : "+decryptedString);
    }
}
