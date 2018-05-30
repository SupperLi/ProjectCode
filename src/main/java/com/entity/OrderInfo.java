package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 * 
 * @author Administrator
 * 
 */
public class OrderInfo implements Serializable{
	
	private Integer id;// 主键ID
	private String orderCode;// 原订单号
	private String transportCode;// 运输单号
	private Integer customerId;// 客户ID(FK)
	private Date pickupTime;// 提货时间
	private Date deliverytime;// 要货时间
	private Integer pickupLocationId;// 提货地点ID (FK)
	private Integer deliveryLocationId;// 卸货地点ID (FK)
	private Integer carrierId;// 承运商ID (FK)
	private Character orderType;// 订单状态(0未发布、1已发布、2已调度、3已发运、4已完成、U未生效5 CubeIQ已导出
								// 6 CubeIQ已上传 7已删除, 8已到港9已取货)
	private String version;// 版本号
	private String orderPublishedTime;// 订单发布时间
	private String orderSchedulingTime;// 订单调度时间
	private String orderShippingTime;// 订单发运时间
	private String orderCompleteTime;// 订单完成时间
	private Integer userId;// 工程师(用户ID)
	private Character isLate;// 是否迟到(0为准时、1为迟到)
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID
	private Date actualPickupTime;// 实际提货时间
	private Date actualDeliveryTime;// 实际到货时间
	private Character pickupIsLate;// 是否迟到(0为准时、1为迟到)
	private Character isDamag;// 是否破损(0为否、1为是)
	private Integer locMatrixEngineerId;// 点到点参数设置(FK)
	private Character operateType;// 操作类型
	private String xmlVersion;
	private Date orderDate;
	private Date docCutOffDate;
	private Date etdDate;
	private String deliverPort;
	private String mtiNumber;
	private Integer projectId;
	private Character orderProjectGs;
	private String remark;
	private String fordFileName;
	private Integer itemId;
	private Character orderPartType;
	private String orderRowNum;
	private Character isConfirm;
	private Character isAddPart;
	private Character isSend;
	private Date pusPickupTime;// 路单提货时间（路线模板）
	private Date pusDeliveryTime;// 路单要货时间（路线模板）
	private String sylifeshenNum;
	private Integer ccLocationId;// 标记中转点 (上海汽车项目)
	private String dlvContactname;// 卸货点联系人 (上海汽车项目)
	private String dlvTel;// 联系人电话(上海汽车项目)
	private String dlvAddress;// 卸货地址 (上海汽车项目)
	private String picContactname;// 提货点联系人(上海汽车项目)
	private String picTel;
	private String picAddress;// 提货点地址(上海汽车项目)
	private Date ccArrivalTime;// CC到达时间(上海汽车订单接口)(上海汽车项目)
	private Date ccLeaveTime;// CC离开时间(上海汽车订单接口)(上海汽车项目)
	private String ccCode;// 仓库代码(CCWMS仓库代码)(上海汽车项目)
	private String transportMode;// 运输模式(上海通用项目)整车（ZC）、零担（LD）、空运（KY）
	private String orderInfoType;// 订单类型(上海通用项目)
									// VMI订单(VMI)、PUS订单(PUS)、空箱订单(KX)、其他订单(QT）
	private String newOrderId;// 仓库代码(CCWMS仓库代码)(上海汽车项目)
	private Character disposedStatus;
	private Character shippersConfirmStatus;// 承运商确认状态(上海通用项目)（0未确认，1已确认）
	private String poNo;// PO 号(常熟路虎项目)
	private Date claimGoodsTime;// 取货时间
	private Character pusStatus;// 通用反馈订单状态

	public OrderInfo() {
		super();
	}

