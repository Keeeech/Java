public class ExamKeta {
	public static void main (String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		int w = a % 10;
		int x = a / 10;
		int xx = x % 10;
		int y = x / 10;
		int yy = y % 10;
		int z = y / 10;
		int zz = z % 10;
		System.out.println("1の位の数値　=" + w);
		System.out.println("10の位の数値　=" + xx);
		System.out.println("100の位の数値　=" + yy);
		System.out.println("1000の位の数値　=" + zz);
	}
}
