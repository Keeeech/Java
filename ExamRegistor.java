public class ExamRegistor{
	public static void main (String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double x = (a * b) / (a + b);
		System.out.println("programmed by Kiichi Takara");
		System.out.println(a + "Ω" + b + "Ω" + "の合成抵抗は" + x + "Ω");
	}
}		
