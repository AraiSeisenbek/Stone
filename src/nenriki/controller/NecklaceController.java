package nenriki.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.company.interfaces.IDB;

import nenriki.entity.IStone;
import nenriki.entity.Precious;



public class NecklaceController {
	private final IDB db;
	public NecklaceController(IDB db) {
		this.db = db;
}
	public List<IStone> getAllPrecious() {
		
		 Connection con = null;
	        try {
	            con = db.getConnection();
	            String sql = "SELECT * FROM stones";
	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(sql);
	            List<IStone> preciouses = new LinkedList<>();
	            while (rs.next()) {
	            	 
	            	 IStone precious = new Precious(rs.getInt("stone_id"), rs.getInt("stone_weight"), rs.getString("stone_name"));
	            	preciouses.add(precious);
	            }

	            return preciouses;
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        return null;
	    }
	 
}
