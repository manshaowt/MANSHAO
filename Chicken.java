//������
public class Chicken extends Animal implements Food {
	private String name;
	public Chicken(String name) {
		// TODO �Զ����ɵĹ��캯�����
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return name;
	}
	
	@Override
	public void shout() {
		// TODO �Զ����ɵķ������
		System.out.println(name+":��~");
	}

	@Override
	public void eat(Food food) {
		// TODO �Զ����ɵķ������

	}

}
