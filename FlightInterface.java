package flight;
//����ӿ�
public interface FlightInterface {

	public int[] reserve(String[] names);//Ԥ��������λ
	
	public boolean cancel(int bookingNumber);//ȡ��Ԥ����λ
	
	public Passenger[] getPassengerList();//�����ÿ��б�
	
	}