	public OrderInfo(Integer id, String orderCode, String transportCode,
			Integer customerId, Date pickupTime, Date deliverytime,
			Integer pickupLocationId, Integer deliveryLocationId,
			Integer carrierId, Character orderType, String version,
			String orderPublishedTime, String orderSchedulingTime,
			String orderShippingTime, String orderCompleteTime, Integer userTd,
			Character isLate, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId,
			Date actualPickupTime, Date actualDeliveryTime,
			Character pickupIsLate, Character isDamag,
			Integer locMatrixEngineerId, Character operateType,
			String xmlVersion, Date orderDate, Date docCutOffDate,
			Date etdDate, String deliverPort, String mtiNumber,
			Integer projectId, Character orderProjectGs, String remark,
			String fordFileName, Integer itemId, Character orderPartType,
			String orderRowNum, Character isConfirm, Character isAddPart,
			Character isSend, Date pusPickupTime, Date pusDeliveryTime,
			String sylifeshenNum, Integer ccLocationId, String dlvContactname,
			String dlvTel, String dlvAddress, String picContactname,
			String picTel, String picAddress, Date ccArrivalTime,
			Date ccLeaveTime, String ccCode, String transportMode,
			String orderInfoType, String newOrderId, Character disposedStatus,
			Character shippersConfirmStatus, String poNo, Date claimGoodsTime,
			Character pusStatus) {
		super();
		this.id = id;
		this.orderCode = orderCode;
		this.transportCode = transportCode;
		this.customerId = customerId;
		this.pickupTime = pickupTime;
		this.deliverytime = deliverytime;
		this.pickupLocationId = pickupLocationId;
		this.deliveryLocationId = deliveryLocationId;
		this.carrierId = carrierId;
		this.orderType = orderType;
		this.version = version;
		this.orderPublishedTime = orderPublishedTime;
		this.orderSchedulingTime = orderSchedulingTime;
		this.orderShippingTime = orderShippingTime;
		this.orderCompleteTime = orderCompleteTime;
		this.userId = userId;
		this.isLate = isLate;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.actualPickupTime = actualPickupTime;
		this.actualDeliveryTime = actualDeliveryTime;
		this.pickupIsLate = pickupIsLate;
		this.isDamag = isDamag;
		this.locMatrixEngineerId = locMatrixEngineerId;
		this.operateType = operateType;
		this.xmlVersion = xmlVersion;
		this.orderDate = orderDate;
		this.docCutOffDate = docCutOffDate;
		this.etdDate = etdDate;
		this.deliverPort = deliverPort;
		this.mtiNumber = mtiNumber;
		this.projectId = projectId;
		this.orderProjectGs = orderProjectGs;
		this.remark = remark;
		this.fordFileName = fordFileName;
		this.itemId = itemId;
		this.orderPartType = orderPartType;
		this.orderRowNum = orderRowNum;
		this.isConfirm = isConfirm;
		this.isAddPart = isAddPart;
		this.isSend = isSend;
		this.pusPickupTime = pusPickupTime;
		this.pusDeliveryTime = pusDeliveryTime;
		this.sylifeshenNum = sylifeshenNum;
		this.ccLocationId = ccLocationId;
		this.dlvContactname = dlvContactname;
		this.dlvTel = dlvTel;
		this.dlvAddress = dlvAddress;
		this.picContactname = picContactname;
		this.picTel = picTel;
		this.picAddress = picAddress;
		this.ccArrivalTime = ccArrivalTime;
		this.ccLeaveTime = ccLeaveTime;
		this.ccCode = ccCode;
		this.transportMode = transportMode;
		this.orderInfoType = orderInfoType;
		this.newOrderId = newOrderId;
		this.disposedStatus = disposedStatus;
		this.shippersConfirmStatus = shippersConfirmStatus;
		this.poNo = poNo;
		this.claimGoodsTime = claimGoodsTime;
		this.pusStatus = pusStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getTransportCode() {
		return transportCode;
	}

	public void setTransportCode(String transportCode) {
		this.transportCode = transportCode;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(Date pickupTime) {
		this.pickupTime = pickupTime;
	}

	public Date getDeliveryTime() {
		return deliverytime;
	}

	public void setDeliveryTime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}

	public Integer getPickupLocationId() {
		return pickupLocationId;
	}

	public void setPickupLocationId(Integer pickupLocationId) {
		this.pickupLocationId = pickupLocationId;
	}

	public Integer getDeliveryLocationId() {
		return deliveryLocationId;
	}

	public void setDeliveryLocationId(Integer deliveryLocationId) {
		this.deliveryLocationId = deliveryLocationId;
	}

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public Character getOrderType() {
		return orderType;
	}

	public void setOrderType(Character orderType) {
		this.orderType = orderType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOrderPublishedTime() {
		return orderPublishedTime;
	}

	public void setOrderPublishedTime(String orderPublishedTime) {
		this.orderPublishedTime = orderPublishedTime;
	}

	public String getOrderSchedulingTime() {
		return orderSchedulingTime;
	}

	public void setOrderSchedulingTime(String orderSchedulingTime) {
		this.orderSchedulingTime = orderSchedulingTime;
	}

	public String getOrderShippingTime() {
		return orderShippingTime;
	}

	public void setOrderShippingTime(String orderShippingTime) {
		this.orderShippingTime = orderShippingTime;
	}

	public String getOrderCompleteTime() {
		return orderCompleteTime;
	}

	public void setOrderCompleteTime(String orderCompleteTime) {
		this.orderCompleteTime = orderCompleteTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Character getIsLate() {
		return isLate;
	}

	public void setIsLate(Character isLate) {
		this.isLate = isLate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Integer lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Date getActualPickupTime() {
		return actualPickupTime;
	}

	public void setActualPickupTime(Date actualPickupTime) {
		this.actualPickupTime = actualPickupTime;
	}

	public Date getActualDeliveryTime() {
		return actualDeliveryTime;
	}

	public void setActualDeliveryTime(Date actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}

	public Character getPickupIsLate() {
		return pickupIsLate;
	}

	public void setPickupIsLate(Character pickupIsLate) {
		this.pickupIsLate = pickupIsLate;
	}

	public Character getIsDamag() {
		return isDamag;
	}

	public void setIsDamag(Character isDamag) {
		this.isDamag = isDamag;
	}

	public Integer getLocMatrixEngineerId() {
		return locMatrixEngineerId;
	}

	public void setLocMatrixEngineerId(Integer locMatrixEngineerId) {
		this.locMatrixEngineerId = locMatrixEngineerId;
	}

	public Character getOperateType() {
		return operateType;
	}

	public void setOperateType(Character operateType) {
		this.operateType = operateType;
	}

	public String getXmlVersion() {
		return xmlVersion;
	}

	public void setXmlVersion(String xmlVersion) {
		this.xmlVersion = xmlVersion;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDocCutOffDate() {
		return docCutOffDate;
	}

	public void setDocCutOffDate(Date docCutOffDate) {
		this.docCutOffDate = docCutOffDate;
	}

	public Date getEtdDate() {
		return etdDate;
	}

	public void setEtdDate(Date etdDate) {
		this.etdDate = etdDate;
	}

	public String getDeliverPort() {
		return deliverPort;
	}

	public void setDeliverPort(String deliverPort) {
		this.deliverPort = deliverPort;
	}

	public String getMtiNumber() {
		return mtiNumber;
	}

	public void setMtiNumber(String mtiNumber) {
		this.mtiNumber = mtiNumber;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Character getOrderProjectGs() {
		return orderProjectGs;
	}

	public void setOrderProjectGs(Character orderProjectGs) {
		this.orderProjectGs = orderProjectGs;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFordFileName() {
		return fordFileName;
	}

	public void setFordFileName(String fordFileName) {
		this.fordFileName = fordFileName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Character getOrderPartType() {
		return orderPartType;
	}

	public void setOrderPartType(Character orderPartType) {
		this.orderPartType = orderPartType;
	}

	public String getOrderRowNum() {
		return orderRowNum;
	}

	public void setOrderRowNum(String orderRowNum) {
		this.orderRowNum = orderRowNum;
	}

	public Character getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Character isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Character getIsAddPart() {
		return isAddPart;
	}

	public void setIsAddPart(Character isAddPart) {
		this.isAddPart = isAddPart;
	}

	public Character getIsSend() {
		return isSend;
	}

	public void setIsSend(Character isSend) {
		this.isSend = isSend;
	}

	public Date getPusPickupTime() {
		return pusPickupTime;
	}

	public void setPusPickupTime(Date pusPickupTime) {
		this.pusPickupTime = pusPickupTime;
	}

	public Date getPusDeliveryTime() {
		return pusDeliveryTime;
	}

	public void setPusDeliveryTime(Date pusDeliveryTime) {
		this.pusDeliveryTime = pusDeliveryTime;
	}

	public String getSylifeshenNum() {
		return sylifeshenNum;
	}

	public void setSylifeshenNum(String sylifeshenNum) {
		this.sylifeshenNum = sylifeshenNum;
	}

	public Integer getCcLocationId() {
		return ccLocationId;
	}

	public void setCcLocationId(Integer ccLocationId) {
		this.ccLocationId = ccLocationId;
	}

	public String getDlvContactname() {
		return dlvContactname;
	}

	public void setDlvContactname(String dlvContactname) {
		this.dlvContactname = dlvContactname;
	}

	public String getDlvTel() {
		return dlvTel;
	}

	public void setDlvTel(String dlvTel) {
		this.dlvTel = dlvTel;
	}

	public String getDlvAddress() {
		return dlvAddress;
	}

	public void setDlvAddress(String dlvAddress) {
		this.dlvAddress = dlvAddress;
	}

	public String getPicContactname() {
		return picContactname;
	}

	public void setPicContactname(String picContactname) {
		this.picContactname = picContactname;
	}

	public String getPicTel() {
		return picTel;
	}

	public void setPicTel(String picTel) {
		this.picTel = picTel;
	}

	public String getPicAddress() {
		return picAddress;
	}

	public void setPicAddress(String picAddress) {
		this.picAddress = picAddress;
	}

	public Date getCcArrivalTime() {
		return ccArrivalTime;
	}

	public void setCcArrivalTime(Date ccArrivalTime) {
		this.ccArrivalTime = ccArrivalTime;
	}

	public Date getCcLeaveTime() {
		return ccLeaveTime;
	}

	public void setCcLeaveTime(Date ccLeaveTime) {
		this.ccLeaveTime = ccLeaveTime;
	}

	public String getCcCode() {
		return ccCode;
	}

	public void setCcCode(String ccCode) {
		this.ccCode = ccCode;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getOrderInfoType() {
		return orderInfoType;
	}

	public void setOrderInfoType(String orderInfoType) {
		this.orderInfoType = orderInfoType;
	}

	public String getNewOrderId() {
		return newOrderId;
	}

	public void setNewOrderId(String newOrderId) {
		this.newOrderId = newOrderId;
	}

	public Character getDisposedStatus() {
		return disposedStatus;
	}

	public void setDisposedStatus(Character disposedStatus) {
		this.disposedStatus = disposedStatus;
	}

	public Character getShippersConfirmStatus() {
		return shippersConfirmStatus;
	}

	public void setShippersConfirmStatus(Character shippersConfirmStatus) {
		this.shippersConfirmStatus = shippersConfirmStatus;
	}

	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public Date getClaimGoodsTime() {
		return claimGoodsTime;
	}

	public void setClaimGoodsTime(Date claimGoodsTime) {
		this.claimGoodsTime = claimGoodsTime;
	}

	public Character getPusStatus() {
		return pusStatus;
	}

	public void setPusStatus(Character pusStatus) {
		this.pusStatus = pusStatus;
	}


	@Override
	public String toString() {
		return "orderInfo [id=" + id + ", orderCode=" + orderCode
				+ ", transportCode=" + transportCode + ", customerId="
				+ customerId + ", pickup_time=" + pickupTime
				+ ", delivery_time=" + deliverytime + ", pickupLocationId="
				+ pickupLocationId + ", deliveryLocationId="
				+ deliveryLocationId + ", carrierId=" + carrierId
				+ ", orderType=" + orderType + ", version=" + version
				+ ", orderPublishedTime=" + orderPublishedTime
				+ ", orderSchedulingTime=" + orderSchedulingTime
				+ ", orderShippingTime=" + orderShippingTime
				+ ", orderCompleteTime=" + orderCompleteTime + ", userId="
				+ userId + ", isLate=" + isLate + ", createDate=" + createDate
				+ ", createUserId=" + createUserId + ", lastUpdateDate="
				+ lastUpdateDate + ", lastUpdateUserId=" + lastUpdateUserId
				+ ", actualPickupTime=" + actualPickupTime
				+ ", actualDeliveryTime=" + actualDeliveryTime
				+ ", pickupIsLate=" + pickupIsLate + ", isDamag=" + isDamag
				+ ", locMatrixEngineerId=" + locMatrixEngineerId
				+ ", operateType=" + operateType + ", xmlVersion=" + xmlVersion
				+ ", orderDate=" + orderDate + ", docCutOffDate="
				+ docCutOffDate + ", etdDate=" + etdDate + ", deliverPort="
				+ deliverPort + ", mtiNumber=" + mtiNumber + ", projectId="
				+ projectId + ", orderProjectGs=" + orderProjectGs
				+ ", remark=" + remark + ", fordFileName=" + fordFileName
				+ ", itemId=" + itemId + ", orderPartType=" + orderPartType
				+ ", orderRowNum=" + orderRowNum + ", isConfirm=" + isConfirm
				+ ", isAddPart=" + isAddPart + ", isSend=" + isSend
				+ ", pusPickupTime=" + pusPickupTime + ", pusDeliveryTime="
				+ pusDeliveryTime + ", sylifeshenNum=" + sylifeshenNum
				+ ", ccLocationId=" + ccLocationId + ", dlvContactname="
				+ dlvContactname + ", dlvTel=" + dlvTel + ", dlvAddress="
				+ dlvAddress + ", picContactname=" + picContactname
				+ ", picTel=" + picTel + ", picAddress=" + picAddress
				+ ", ccArrivalTime=" + ccArrivalTime + ", ccLeaveTime="
				+ ccLeaveTime + ", ccCode=" + ccCode + ", transportMode="
				+ transportMode + ", orderInfoType=" + orderInfoType
				+ ", newOrderId=" + newOrderId + ", disposedStatus="
				+ disposedStatus + ", shippersConfirmStatus="
				+ shippersConfirmStatus + ", poNo=" + poNo
				+ ", claimGoodsTime=" + claimGoodsTime + ", pusStatus="
				+ pusStatus + "]";
	}

}
