package denemeler7;

public class DiziOrnegi {
	public static void main(String[] args) {
		int[] sayilar = new int[3];
		int[] s = { 1, 2, 3, 4 };
		int[][] s2 = new int[2][1];
		s2[0] = s;
		s2[1] = s2[0];
		System.out.println(s2[1][1]);
		System.out.println(s2[0][2]);
		System.out.println(s2[1][2]);
		s2 = new int[2][];
		System.out.println(s2[0]);
		s2[0] = new int[3];
		s2[1] = new int[1];
		System.out.println(s2[0][1]);
	}
}
