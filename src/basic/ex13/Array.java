package basic.ex13;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Array extends JFrame {

	private BufferedImage image;

	int[][] Map;
	int x;
	int y;

	public Array() {
		Map = new int[600][1000];

		for (int i = 0; i < 600; i++) {
			for (int j = 0; j < 1000; j++) {

				System.out.print("[" + Map[i][j] + "]");

			}
			System.out.println();

		}
		System.out.println("성공");
	}
}