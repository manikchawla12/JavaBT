package com.coforge.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.coforge.dao.CustomerDao;
import com.coforge.dao.CustomerDaoImp;
import com.coforge.dao.LibraryDao;
import com.coforge.model.Customer;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
public class CustomerConfig {

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean(DataSource ds) {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setHibernateProperties(getProperties());
		bean.setDataSource(ds);
		bean.setAnnotatedClasses(Customer.class);
		return bean;
	}

	@Bean
	public CustomerDao getCustomerBean(SessionFactory factory) {
		return new CustomerDaoImp(factory);
	}

	public Properties getProperties() {
		Properties p = new Properties();
		
		p.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		p.setProperty(AvailableSettings.SHOW_SQL, "true");
		p.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");

		return p;
	}
	@Bean
	public DataSource getDataSource() {
		HikariDataSource dataSource=new HikariDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db2");
		return dataSource;
	}
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory factory) {
		return new HibernateTransactionManager(factory);
	}
	
}