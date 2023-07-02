import javax.swing.*;
import java.util.Scanner;
public class Buku {
    private String judulBuku="Konsep Dasar Pemrograman Java";
    private String pengarangBuku="Patrick Naughton";
    private int stokBuku=27;
    private int hargaBuku=75000;

    public int hitungBayar(int jml){
       return hargaBuku * jml;
    }
    public int hitungSisa(int jml){
         return stokBuku - jml;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Penjualan Buku");
        frame.setBounds(500, 500, 500, 300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Scanner sc = new Scanner(System.in);

        System.out.println(" Masukkan Data Pembeli ");
        System.out.print("Nama : ");
        String nama = sc.nextLine();

        System.out.print("Alamat : ");
        String alamat = sc.nextLine();

        System.out.print(" Jml Pembelian : ");
        int jml = sc.nextInt();

        Buku buku = new Buku();

        System.out.println("        Data Buku Yang Akan Dibeli");
        System.out.println("Judul Buku : "+ buku.judulBuku);
        System.out.println("Nama Pengarang : "+ buku.pengarangBuku);
        System.out.println("Stok Buku : "+ buku.stokBuku);
        System.out.println("Harga Buku : "+ buku.hargaBuku);
        System.out.println();

        System.out.println("        Data Pembeli");
        System.out.println("Nama Pembeli : "+ nama);
        System.out.println("Alamat Pembeli : "+ alamat);
        System.out.println("Jumlah Pembelian : "+ jml);
        System.out.println();

        System.out.println("        Laporan Pembelian");
        System.out.println("Nama Pembeli : "+ nama);
        System.out.println("Alamat Pembeli : "+ alamat);
        System.out.println("Jumlah Pembelian : "+ jml);
        System.out.println("Nama Pembeli : "+ nama);
        System.out.println("Alamat Pembeli : "+ alamat);
        System.out.println("Jumlah Pembelian : "+ jml);
        System.out.println("Total Pembelian : "+ buku.hitungBayar(jml));
        System.out.println();

        System.out.println("        Laporan Stok Akhir");
        System.out.println(" Stok Akhir Buku : "+ buku.hitungSisa(jml));

    }
}
