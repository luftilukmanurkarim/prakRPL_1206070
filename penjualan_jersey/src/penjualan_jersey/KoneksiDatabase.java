/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan_jersey;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 *
 * @author CHUCKY
 */
public class KoneksiDatabase {
    private Statement data = null;
    private Connection koneksiDatabase;
    
    public Connection getKoneksiDatabase(){
        if(koneksiDatabase== null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver ditemukan");
                try{
                    koneksiDatabase = DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan_jersey","root","");
                    System.out.println("Koneksi Database Ditemukan");
                    }catch (SQLException ex) {
                        System.out.println("Koneksi DB tidak ditemukan : \nDengan Pesan :" +ex.toString());
                }
            }catch (ClassNotFoundException ex){
                System.out.print("Class Driver DB Tidak Ditemukan : \n Dengan Pesan Error" + ex.toString());
            }
        }
        return koneksiDatabase;
    }
    
}
