package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.RegisterBean;
import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class UpdateTermDAO {

	public void editTerm(TermBean state) {
try {
        	
            String sql = "update term set percentage=?,advance=?,mg=? WHERE termid=?";
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
          
            ps.setInt(1, state.getPercentage()); 
            ps.setInt(2, state.getAdvance()); 
            ps.setInt(3, state.getMarginProfit()); 
            
            
            ps.setInt(4, state.getTermId()); 
        
        
  
        ps.executeUpdate();            

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
		

	public List getAllTerms() {
		// TODO Auto-generated method stub
		 List states = new ArrayList();
	        try {
	                String sql = "SELECT * FROM term";
	                Connection conn=ConnectionProvider.getConnection();
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	 TermBean Bean = new   TermBean();                  
	                   Bean.setTermId(rs.getInt("termid"));
	                   
	                 Bean.setPercentage(rs.getInt("percentage"));
	                  Bean.setAdvance(rs.getInt("advance"));
	                  Bean.setMarginProfit(rs.getInt("mg"));  
	                states.add(Bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return states;
	    }

	public TermBean getStateByTermId(int termId) {
		TermBean Bean = new TermBean();
        try {
                String sql = "SELECT * FROM term WHERE termid=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, termId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	 Bean.setTermId(rs.getInt("termid"));
                 Bean.setPercentage(rs.getInt("percentage"));
                 Bean.setAdvance(rs.getInt("advance"));
                 Bean.setMarginProfit(rs.getInt("mg"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Bean;
	}
}

