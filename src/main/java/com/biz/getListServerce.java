package com.biz;

import java.util.List;

import com.entity.OrderInfo;
import com.entity.SmpvOrderDetail;

public interface getListServerce {
	
	/**
	 * 获取SqlServer车次子表的信息
	 */
	public int getDetailList() throws Exception;
	
	
	
	/**
	 * 获取Oracle订单表的信息
	 */
	public int getOrderInfoList() throws Exception;
	
	
	
	
}
