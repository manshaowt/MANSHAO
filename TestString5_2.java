import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestString5_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LocalDate curdate = LocalDate.now();//��ȡ��ǰ����
		System.out.println(curdate);
		System.out.println(curdate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		System.out.println(curdate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println(curdate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println(curdate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		LocalTime curtime = LocalTime.now();//��ȡ��ǰʱ��
		System.out.println(curtime);
		System.out.println(curtime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		System.out.println(curtime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		System.out.println(curtime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
		
		LocalDateTime curdatetime = LocalDateTime.now();//��ȡ��ǰ����ʱ��
		System.out.println(curdatetime);
		System.out.println(curdatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println(curdatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println(curdatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		System.out.println(curdatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG)));
	}

}
