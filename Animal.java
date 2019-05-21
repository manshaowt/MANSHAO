//动物类
public abstract class Animal {
	private String name;
    public Animal() {
	}
    public abstract void shout();
    public abstract void eat(Food food);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
