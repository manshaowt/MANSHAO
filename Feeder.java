//喂养员类
public class Feeder {
	private String name;
    public Feeder(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("欢迎来到动物园！");
        System.out.println("我是饲养员 "+getName());
    }
    public void feed(Animal a, Food food) {
        a.eat(food);
        if(food instanceof Animal){//如果食物是活的动物，被吃会惨叫
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
		// TODO 自动生成的方法存根

	}

}
