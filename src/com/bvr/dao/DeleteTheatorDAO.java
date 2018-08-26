package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CenterBean;
import com.bvr.bean.DistrictBean;
import com.bvr.bean.TheatorBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteTheatorDAO {
	public void removeTheator(int centerName) throws Exception {
		// TODO Auto-generated method stub
		 try {
            String sql = "DELETE FROM theator WHERE centerId=?";
            Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = conn
                .prepareStatement(sql);
        ps.setInt(1, centerName);
       
        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
		
		
	}

	public List getAllTheators() {
		List users = new ArrayList();
       try {
             String sql = "SELECT * FROM theator";
             Connection conn = ConnectionProvider.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
              TheatorBean theatorBean = new TheatorBean();
              //centerBean.setDistrictId(rs.getInt("districtId"));
              theatorBean.setCenterName(rs.getString("centerName"));
              theatorBean.setTheatorName(rs.getString("theatorName"));
              theatorBean.setHousefulCapacity(rs.getInt("housefulCapacity"));
              theatorBean.setTheatreDescription(rs.getString("theatreDescription"));
              theatorBean.setOwnerName(rs.getString("ownerName"));
              theatorBean.setContactNumber(rs.getString("contactNumber"));
              theatorBean.setTheatreRent(rs.getFloat("theatreRent"));
              theatorBean.setDistributorShare(rs.getFloat("distributorShare"));
              theatorBean.setSlab(rs.getFloat("slab"));
              theatorBean.setShowTax(rs.getFloat("showTax"));
              theatorBean.setBatta(rs.getFloat("batta"));
              theatorBean.setInr(rs.getFloat("inr"));
              theatorBean.setMc(rs.getFloat("mc"));
          	
                                         
               users.add(theatorBean);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

       return users;
	}
}