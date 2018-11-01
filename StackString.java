package tugasselanjutnya;

import java.util.ArrayList;

public class StackString {

				ArrayList<String> ListBuah = new ArrayList<String>();
				int Top = -1;
				
				public void push(String value) {
					ListBuah.add(value);
					Top = Top+1;
					}
				
				public String pop() {
					String value = ListBuah.get(Top);
					ListBuah.remove(Top);
					Top = Top-1;
					return value;
				}
				
				public void cetak() {
					System.out.println(ListBuah.toString());
				}
				
			

		



	}
		

