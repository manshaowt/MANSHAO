//测试类
public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Feeder feeder = new Feeder("花花");
        feeder.speak();        
        Dog dog = new Dog("小布丁");
        Bone food1 = new Bone("骨头");
        feeder.feed(dog, food1);  
        Tiger tiger = new Tiger("小猫崽");
        Chicken food2 = new Chicken("小公鸡");
        feeder.feed(tiger , food2);
	}

}
