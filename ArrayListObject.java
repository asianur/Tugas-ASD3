package tugasselanjutnya;

import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Mahasiswa> List = new ArrayList<Mahasiswa>();
		List.add(new Mahasiswa("asiah", "D0217005", "Informatika A 2017", "pasangkayu"));
		List.add(new Mahasiswa("nurul", "D0217002", "Informatika A 2017", "Bogor"));
		List.add(new Mahasiswa("anti", "D0217006", "Informatika A 2017", "Sendana"));
		
		for (int i = 0; i < List.size(); i++) {
			System.out.println("Nama : " + List.get(i).getNama() + " || Nim : " + List.get(i).getNim() +" || Kelas : " + List.get(i).getKelas() + "|| Alamat : " + List.get(i).getAlamat());
		}
	
		

	}

}
