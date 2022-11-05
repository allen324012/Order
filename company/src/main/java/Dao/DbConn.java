package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConn {

	public static void main(String[] args) {
		System.out.println(getSE());

	}
	
	
	public static Session getSE()
	{
		Configuration con=new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		
		return se;
	}

}
