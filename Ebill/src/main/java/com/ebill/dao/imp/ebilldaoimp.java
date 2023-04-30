package com.ebill.dao.imp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ebill.dao.ebilldao;
import com.ebill.entity.billentity;
import com.ebill.entity.billerentity;
import com.ebill.entity.staffentity;
import com.ebill.entity.studententity;
import com.ebill.util.HibernateUtility;

public class ebilldaoimp implements ebilldao  {
	public String savestudent(studententity  studententity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(studententity);
		t.commit();
		return "success";
	}
	public String savestaff(staffentity  staffentity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(staffentity);
		t.commit();
		return "success";
	}
	public String savebiller(billerentity  billerentity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(billerentity);
		t.commit();
		return "success";
	}
	public String savebillentity(billentity billentity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(billentity);
		t.commit();
		return "success";
	}
	public studententity getstudententity(int rollno) {
		Session session = com.ebill.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		studententity se = session.get(studententity.class, rollno);
		t.commit();
		return se;
	}
	public staffentity getstaffentity(int id) {
		Session session = com.ebill.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		staffentity st = session.get(staffentity.class, id);
		t.commit();
		return st;
	}
	public billerentity getbillerentity(int id) {
		Session session = com.ebill.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		billerentity be = session.get(billerentity.class,id);
		t.commit();
		return be;
	}
	
	public billentity getbillentity(int id) {
		Session session = com.ebill.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		billentity be = session.get(billentity.class,id);
		t.commit();
		return be;
	}
}