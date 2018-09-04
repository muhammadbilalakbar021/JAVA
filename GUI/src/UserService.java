package com.bitspedia.guiwithfx.fxbasics;

import com.bitspedia.oopsp17.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {

    static final String DB_URL = "jdbc:mysql://localhost:3306/infosys";
    static final String USER_NAME = "root";
    static final String PASSWORD = "pakistang";

    public User getUser(String userName) {
        User user = null;

        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            String SQL = "SELECT * FROM users WHERE username = '" + userName + "'";
            ResultSet resultSet = statement.executeQuery(SQL);

            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("username"));
                boolean gender = resultSet.getBoolean("gender");
                if (gender)
                    user.setGender("Male");
                else
                    user.setGender("Female");
            }
            return user;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
                if (statement != null)
                    statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean delete(int userID) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            String SQL = "DELETE FROM users WHERE id = " + userID;
            int count = statement.executeUpdate(SQL);
            if (count == 1)
                return true;
            else
                return false;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
                if (statement != null)
                    statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
