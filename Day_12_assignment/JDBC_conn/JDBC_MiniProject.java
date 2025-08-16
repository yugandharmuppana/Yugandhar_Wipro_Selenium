package JDBC_conn;
import java.sql.*;

public class JDBC_MiniProject {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
        String url = "jdbc:mysql://localhost:3306/CollegeDB";
        String user = "root";
        String password = "Yugandhar@1236";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Create student table
            st.execute("CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(50), city VARCHAR(50), percentage FLOAT)");

            // Insert records
            st.execute("INSERT INTO student VALUES (1, 'Yugandhar', 'Hyderabad', 78.5), (2, 'Nikhil', 'Hyderabad', 80.2), (3, 'Surya', 'Banglore', 75.5), (4, 'Ganesh', 'Vizag', 81.4)");

            // Printing student records
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            System.out.println("All Students:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getFloat(4));
            }

            // Update a record
            st.execute("UPDATE student SET percentage = 84.0 WHERE id = 3");
            System.out.println("Updated percentage to 84.0. in id=3");

            // highest percentage students
            rs = st.executeQuery("SELECT * FROM student WHERE percentage = (SELECT MAX(percentage) FROM student)");
            System.out.println("\nHighest Percentage Student(s):");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getFloat("percentage"));
            }

            // ascending order by percentage
            rs = st.executeQuery("SELECT * FROM student ORDER BY percentage ASC");
            System.out.println("\nStudents Ordered by Percentage:");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getFloat("percentage"));
            }

            // students from the same city
            rs = st.executeQuery("SELECT * FROM student WHERE city = 'Hyderabad'");
            System.out.println("\nStudents from Hyderabad:");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // Adding new column
            st.execute("ALTER TABLE student ADD COLUMN age INT");
            System.out.println("Column 'age' added.");

            // Modify column datatype
            st.execute("ALTER TABLE student MODIFY COLUMN name VARCHAR(100)");
            System.out.println("Column 'name' modified to VARCHAR(100).");


            // Changing table name
            st.execute("RENAME TABLE student TO student_info");
            System.out.println("Table name changed to student_info");

            // Delete column
            st.execute("ALTER TABLE student_info DROP COLUMN age");
            System.out.println("age column deleted");

            // Deleting single row
            st.execute("DELETE FROM student_info WHERE id = 2");
            

            // Delete all records 
            st.execute("DELETE FROM student_info");

            // Delete entire table
            st.execute("DROP TABLE IF EXISTS student_info");

            // Creating new tables for joins
            st.execute("CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(50))");
            st.execute("INSERT INTO student VALUES (1, 'Yugandhar'), (2, 'Nikhil'), (3, 'Surya')");

            st.execute("CREATE TABLE IF NOT EXISTS institute (id INT PRIMARY KEY, name VARCHAR(50))");
            st.execute("INSERT INTO institute VALUES (2, 'Yugandhar'), (3, 'Surya'), (4, 'Ganesh')");

            // INNER JOIN
            rs = st.executeQuery("SELECT s.name FROM student s INNER JOIN institute i ON s.id = i.id");
            System.out.println("\nInner Join (Common Records):");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // LEFT JOIN
            rs = st.executeQuery("SELECT s.name FROM student s LEFT JOIN institute i ON s.id = i.id");
            System.out.println("\nLeft Join (All Students):");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // RIGHT JOIN
            rs = st.executeQuery("SELECT i.name FROM student s RIGHT JOIN institute i ON s.id = i.id");
            System.out.println("\nRight Join (All Institutes):");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // FULL JOIN
            rs = st.executeQuery(
                "SELECT s.name FROM student s LEFT JOIN institute i ON s.id = i.id " +
                "UNION " +
                "SELECT i.name FROM student s RIGHT JOIN institute i ON s.id = i.id"
            );
            System.out.println("\nFull Join (All Records):");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}