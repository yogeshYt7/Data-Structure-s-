package RedBus;

public class RedBus {
	String[] arr;

	public RedBus(int number_of_search) {
		arr = new String[number_of_search];
	}

	public void ticketbooking(int seatNo, String passengerName) {
		try {
			if (arr[seatNo] == null) {
				arr[seatNo] = passengerName;
				System.out.println("The Seat Number " + seatNo + " is booked");
			} else {
				System.out.println("Already booked");
			}
		} catch (Exception e) {
			System.err.println("Driver seat lo vachi kurchoo ra p*****k******");
		}

	}

	public void DisplayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "\t" + arr[i]);
		}
	}

//	public int passengerDetails(int seatNo, String passengerName) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == passengerName) {
//				System.out.println(passengerName + "is in seat no" + seatNo);
//				return 0;
//			}
//		}
//		return seatNo;
//	}
//
//	public void Cancellation(int seatNo) {
//		try {
//			arr[seatNo]=0;
//			System.out.println("The value id Deleted");
//		} catch (Exception e) {
//			System.out.println("Invalid location");
//		}
//	}

}
