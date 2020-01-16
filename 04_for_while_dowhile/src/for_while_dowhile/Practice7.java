package for_while_dowhile;

public class Practice7 {

	public static void main(String[] args) {
		int dan, i, j;
//		for(i=2;i<10;i+=3) {
//			for(j=1;j<10;j++){
//				for(dan=i;dan<=i+2&&dan<10;dan++) {
//					System.out.print(dan+"*"+j+"="+dan*j+"\t");
//				}				
//			System.out.println();
//			}
//			System.out.println();
//		}

		for (int w = 2; w <= 8; w += 3) {
			for (i = 1; i <= 9; i++) {
				for (dan = w; dan <= w + 2; dan++) {
					if(dan!=10)System.out.print(dan + "*" + i + "=" + dan * i + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
