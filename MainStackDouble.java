package tugasselanjutnya;

public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble TinggiBadan = new StackDouble();
		TinggiBadan.cetak();
		
		TinggiBadan.push(455.54);TinggiBadan.cetak();
		TinggiBadan.push(344.5);TinggiBadan.cetak();
		TinggiBadan.push(456.44);TinggiBadan.cetak();
		TinggiBadan.push(546.5);TinggiBadan.cetak();

		Double TB = TinggiBadan.pop();TinggiBadan.cetak();
		System.out.println(TinggiBadan);

	}

}
