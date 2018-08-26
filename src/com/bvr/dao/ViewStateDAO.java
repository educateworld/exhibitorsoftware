package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.StateBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewStateDAO {
	public List getAllStates() throws Exception {
        List states = new ArrayList();
        try {
                String sql = "SELECT * FROM state";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              StateBean stateBean = new StateBean();
              stateBean.setStateId(rs.getInt("stateId"));
                stateBean.setStateName(rs.getString("stateName"));
                states.add(stateBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return states;
    }
	public void removeState(String stateName) throws Exception {
        try {
                String sql = "DELETE FROM state WHERE stateName=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, stateName);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }


}
