package serviceImpl;

import accountDao.AccountDao;
import service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//�ϵ�
//		int i = 1/0;
		accountDao.in(inner, money);
	}

}
