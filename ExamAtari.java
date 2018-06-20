public class ExamAtari {
	public static void main(String[] args) {
		System.out.println("programmed by Kiichi");
		int x = Integer.parseInt(args[0]);
		if (3 <= x & x <= 5)
			System.out.println("当たり");
		else if (0 <= x & x < 3)
			System.out.println("ニアミス");
		else if (5 < x & x <= 8)
			System.out.println("ニアミス");
		else
			System.out.println("はずれ");
	}
}
			
