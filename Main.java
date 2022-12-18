package com.responsipbo;

import java.util.Scanner;
import java.io.Console;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        customer user[] = new customer[5];
        user[0] = new customer("2000018284","1a", "018284");
        user[1] = new customer("2000018283","2a", "018283");
        user[2] = new customer("2000018287","3a", "018287");
        user[3] = new customer("2000018292","4a", "018292");
        user[4] = new customer("2000018270","5a", "018270");
        int pilihan;
        int penarikan= 1;

        do {

            System.out.println("             RESPONSI ATM SEDERHANA            ");
            System.out.println("===============================================");
            System.out.println("");
            System.out.print("Masukkan ID         : ");
            String nmr = in.next();
            System.out.print("Masukkan PIN        : ");
            String pass = in.next();
            System.out.print("Masukkan NoRekening : ");
            String rek = in.next();
            System.out.println("===============================================");
            customer userX = new customer(rek, nmr, pass);
            for (int i = 0; i < user.length; i++) {
                if (user[i].noRekening.equals(userX.noRekening)) {
                    userX = user[i];
                }
            }
            boolean check = userX.loginCheck();
            if (check == false) {
            }
            boolean check1 = userX.loginCheck();
            if (check == false) {
            }
            boolean check2 = userX.loginCheck();
            if (check == false) {
                System.out.println("Maaf,Akun Anda Telah Terblokir");
                break;
            }

            do {
                System.out.println("===============================================");
                System.out.println("1. Info Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Exit");
                System.out.print("Pilih menu : ");
                pilihan = in.nextInt();
                switch (pilihan) {
                    case 1: {
                        userX.lihatSaldo();
                        System.out.println("");
                        break;
                    }
                    case 2: {
                        userX.tarikUang();
                        System.out.println("");
                        break;
                    }
                    case 3: {
                        System.out.print("Masukkan Nomer Rekening yang Akan Dituju : ");
                        String nomor = in.next();
                        for (int j = 0; j < user.length; j++) {
                            userX.transferUang(user[j]);
                            System.out.println("");
                            break;
                        }
                        if (penarikan %3==0){
                            int bonus = in.nextInt()* 3/100;
                            System.out.println("Anda Mendapat Bonus Sebesar "+bonus);
                            in.nextInt(in.nextInt()+bonus);
                        }
                        penarikan+=1;
                        System.out.println("saldo anda sekarang : ");
                        userX.lihatSaldo();
                    }
                }
            } while (pilihan != 4);
        } while (pilihan != 0);
    }
}
