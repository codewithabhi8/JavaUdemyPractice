package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.sqlite.JDBC");
//        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqllite\\univ.db");
//        Statement stm = con.createStatement();
//        ResultSet rs = stm.executeQuery("select * from dept");
//        int dno;
//        String dname;
//        while(rs.next()){
//            dno=rs.getInt("deptno");
//            dname=rs.getString("dname");
//            System.out.println(dno+" and "+dname);
//        }
//        stm.close();
//        con.close();

        //Prepared Statement
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqllite\\univ.db");
        PreparedStatement stm = con.prepareStatement("select * from dept where deptno=?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept Number: ");
        int dno = sc.nextInt();
        stm.setInt(1, dno);
        ResultSet rs = stm.executeQuery();
        while(rs.next()){
            dno=rs.getInt("deptno");
//            dname=rs.getString("dname");
            System.out.println(dno);
        }
        stm.close();
        con.close();
    }
}
