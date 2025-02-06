package com.example.demo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.jdbc.Work;

public class SequenceGenerator implements IdentifierGenerator {
	String prefix="EMP_";
	String suffix="";

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		session.doWork(new Work() {
			public void execute(Connection conn) throws SQLException {
				try {
					 Statement st=conn.createStatement();
					 ResultSet rs=st.executeQuery("select count(empid) from faculity");
					 if(rs.next()) {
						 Integer id=rs.getInt(1)+1;
						 suffix=id.toString();
					 }
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		return prefix+suffix;
	}
	

}
