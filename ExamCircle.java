public class ExamCircle {
	public static void main (String[] args){
		double p = 3.14;
		double r = Double.parseDouble(args[0]);
		double l = r * 2 * p;
		double s = r * r * p;
		System.out.println("programmed by Kiichi Takara");
		System.out.println("半径" + r + "の円周の長さ =" + l);
		System.out.println("半径" + r + "の円の面積 =" + s);
	}
}
