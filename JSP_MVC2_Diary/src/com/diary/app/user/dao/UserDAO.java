package com.diary.app.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.diary.mybatis.config.SqlMapConfig;

public class UserDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public UserDAO() {
		sqlsession = sessionf.openSession(true);
	}
	
	public boolean join(UserBean user) {
		boolean check = false;
		if(sqlsession.insert("User.join", user) == 1) {
			check = true;
		};
		return check;
	}
	public void userDetail() {}
	public void updateUserInfo() {}
	public void secession() {}
}
