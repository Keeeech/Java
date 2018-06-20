public class ExamShiftR {
	public static void main (String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int a = x >>> y;
		System.out.println(x + ">>>" + y + "の値は" + a);
	}
}
