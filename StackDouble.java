package tugasselanjutnya;

import java.util.ArrayList;

public class StackDouble {

				ArrayList<Double> TinggiBadan = new ArrayList<Double>();
				int Top = -1;
				
				public void push(Double value) {
					TinggiBadan.add(value);
					Top = Top+1;
					}
				
				public double pop() {
					double value = TinggiBadan.get(Top);
					TinggiBadan.remove(Top);
					Top = Top-1;
					return value;
				}
				
				public void cetak() {
					System.out.println(TinggiBadan.toString());
				}
				
			

		



	}
		

