package com.biz.impl;

import java.util.List;

//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.getListServerce;
import com.entity.OrderInfo;
import com.entity.SmpvOrderDetail;
import com.mapper.getListMapper;
import com.util.DbContextHolder;


@Service("/lstService")
public class getListServerceImpl implements getListServerce{
	
	
	@Autowired
	private getListMapper listMapper;
	
	public int getDetailList() throws Exception {
		
		return listMapper.getDetailList();
	
	}

	public int getOrderInfoList() throws Exception {
	
		return listMapper.getOrderInfoList();
	
	}
	
	

}
