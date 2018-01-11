package com.lnragi.java.rest.jaxrs.client;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.lnragi.java.rest.jaxrs.utils.HibrnateConfiguration;

public class TestConnection {

	private Session session = null;
	
	public void testConn() {
		try {
			System.out.println("Connecting...");
			session  = HibrnateConfiguration.getSessionFactory().openSession();
			System.out.println("Connected : "+session);
		} catch (HibernateException | SQLException e) {
			System.out.println("Something went wrong while establishing connection\n ");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestConnection tc = new TestConnection();
		tc.testConn();
	}

}
