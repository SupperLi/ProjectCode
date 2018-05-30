package com.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.getListServerce;
import com.util.DbContextHolder;

@Controller
@RequestMapping("/conrtoller")
public class TestController {
	
	@Autowired
	private getListServerce lstService;
	
	/*@Test
	public void getSqlServerDataSource() throws Exception {
		
		DbContextHolder.setDbType("dataSource1"); 
		//获取SqlServer车次子表的信息
		int count = lstService.getDetailList();
		
		System.out.println(count);
	
	}
	
	
	
	@Test
	public void getOrclDataSource() throws Exception{
		
		DbContextHolder.setDbType("dataSource2");
		
		//获取Oracle订单表的信息
		int count = lstService.getOrderInfoList();
		
		System.out.println(count);
	}*/
	
	
	
}
