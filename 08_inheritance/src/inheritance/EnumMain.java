package inheritance;

enum EnumColor{
	RED, GREEN, BLUE, MAGENTA
}

//--------------
public class EnumMain {
	String colorName;
	EnumColor color;

	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		System.out.println();
		
		EnumMain em = new EnumMain();
		em.colorName = "»¡°­";
		em.color = EnumColor.RED;
		System.out.println(em.colorName+"\t"+em.color);
		System.out.println();
		
		em.colorName = "º¸¶ó";
		EnumColor VIOLET = EnumColor.MAGENTA;
		System.out.println(em.colorName+"\t"+VIOLET);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {
			System.out.println(data+"\t"+data.ordinal()+"\t"+data.valueOf(data+""));
		}

	}

}
