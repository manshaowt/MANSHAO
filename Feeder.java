//ι��Ա��
public class Feeder {
	private String name;
    public Feeder(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("��ӭ��������԰��");
        System.out.println("��������Ա "+getName());
    }
    public void feed(Animal a, Food food) {
        a.eat(food);
        if(food instanceof Animal){//���ʳ���ǻ�Ķ�����Ի�ҽ�
        	a=(Animal)food;
        	a.shout();
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
