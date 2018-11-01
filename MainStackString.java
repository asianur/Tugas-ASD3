package tugasselanjutnya;

public class MainStackString {

	public static void main(String[] args) {
		StackString Buah = new StackString();
		Buah.cetak();
		
		Buah.push("rambutan");Buah.cetak();
		Buah.push("durian");Buah.cetak();
		Buah.push("jeruk");Buah.cetak();
		

		String ListBuah = Buah.pop();Buah.cetak();
		System.out.println(ListBuah);
		
	}



	}

