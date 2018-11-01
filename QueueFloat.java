package tugasselanjutnya;

import java.util.ArrayList;
		public class QueueFloat {
			ArrayList<Float> BeratBadan = new ArrayList<Float>();
			int back = -1;
			
			public void insert (float value){
				BeratBadan.add(value);
			}
			public float get(){
				float value = BeratBadan.get(0);
				BeratBadan.remove(0);
				return value;
			}
			public void cetak(){
				System.out.println("Values:"+ BeratBadan.toString());
//				System.out.println("[");
//				boolean pertama = true;
//				for (float d : container){
//					if (pertama){
//						pertama = false;
//					}else{
//						
//					}
//				System.out.print(d);
//				System.out.println(", ");
//			}
//				System.out.print("]\n");
			}
		}
