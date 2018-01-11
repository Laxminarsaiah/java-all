package com.lnragi.java.rest.jaxrs.utils;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Laxminarsaiah Ragi
 *
 */
public class HibrnateConfiguration {

	public static SessionFactory getSessionFactory() throws SQLException {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory;
	}

	public static void closeSession(Session session) {
		if (null != session) {
			session.close();
		}
	}

}
