package tugasselanjutnya;

public class MainQueueString {

			public static void main(String[] args) {
				QueueString ListBuah = new QueueString();
				ListBuah.cetak();
				
				ListBuah.push("Julliana");ListBuah.cetak();
				ListBuah.push("rambutan");ListBuah.cetak();
				ListBuah.push("durian");ListBuah.cetak();
				ListBuah.push("jeruk");ListBuah.cetak();
				
				String Buah = ListBuah.pop();ListBuah.cetak();
				System.out.println(ListBuah);

			}

	}
