public class ExamRank {
	public static void main (String[] args) {
		System.out.println("programmed by Kiichi Takara");
		int a = Integer.parseInt(args[0]);
		if (90 <= a)
			System.out.println(a + "点はSです");
		else if (80 <= a & a <= 89)
			System.out.println(a + "点はAです");
		else if (70 <= a & a <= 79)
			System.out.println(a + "点はBです");
		else if (60 <= a & a <= 69)
			System.out.println(a + "点はCです");
		else
			System.out.println(a + "点はFです");
	}
}
