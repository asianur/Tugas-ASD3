package tugasselanjutnya;
	import java.util.ArrayList;

	public class QueueDouble {
		ArrayList<Double> TinggiBadan = new ArrayList<Double>();
		int back = -1;
		
		public void insert (double value){
			TinggiBadan.add(value);
		}
		public double get(){
			double value = TinggiBadan.get(0);
			TinggiBadan.remove(0);
			return value;
		}
		public void cetak(){
			System.out.println("Values:"+ TinggiBadan.toString());
//			System.out.println("[");
//			boolean pertama = true;
//			for (double d : beratBadan){
//				if (pertama){
//					pertama = false;
//				}else{
//					
//				}
//			System.out.print(d);
//			System.out.println(", ");
//		}
//			System.out.print("]\n");
		}
	}
