package com.responsipbo;

import java.util.Scanner;

public class customer {
    public String nama;
    public String[] id = new String[5];
    public String[] noRekening = new String[5];
    private long saldo;
    private String[] pin = new String[5];

    public customer() {
    }
    public customer(String rekening, String idPengguna, String Pin) {
        id[0] = "1a";
        pin[0] = "018284";
        noRekening[0] = "2000018284";
        id[1] = "2a";
        pin[1] = "018283";
        noRekening[1] = "2000018283";
        id[2] = "3a";
        pin[2] = "018287";
        noRekening[2] = "2000018287";
        id[3] = "4a";
        pin[3] = "018292";
        noRekening[3] = "2000018292";
        id[4] = "5a";
        pin[4] = "018270";
        noRekening[4] = "2000018270";

        for (int i = 0; i < id.length; i++) {
            if (idPengguna.equalsIgnoreCase(id[i]) && Pin.equals(pin[i]) && rekening.equals(noRekening[i])) {
                if (i == 0) {
                    nama = "syahru wardana";
                    saldo = 999999999;
                } else if (i == 1) {
                    nama = "andi mulya firman";
                    saldo = 350000000;
                } else if (i == 2) {
                    nama = "bagas tsiqah";
                    saldo = 570000000;
                }
                else if (i == 3){
                    nama = "nur fauzi";
                    saldo = 250000000;
                }
                else if (i == 4){
                    nama = "Dewa putra";
                    saldo = 650000000;
                }
            }
        }
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo(long saldo){
        this.saldo = saldo;
        return this.saldo;
    }
    public boolean loginCheck() {
        int i = 0;
        while (i<3){
            if (nama != null) {
                System.out.println("LOGIN SUCCESS!!!");
                System.out.println("Selamat datang " + nama);
                return true;
            } else {
                System.out.println("Nomor Rekening Salah!!!");
                return false;
            }
        }
        System.out.println("Maaf,Akun Anda Telah Terblokir");
        return false;
    }


    public void lihatSaldo() {
        System.out.println("Your Balances Rp " + saldo);
    }
    public void tarikUang() {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Rp  50.000     4. Rp  500.000");
        System.out.println("2. Rp 100.000     5. Rp 1.000.000");
        System.out.println("3. Rp 200.000     6. Rp 2.000.000");
        System.out.print("Enter Option: ");
        byte pil = in.nextByte();
        this.setNominal(pil);
    }
    public void transferUang(customer A) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of money transferred : Rp ");
        long uang = in.nextInt();
        System.out.println("you have transferred Rp " + uang);
        saldo = saldo - uang;
        A.saldo = A.saldo + uang;
        this.getSaldo(saldo);
    }
    public void setNominal(byte pil) {
        if (pil == 1) {
            saldo = saldo - 50000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 2) {
            saldo = saldo - 100000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 3) {
            saldo = saldo - 200000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 4) {
            saldo = saldo - 500000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 5) {
            saldo = saldo - 1000000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 6) {
            saldo = saldo - 2000000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else {
            System.out.println("ERROR!");
        }
    }
}
