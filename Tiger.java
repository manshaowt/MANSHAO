//�ϻ���
public class Tiger extends Animal {

	private String name;
	
	public Tiger(String name) {
		// TODO �Զ����ɵĹ��캯�����
		this.name = name;
	}

	@Override
	public void shout() {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void eat(Food food) {
		// TODO �Զ����ɵķ������
		System.out.println(name+":��~");
    	System.out.println(name+"���ڳ����������"+food);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
