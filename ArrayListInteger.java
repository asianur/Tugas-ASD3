package tugasselanjutnya;

import java.util.ArrayList;
public class ArrayListInteger {

	public static void main(String[] args) {
		
	//membuat Sebuah List dengan tipe Integer untuk menyimpan angka
		ArrayList <Integer> ListAngka = new ArrayList<>();
		
	//mengetahui jumlah elemen dalam listAngka
		System.out.println("Jumlah Elemen listAngka awal adalah "+ ListAngka.size());
		
	//menambahkan 3 Angka kedalam list
		ListAngka.add(3);
		ListAngka.add(6);
		ListAngka.add(9);
	
	//mengetahui jumlah elemen dalam listAngka 
		System.out.println("size ListAngka sekarang adalah " + ListAngka.size());
		
	//memeriksa apakah list mengandung elemen tertentu
		System.out.println("apakah 6 terdapat dalam ListAngka ? " + ListAngka.contains(6));
		
	//mengetahui lokasi elemen tertentu dalam list
		System.out.println("pada index berapakah 6 terdapat dalam ListAngka ? " + ListAngka.indexOf(6));
		
	//memasukkan elemen lain pada index 2
		ListAngka.add(2, 7);
		//List sekarang adalah [3, 6, 7, 9]
		
	//menampilkan konten dalam list
		System.out.println("konten dari List sekarang adalah " + ListAngka.toString());
	}

}
