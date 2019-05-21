package flight;
//航班类
public class Flight implements FlightInterface {

	private String flightName;
	private int row;
	private int rowLength;
	private int[] fail = {-1};
	private Passenger[] passengerList;
	
	public Flight(String FlightName,int rows,int rowLength) throws Exception{
		if(FlightName == null||FlightName.trim().length() == 0||rows <= 0||rowLength <= 0)
			throw new Exception("Error");
		else {
			this.flightName = FlightName;
			this.row = rows;
			this.rowLength = rowLength;
			this.passengerList = new Passenger[row * rowLength];
			for(int i = 0;i < row*rowLength;i++) 
				passengerList[i] = null;
		}
	}
	
	public int[] reserve(String names[]) {//预订航班座位
		if(names.length > rowLength)
			return fail;
		int i = 0,j = 0,k = 0;
		boolean flag = false;//T--能安排  F--不能安排
		labelA:for(i = 0;i <= row - 1;i++) {//在同一排找相邻且没有被预订的座位，座位的个数是 names.length
			for(j = 0;j <= rowLength - names.length;j++) {
				for(k = j;k <= j + names.length - 1;k++) {
					if(passengerList[i * rowLength + k] != null)
						break;
				}
				if(k > j +names.length - 1) {
					flag = true;
					break labelA;
				}
			}
		}
		if(!flag)
			return fail;
		int[] bn = new int[names.length ];//每一个旅客返回一个预订号
		for(k = j;k <= j + names.length - 1;k++) {
			bn[k - j] = i * rowLength + k + 1;
			passengerList[i * rowLength + k] = new Passenger(names[k - j],i * rowLength + k + 1,i,k);
		}
		return bn;
	}
	
	public boolean cancel(int bookingNumber) {//取消预订座位
		boolean Status = false;
		for(int i = 0;i < row * rowLength;i++) {
			if(passengerList[i] != null && bookingNumber == passengerList[i].getBookingNumber()) {
				Status = true;
				passengerList[i] = null;
				break;
			}
		}
		return Status;
	}
	
	public Passenger[] getPassengerList() {
		return passengerList;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	

}
