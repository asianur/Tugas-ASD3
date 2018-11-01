package tugasselanjutnya;

public class MainStackFloat{

	public static void main(String[] args) {
		StackFloat BeratBadan = new StackFloat();
		BeratBadan.cetak();
		
		BeratBadan.push((float)45.5);BeratBadan.cetak();
		BeratBadan.push((float)34.5);BeratBadan.cetak();
		BeratBadan.push((float)45.4);BeratBadan.cetak();
		BeratBadan.push((float)54.5);BeratBadan.cetak();

		Double BB = BeratBadan.pop();BeratBadan.cetak();
		System.out.println(BeratBadan);

	}

}
