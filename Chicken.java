//鸡肉类
public class Chicken extends Animal implements Food {
	private String name;
	public Chicken(String name) {
		// TODO 自动生成的构造函数存根
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return name;
	}
	
	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		System.out.println(name+":啊~");
	}

	@Override
	public void eat(Food food) {
		// TODO 自动生成的方法存根

	}

}
