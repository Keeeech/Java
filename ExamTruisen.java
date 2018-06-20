public class ExamTruisen {
	public static void main(String[] args)  {
		System.out.println("programmed by KiichiTakara");
		int a = Integer.parseInt(args[0]);
		int b = 1000 - a;
		int r = b / 500;
		int w = r / 100;
		int x = w / 50;
		int y = x / 10;
		int z = y / 5;
		int t = z / 1;
		System.out.println("500円玉"+r+"個"+"100円玉"+w+"個"+"50円玉"+x+"個"+"10円玉"+y+"個"+"5円玉"+z+"個"+"1円玉"+t+"個");
	}
}
