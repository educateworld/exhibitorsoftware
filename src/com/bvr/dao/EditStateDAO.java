package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bvr.bean.StateBean;
import com.bvr.driverconnection.ConnectionProvider;

public class EditStateDAO {
	public void editState(StateBean stateBean) throws Exception {           
        try {
                String sql = "UPDATE state SET stateName=?" ;
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, stateBean.getStateName());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
        public StateBean getStateBySname(String stateName) throws Exception {
        	StateBean stateBean = new StateBean();
            try {
                    String sql = "SELECT * FROM state ";
                    Connection conn=ConnectionProvider.getConnection();
                    PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, stateName);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                	stateBean.setStateName(rs.getString("stateName"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return stateBean;
        }
    }

