package com.mapper;

import java.util.List;

import com.entity.OrderInfo;
import com.entity.SmpvOrderDetail;

public interface getListMapper {
	
	
	/**
	 * 获取SqlServer车次子表的信息
	 */
	public int getDetailList();
	
	
	
	/**
	 * 获取Oracle订单表的信息
	 */
	public int getOrderInfoList();
	
	
	
}
