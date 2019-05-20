package flight;
//旅客类
public class Passenger implements PassengerInterface {

	private String names;
	private int bookingNumber;
	private int rows;
	private int seatPosition;
	
	public Passenger(String names,int bookingNumber,int rows,int seatPosition) {
		this.names = names;
		this.bookingNumber = bookingNumber;
		this.rows = rows;
		this.seatPosition = seatPosition;
		
	}
	
	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return names;
	}

	@Override
	public int getBookingNumber() {
		// TODO 自动生成的方法存根
		return bookingNumber;
	}

	@Override
	public int getRow() {
		// TODO 自动生成的方法存根
		return rows;
	}

	@Override
	public int getSeatPosition() {
		// TODO 自动生成的方法存根
		return seatPosition;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
