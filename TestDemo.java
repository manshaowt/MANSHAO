//������
public class TestDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Feeder feeder = new Feeder("����");
        feeder.speak();        
        Dog dog = new Dog("С����");
        Bone food1 = new Bone("��ͷ");
        feeder.feed(dog, food1);  
        Tiger tiger = new Tiger("Сè��");
        Chicken food2 = new Chicken("С����");
        feeder.feed(tiger , food2);
	}

}
