
public class TestString2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str = "i have an apple";
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.delete(7, sb1.length()));//ɾ��
		System.out.println(sb1.reverse());//����
		
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2.append(" pen"));//���
		System.out.println(sb2.insert(str.length(), " and"));//����
		
		String s = new String(sb2);
		System.out.println(s+"!");
	}

}
