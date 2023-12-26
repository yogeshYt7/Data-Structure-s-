package RedBus;

public class Booking {
	public static void main(String[] args) {
		RedBus R = new RedBus(10);
		R.ticketbooking(0, "Ranjith");
		R.ticketbooking(1, "Uday");
		R.ticketbooking(8, "Yogesh");
		R.ticketbooking(7, "Hari");
		R.ticketbooking(5, "Dhanu");
		R.ticketbooking(9, "Anand");
		R.ticketbooking(4, "Abhii");
		R.ticketbooking(3, "swammy");
		R.ticketbooking(6, "Rekha");
		R.ticketbooking(2, "Umesh");
		R.ticketbooking(0, "Siddesh");
		R.DisplayData();
//		R.passengerDetails(0, null);
//		R.Cancellation();
		}

}
