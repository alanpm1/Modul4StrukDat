/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author alan
 */
public class Mahasiswa {
     String nama, kelas, matkulPraktikum;

    int nim;

    public Mahasiswa(String namaMhs, String klsMhs, String matkulMhs, int nimMhs) {
        nama = namaMhs;
        kelas = klsMhs;
        matkulPraktikum = matkulMhs;
        nim = nimMhs;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            HashMap<String, Mahasiswa> mhs = new HashMap<String, Mahasiswa>();

            String input;
            Mahasiswa data;

            mhs.put("1", new Mahasiswa("Alan", "4K", "Struktur Data", 325));
            mhs.put("2", new Mahasiswa("Nala", "4K", "Pemrograman Lanjut", 999));
            mhs.put("3", new Mahasiswa("Alan Nala", "3G", "Pemrograman Berorientasi Object", 333));

            System.out.print("Masukkan ID: ");
            input = scn.nextLine();
            data = mhs.get(input);
            if (data != null) {
                System.out.println("Data mahasiswa" + data.nama
                        + ", kelas : " + data.kelas + ", mata kuliah praktikum : "
                        + data.matkulPraktikum + ", nim : " + data.nim);
            } else {
                System.out.println("Data tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
