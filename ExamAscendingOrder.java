public class ExamAscendingOrder {
	public static void main(String[] args) {
		System.out.println("programmed by Kiichi Takara");
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		double[] num = new double[3];
		
		for(int i = 0; i < args.length; i++)
			num[i] = Double.parseDouble(args[i]);
		
		System.out.println("ソート後\n" + Arrays.toString(num));
	}
}

