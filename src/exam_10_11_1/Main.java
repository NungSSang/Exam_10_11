package exam_10_11_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("가로를 입력 해 주세요: ");
		int width = sc.nextInt();
		System.out.println("세로를 입력 해 주세요: ");
		int height = sc.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
