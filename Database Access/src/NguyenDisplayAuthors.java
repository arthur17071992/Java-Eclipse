import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class NguyenDisplayAuthors {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		final String DATABASE_URL = "jdbc:derby:/Users/arthurnguyen/eclipse-workspace/Database Access/books_examples-WithDatabaseDefined/books";
//		final String SELECT_QUERY =
//				"Select Title, EditionNumber, Copyright "
//				+ "FROM Titles "
//				+ "WHERE Copyright >= '2014'";
//		final String SELECT_QUERY =
//				"Select AuthorID, FirstName, LastName "
//				+ "FROM Authors "
//				+ "WHERE LastName LIKE 'D%'";
//		final String SELECT_QUERY =
//				"Select AuthorID, FirstName, LastName "
//				+ "FROM Authors "
//				+ "ORDER BY LastName ASC";
//		final String SELECT_QUERY =
//				"Select AuthorID, FirstName, LastName "
//				+ "FROM Authors "
//				+ "ORDER BY LastName DESC";
//		final String SELECT_QUERY =
//				"Select FirstName, LastName, ISBN "
//				+ "FROM Authors INNER JOIN AuthorISBN "
//				+ "ON Authors.AuthorID = AuthorISBN.AuthorID "
//				+ "ORDER BY LastName, FirstName";
		final String SELECT_QUERY =
				"Select AuthorID, FirstName, LastName "
				+ "FROM Authors ";
		
		// use try with resources to connect to and query the database
		try(
			Connection connection = DriverManager.getConnection(
					DATABASE_URL, "deitel", "deitel");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
		{
			// get ResultSet's meta data
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			
			System.out.printf("Authors Table of Books Database: %n%n");
			
			// display the names of the columns in the ResultSet
			for(int i = 1; i <= numberOfColumns; i++)
			{
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			}
			System.out.println();
			
			// display query results
			while(resultSet.next())
			{
				for(int i = 1; i <= numberOfColumns; i++)
				{
					System.out.printf("%-8s\t", resultSet.getObject(i));
				}
			System.out.println();
			}
		} // AutoCloseable object close methods are called now
		
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
} // end class NguyenDisplayAuthors
