public class ExWarizan {
	public static void main (String[] args){
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = a / b;
		int y = a % b;
		System.out.println(a + "÷" + b + "の商 =" + x);
		System.out.println(a + "÷" + b + "の余り =" + y);
	}
}
