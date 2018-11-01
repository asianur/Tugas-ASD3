package tugasselanjutnya;

import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
			//membuat Sebuah List dengan tipe String untuk menyimpan nama buah
				ArrayList <String> ListBuah = new ArrayList <>();
				
			//mengetahui umlah elemen dalam listBuah
				System.out.println("Jumlah Elemen listBuah awal adalah "+ ListBuah.size());
				
			//menambahkan 3 buah kedalam list
				ListBuah.add("apel");
				ListBuah.add("rambutan");
				ListBuah.add("jeruk");
			
			//mengetahui jumlah elemen dalam listBuah 
				System.out.println("size ListBuah sekarang adalah " + ListBuah.size());
				
			//memeriksa apakah list mengandung elemen tertentu
				System.out.println("apakah rambutan terdapat dalam ListBuah ? " + ListBuah.contains("rambutan"));
				
			//mengetahui lokasi elemen tertentu dalam list
				System.out.println("pada index berapakah rambutan terdapat dalam ListBuah ? " + ListBuah.indexOf("rambutan"));
				
			//memasukkan elemen lain pada index 2
				ListBuah.add(2, "durian");
				//List sekarang adalah [apel, rambutan, durian, jeruk]
			
			//mengahapus apel dari ListBuah
				ListBuah.remove("apel");
				//list sekarang adalah [rambutan, durian, jeruk]
				
			//menampilkan konten dalam list
				System.out.println("konten dari List sekarang adalah " + ListBuah.toString());
		}



	}

