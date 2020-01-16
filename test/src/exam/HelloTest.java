package exam;

class HelloTest {
	public static void main(String[] args) {
		System.out.println("¾È³çÇÏ¼¼¿ä");
		System.out.print("¹Ý°©½À´Ï´Ù\n");
		System.out.println("»ç°ú" + "¿À·»Áö");
		System.out.println(25 + 36);
		System.out.println("25" + "36");
		System.out.println("25+36=" + 25 + 36);
		System.out.println("25+36=" + (25 + 36));
		System.out.println("25/36=" + (25 / 36));
		System.out.println("25/36=" + (25.0 / 36));
		System.out.println("25/36=" + (int) (25.0 / 36 * 10 + 0.5) / 10.0);
		System.out.println("25/36=" + String.format("%.1f", (25.0 / 36)));
		
	}
}
