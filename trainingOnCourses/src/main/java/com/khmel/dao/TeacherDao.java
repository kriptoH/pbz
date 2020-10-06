package com.khmel.dao;

import com.khmel.db.DB;
import com.khmel.model.Teacher;

import java.sql.*;
import java.util.List;

public class TeacherDao implements GenericDao<Teacher> {
    private Connection connection;

    public TeacherDao() {
        this.connection = DB.getConnection();
    }

    @Override
    public void create(Teacher teacher) {
        this.connection = DB.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO  " + teacher.getClass().getSimpleName().toLowerCase() +"(name,birthday,gender,education,category)"  + " VALUES(?,?,?,?,?)");
            preparedStatement.setString(1, teacher.getName());
            preparedStatement.setString(2, teacher.getBirthday());
            preparedStatement.setString(3, teacher.getGender());
            preparedStatement.setString(4, teacher.getEducation());
            preparedStatement.setString(5, teacher.getCategory());
            preparedStatement.execute();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public Teacher getFromPK(int key)
    {
        this.connection = DB.getConnection();
        return null;
    }

    @Override
    public int update(Teacher teacher) {
        this.connection = DB.getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("UPDATE " +
                    teacher.getClass().getSimpleName().toLowerCase() + ""
                    + " SET name=?, birthday=?, gender=?" +
                    " education=?, category=? WHERE id=" + teacher.getId());
            try {

                ps.setString(1, teacher.getName());
                ps.setString(2, teacher.getBirthday());
                ps.setString(3, teacher.getGender());
                ps.setString(4, teacher.getEducation());
                ps.setString(5, teacher.getCategory());
            } catch (SQLException e) {
                e.printStackTrace();
            }

            ps.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    @Override
    public int delete(Teacher object) {
        this.connection = DB.getConnection();
        return 0;
    }

    @Override
    public ResultSet getAll() {
        this.connection = DB.getConnection();
        String sqlSelect = "SELECT * FROM teacher";
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlSelect);

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                statement.close();
//               //connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//    }
////            try {
////                statement.close();
////            } catch (SQLException e) {
////                e.printStackTrace();
////            }
////        }

        return resultSet;
    }
}
