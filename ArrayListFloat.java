package tugasselanjutnya;

import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
		//membuat Sebuah List dengan tipe Float untuk menyimpan angka
				ArrayList <Float>BeratBadan = new ArrayList<>();
				
			//mengetahui jumlah elemen dalam BeratBadan
				System.out.println("Jumlah Elemen BeratBadan awal adalah "+ BeratBadan.size());
				
			//menambahkan 3 Angka kedalam list
				BeratBadan.add((float) 45.5);
				BeratBadan.add((float) 34.5);
				BeratBadan.add((float) 45.4);
			
			//mengetahui jumlah elemen dalam BeratBadan 
				System.out.println("size BeratBadan sekarang adalah " + BeratBadan.size());
				
			//memeriksa apakah list mengandung elemen tertentu
				System.out.println("apakah 45.5 terdapat dalam BeratBadan ? " + BeratBadan.contains(45.5));
				
				
			//memasukkan elemen lain pada index 2
				BeratBadan.add((float) 54.5);
				//List sekarang adalah [45.5, 34.5, 54.5, 45.4]
			
				
			//menampilkan konten dalam list
				System.out.println("konten dari List sekarang adalah " + BeratBadan.toString());	

	}

}
