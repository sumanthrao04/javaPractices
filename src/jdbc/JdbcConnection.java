package jdbc;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

public class JdbcConnection {

	static String URL = "jdbc:postgresql://localhost/students";
	static String User = "postgres";
	static String password = "Galaxy@123";

	public static void createDatabase() throws SQLException {

		Connection connection = DriverManager.getConnection(URL, User, password);
		try {
			Statement stmt = connection.createStatement();
			String sql = "CREATE DATABASE STUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
			connection.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void getDatabaConnection() {
		try (Connection conn = DriverManager.getConnection(URL, User, password)) {
			System.out.println("Connected database successfully...");
			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void createTable() {
		try (Connection conn = DriverManager.getConnection(URL, User, password);
				Statement smt = conn.createStatement()) {

			String sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
			smt.executeUpdate(sql);
			System.out.println("Created table in given database...");
			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void insertData() {
		try (Connection conn = DriverManager.getConnection(URL, User, password);
				Statement smt = conn.createStatement()) {

			String Sql = "INSERT  INTO  REGISTRATION VALUES (01,'Sumanth' ,'Parashuram',24)";
			smt.executeUpdate(Sql);
			Sql = "INSERT  INTO  REGISTRATION VALUES (02,'Nagendra' ,'Srinivas',23)";
			smt.executeUpdate(Sql);
			 Sql = "INSERT  INTO  REGISTRATION VALUES (03,'Pradeep' ,'Dudani',23)";
			smt.executeUpdate(Sql);
			
			conn.close();

			System.out.println("Data Inserted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void gettingAllData() {
		try (Connection conn = DriverManager.getConnection(URL, User, password);
				Statement smt = conn.createStatement()) {

			String query = "SELECT * FROM REGISTRATION";
			ResultSet rs = smt.executeQuery(query);
			while (rs.next()) {

				System.out.println(" ID :" + rs.getInt("id"));
				System.out.println("First Name : " + rs.getString("first"));
				System.out.println("Lat name : " + rs.getString("last"));
				System.out.println("Age :" + rs.getInt("age"));
				conn.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	public static void updateData( int id) {
		 
		try (Connection conn = DriverManager.getConnection(URL, User, password); Statement smt = conn.createStatement()){
			
			String updateName = "UPDATE REGISTRATION" +" SET age = 30 WHERE id in ("+id+")";
			
			smt.executeQuery(updateName);
			System.out.println("update age based on this ID : " + id );
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void deletData( ) {
		 
		try (Connection conn = DriverManager.getConnection(URL, User, password); Statement smt = conn.createStatement()){
			
			String updateName = "DELETE  FROM  REGISTRATION  WHERE first = 'Pradeep'";
			
			smt.executeUpdate(updateName);
			System.out.println("deleted  data  based on this name : " );
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// JdbcConnection.createDatabase();
		 JdbcConnection.getDatabaConnection();
		// JdbcConnection.createTable();
		// JdbcConnection.insertData();
		//JdbcConnection.gettingAllData();
		
		//JdbcConnection.updateData(02);
		//JdbcConnection.deletData();
		
		 
	}

}
