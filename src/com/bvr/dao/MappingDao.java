package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.controller.Days;
import com.bvr.bean.MappingBean;
import com.bvr.driverconnection.ConnectionProvider;

public class MappingDao {

	public void mapping(MappingBean mappingBean) throws Exception{
	    try {
	            String sql = "insert into collection(collectionId,startingdate,endingdate,cname,tname,mname,exhibitorshare,distributorshare,termname,termtype,amount,narration,slab,showTax,batta,od,mc,da)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	            Connection conn=ConnectionProvider.getConnection();
	            PreparedStatement ps = conn.prepareStatement(sql);
	           System.out.println("dao getCname:"+mappingBean.getCname());
	            ps.setInt(1, mappingBean.getMappingId());
	            ps.setString(2, mappingBean.getDat());
	            ps.setString(3, mappingBean.getDa());
	            ps.setString(4, mappingBean.getCname());
	            ps.setString(5, mappingBean.getTname());
	            ps.setString(6, mappingBean.getMname());
	            ps.setFloat(7, mappingBean.getExhibitorshare());
	            ps.setFloat(8, mappingBean.getDistributorshare());
	            ps.setString(9, mappingBean.getTermname());
	            ps.setInt(10, mappingBean.getTermtype());
	            ps.setFloat(11, mappingBean.getAmount());
	            ps.setString(12, mappingBean.getNarration());
	            ps.setFloat(13, mappingBean.getSlab());
	            ps.setFloat(14, mappingBean.getShowTax());
	            ps.setFloat(15, mappingBean.getBatta());
	            ps.setFloat(16, mappingBean.getOd());
	            ps.setFloat(17, mappingBean.getMc());
	             ps.setString(18,mappingBean.getDaydate());
	            ps.executeUpdate(); 
	        
	            System.out.println("data inserted from mapping");
    		            	
    		            	
        } 
	catch (NumberFormatException e) {
        e.printStackTrace();
    }
}
}
