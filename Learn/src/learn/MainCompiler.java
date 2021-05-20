/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//        bangundatar_Yudhan bD = new bangundatar_Yudhan();
//        lingkaran_Yudhan lingkaran = new lingkaran_Yudhan();
//        persegi_Yudhan persegi = new persegi_Yudhan();
//        persegipanjang_Yudhan persegip = new persegipanjang_Yudhan();
//        segitiga_Yudhan segitiga = new segitiga_Yudhan();
package learn;

import INHERITANCE_DAN_POLYMORPHISME.bangundatar_Yudhan;
import INHERITANCE_DAN_POLYMORPHISME.lingkaran_Yudhan;
import INHERITANCE_DAN_POLYMORPHISME.persegi_Yudhan;
import INHERITANCE_DAN_POLYMORPHISME.persegipanjang_Yudhan;
import INHERITANCE_DAN_POLYMORPHISME.segitiga_Yudhan;
import java.util.Scanner;
import pembelajasranPart2.Siswa;
import tugaspengenalanjava.GajiPegawai_YudhanJeffriDjuniartha;
import tugaspengenalanjava.TandaSilang_YudhanJeffriDjuniartha;
import tugaspengenalanjava.UangKembalian_YudhanJeffriDjuniartha;







import java.sql.Connection;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
import com.mysql.cj.jdbc.Driver;
public class MainCompiler {
    public static void main(String[] args) { 
MainCompiler pro = new MainCompiler();
pro.createConnection();
    }
    void createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kk3", "root", "");
            System.out.println("Database Connection Success");
        } catch(ClassNotFoundException ex){
            Logger.getLogger(MainCompiler.class.getName()).log(Level.SEVERE,null,ex);
        }catch(SQLException ex){
            Logger.getLogger(MainCompiler.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}


