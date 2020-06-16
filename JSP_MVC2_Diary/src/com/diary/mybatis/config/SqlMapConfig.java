package com.diary.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	private static SqlSessionFactory sqlsession;
	
	// Ŭ���� �ʱ�ȭ ��(Ŭ������ ó�� �ε��� �� �� ���� ����)
	static {
		try {
			String resource = "./com/diary/mybatis/config/config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlsession = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			System.out.println("�ʱ�ȭ ���� �߻� : " + e);
		}
	}
	
	public static SqlSessionFactory getSqlMapInstance() {
		return sqlsession;
	}
}
