package flight;
//航班接口
public interface FlightInterface {

	public int[] reserve(String[] names);//预订航班座位
	
	public boolean cancel(int bookingNumber);//取消预订座位
	
	public Passenger[] getPassengerList();//返回旅客列表
	
	}
