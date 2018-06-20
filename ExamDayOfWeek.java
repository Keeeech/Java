public class ExamDayOfWeek {
	public static void main(String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		if (a == 0)
			System.out.println("Sunday");
		else if (a == 1)
                        System.out.println("Monday");
		else if (a == 2)
                        System.out.println("Tuesday");
		else if (a == 3)
                        System.out.println("Wednesday");
		else if (a == 4)
                        System.out.println("Thursday");
		else if (a == 5)
                        System.out.println("Friday");
		else if (a == 6)
                        System.out.println("Saturday");
		else
			System.out.println("0～6の数値を入力しなさい");
	}
}
