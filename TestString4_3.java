import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString4_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		String str="asdfesdafe222.111.222.111asdwdf111.111.222.222saw";
		String s = str.replace("(.)(\\1)*","$1");
		System.out.println(s);
	}

}
