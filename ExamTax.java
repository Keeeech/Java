public class ExamTax {
	public static void main (String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		int b = (int) a * 108 / 100;
		int c = (int) (a * 108 + 99) / 100;
		int d = (int) (a * 108 + 50) / 100;
		System.out.println("切り捨て価格 : " + b );
		System.out.println("切り上げ価格 : " + c );
		System.out.println("四捨五入価格 : " + d );
	}
}
