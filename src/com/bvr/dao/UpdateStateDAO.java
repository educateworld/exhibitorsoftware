package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.StateBean;
import com.bvr.driverconnection.ConnectionProvider;


public class UpdateStateDAO {
	public void editState(StateBean stateBean) {           
        try {
        	
                String sql = "update state set stateName=? WHERE stateId=?";
                Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, stateBean.getStateName());    
            ps.setInt(2, stateBean.getStateId());
            System.out.println("statename" +stateBean.getStateName());
            System.out.println("stateid" +stateBean.getStateId());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
	public List getAllStates() throws Exception {
        List states = new ArrayList();
        try {
                String sql = "SELECT * FROM state";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              StateBean stateBean = new StateBean();
                stateBean.setStateName(rs.getString("stateName"));
                states.add(stateBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return states;
    }
	public StateBean getStateBystateId(int stateId) {
		StateBean state = new StateBean();
        try {
                String sql = "SELECT * FROM state WHERE stateId=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, stateId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	state.setStateId(rs.getInt("stateId"));
            	state.setStateName(rs.getString("stateName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return state;
    }
       
}
