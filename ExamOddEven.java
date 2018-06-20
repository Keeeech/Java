public class ExamOddEven {
	public static void main(String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		int b = a % 2;
		if (b == 0)
			System.out.println(a + "は偶数です。");
		else if (b == 1)
			System.out.println(a + "は奇数です。");
	}
}
