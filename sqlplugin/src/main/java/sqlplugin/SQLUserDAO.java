package sqlplugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import delta.monstarz.shared.model.Person;
import delta.monstarz.plugin.IUserDAO;
import java.sql.*;

public class SQLUserDAO implements IUserDAO {
	SQLUserDAO() {
		Connection connection = getConnection();
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();

				if (!personTableExists(connection)) {
					String sql = "CREATE  TABLE person (" +
							"username TEXT NOT NULL PRIMARY KEY," +
							"password TEXT NOT NULL )";
					statement.executeUpdate(sql);
					statement.close();
					connection.commit();
				}
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addPerson(Person p) {
		Connection connection = getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO person (username, password) VALUES ('" +
					p.getUsername() + "', '" +
					p.getPassword() + "');";
			statement.executeUpdate(sql);

			statement.close();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		Connection connection = getConnection();

		try {
			if (!personTableExists(connection)) {
				return persons;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persons;
	}

	@Override
	public void clear() {
		Connection connection = getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "DROP TABLE IF EXISTS 'person'";
			statement.executeUpdate(sql);
			statement.close();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:sqlite:ttr.db");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private boolean personTableExists(Connection connection) throws SQLException {
		DatabaseMetaData metaData = connection.getMetaData();
		ResultSet rs = metaData.getTables(null, null, "person", null);
		return rs.next();
	}

	/*
	@Override
	public List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();

		Connection c;
		Statement stmt;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:ttr.db");
			System.out.println("Opened database successfully");
			c.setAutoCommit(false);

			stmt = c.createStatement();

			DatabaseMetaData md = c.getMetaData();
			ResultSet rs = md.getTables(null, null, "person", null);
			if (!rs.next()) {
				return persons;
			}

			rs = stmt.executeQuery( "SELECT * FROM person;" );
			while ( rs.next() ) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				Person p = new Person(username, password);
				persons.add(p);
			}

			rs.close();
			stmt.close();
			c.close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		return persons;
	}*/
}
