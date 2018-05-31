package fundamentals.chapter4.sec10_javabeans;
/*
 * 次の本クラスをJavaBeans仕様にしてください。
 */
public class Book {
	private String title;
	private int price;
	private int page;
	private String writerName;

	public Book(String title,int price,int page,String writerName) {
		this.title = title;
		this.price = price;
		this.page = page;
		this.writerName = writerName;
	}
	public Book() {

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
}
