package tugasselanjutnya;

import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
		//membuat Sebuah List dengan tipe Double untuk menyimpan angka
			ArrayList <Double> TinggiBadan = new ArrayList<>();
						
					//mengetahui jumlah elemen dalam listAngka
						System.out.println("Jumlah Elemen TinggiBadan awal adalah "+ TinggiBadan.size());
						
					//menambahkan 3 Angka kedalam list
						TinggiBadan.add((double) 455.54);
						TinggiBadan.add((double) 344.5);
						TinggiBadan.add((double) 456.44);
					
					//mengetahui jumlah elemen dalam TinggiBadan
						System.out.println("size TinggiBadan sekarang adalah " + TinggiBadan.size());
						
					//memeriksa apakah list mengandung elemen tertentu
						System.out.println("apakah 455.54 terdapat dalam TinggiBadan ? " + TinggiBadan.contains(455.54));
						
					//memasukkan elemen lain pada index 2
						TinggiBadan.add((double) 546.5);
						//List sekarang adalah [455.54, 344.5, 546.5, 456.44]
					
						
					//menampilkan konten dalam list
						System.out.println("konten dari List sekarang adalah " + TinggiBadan.toString());	

			}

		


	}


