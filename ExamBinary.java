public class ExamBinary {
	public static void main(String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		int w = a % 10;
		int ww = w * 1;
		int x = w / 10;
		int x1 = x % 10;
		int xx = x1 * 2;
		int y = x / 10	;
		int y1 = y % 10;
		int yy = y1 * 4;
		int z = y / 10;
		int z1 = z % 10;
		int zz = z1 * 8;
		int t = z / 10;
		int t1 = t % 10;
		int tt = t1 * 16;
		int s = ww + xx + yy + zz + tt;
		System.out.println("2進法の "+ a + " は10進法では " + s );
	}
}	
