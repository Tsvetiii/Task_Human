
public class EGNExtractor {
	public static String extractEGN(long EGN) {
		if (EGN /10 %10 % 2 == 0) {
			return "male";
		} else {
			return "female";
		}
	}
}
