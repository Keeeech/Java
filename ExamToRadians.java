public class ExamToRadians{
	public static void main(String[] args){
		double p = 3.14;
		double d = Double.parseDouble(args[0]);
		double r = d * (p / 180);
		System.out.println("programmed by Kiichi Takara");
		System.out.println(d + "度 = " + r + "ラジアン");
	}
}
