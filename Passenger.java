package flight;
//�ÿ���
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
		// TODO �Զ����ɵķ������
		return names;
	}

	@Override
	public int getBookingNumber() {
		// TODO �Զ����ɵķ������
		return bookingNumber;
	}

	@Override
	public int getRow() {
		// TODO �Զ����ɵķ������
		return rows;
	}

	@Override
	public int getSeatPosition() {
		// TODO �Զ����ɵķ������
		return seatPosition;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
