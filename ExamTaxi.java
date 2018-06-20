public class ExamTaxi {
	public static void main(String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int m = Integer.parseInt(args[0]);
		int b,c = 0,num;

		if (m <= 2000)
			System.out.println(m + "mは500円です");
		else
			c = m - 2000;
			b = c % 500;
			if (b == 0)
				num = (c / 500) * 100 + 500;
			else
				num = (c / 500) * 100 + 500 + 100;
			System.out.println(m + "mの料金は" + num + "円です");
	}
}
