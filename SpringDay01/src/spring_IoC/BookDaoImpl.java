package spring_IoC;

public class BookDaoImpl implements BookDao {
	private  String message=" message mess"; 
	public  void addBook(){
		System.out.println("add a book!!");
	}
	public  void getMessage(){
		System.out.println(this.message);
	}
	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}
}
