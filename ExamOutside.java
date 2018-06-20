public class ExamOutside {
	public static void main (String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		double b = 1.0;
		double c = 5.0;
		boolean d = (a <= b) | (c <= a);
		System.out.println(a + "<=" + b + "|" + c + "<=" + a + "の値は" + d);
	}
}
