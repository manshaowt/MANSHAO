//老虎类
public class Tiger extends Animal {

	private String name;
	
	public Tiger(String name) {
		// TODO 自动生成的构造函数存根
		this.name = name;
	}

	@Override
	public void shout() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void eat(Food food) {
		// TODO 自动生成的方法存根
		System.out.println(name+":吼~");
    	System.out.println(name+"正在吃着香喷喷的"+food);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
