package class_1;

class BookShop {
	private String bookName, author;
	private int price;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class Practice1 {

	public static void main(String[] args) {
		BookShop[] bs = new BookShop[2];
		bs[0] = new BookShop();
		bs[1] = new BookShop();	
		
		bs[0].setBookName("�ڹٿϼ�");
		bs[0].setAuthor("��ϼ�");
		bs[0].setPrice(25000);
		
		bs[1].setBookName("JSP���");
		bs[1].setAuthor("��JP");
		bs[1].setPrice(35000);
		
		for(BookShop data : bs) {
			System.out.println("å�̸� : "+data.getBookName());
			System.out.println("��   �� : "+data.getAuthor());
			System.out.println("��   �� : "+data.getPrice()+"��");
			System.out.println();
		}
	}

}
