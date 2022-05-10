package demo;

import java.sql.*;

public class StudImpl implements StudInterface {
    @Override
    public void save(Student st) {

    }

    @Override
    public void update(Student st) {

        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "update student set name='" + name + "' where id=" + id;
        try {

            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Student st) {

    }

    @Override
    public Student getStud(int id) {

        return null;
    }
}
