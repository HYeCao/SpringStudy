package spring_DI;

public class BookServiceImpl implements BookService {


	//��ʽһ���ӿ�=ʵ����
	//private BookDao=new BookDaoImpl
	
	//��ʽ�����ӿ�+setter
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {	
		this.bookDao=bookDao;
	}
	@Override
	public void addBook() {
		this.bookDao.save();
	}

}
