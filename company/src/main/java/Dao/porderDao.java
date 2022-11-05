package Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		porder p=new porder();
		p.setName("allen");
		p.setLcd(1);
		p.setRam(6);
		new porderDao().add(p);

	}

	@Override
	public void add(Object o) {
		porder p=(porder)o;
		
		Session se=DbConn.getSE();
		Transaction tx=se.beginTransaction();
		se.save(p);
		tx.commit();
		se.close();
		
		
		
	}

}
