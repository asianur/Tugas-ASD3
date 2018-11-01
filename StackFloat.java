package tugasselanjutnya;

import java.util.ArrayList;

public class StackFloat {

	ArrayList<Float> BeratBadan = new ArrayList<Float>();
	int Top = -1;
	
	public void push(Float value) {
		BeratBadan.add(value);
		Top = Top+1;
		}
	
	public double pop() {
		float value = BeratBadan.get(Top);
		BeratBadan.remove(Top);
		Top = Top-1;
		return value;
	}
	
	public void cetak() {
		System.out.println(BeratBadan.toString());
	}

}
