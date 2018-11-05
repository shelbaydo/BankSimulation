package utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {

	//静态私有数据库连接池对象
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	//静态方法返回数据库连接池对象
	public static DataSource getDataSource(){
		return ds;
	}
}
