import java.io.IOException;
import java.util.Scanner;

public class PowertoInteger {

	public static void main(String[] args) {

		int rice = 1;
		for (int i = 1; i <= 64; i++) {
			rice = rice + rice * 2;

		}
		System.out.println(rice);
	}
}
