package serviceImpl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import accountDao.AccountDao;
import service.AccountService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//¶Ïµç
//		int i = 1/0;
		accountDao.in(inner, money);
	}

}
