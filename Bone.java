//骨头类
public class Bone implements Food {

	private String name;
	public Bone(String name) {
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

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
