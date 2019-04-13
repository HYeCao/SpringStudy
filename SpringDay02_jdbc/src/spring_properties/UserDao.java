package spring_properties;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao extends JdbcDaoSupport{
	private JdbcTemplate jdbcTemplate;
	
	public void update(User user){
		String sql="update t_user set username=?,password=? where id=?";
		Object[] args={user.getUsername(),user.getPassword(),user.getId()};
		this.getJdbcTemplate().update(sql,args);
	}
}
