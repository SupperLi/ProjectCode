package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 车次子表（订单）
 * 
 * @author Administrator
 * 
 */
public class SmpvOrderDetail implements Serializable{
	
	
	private String order; // 订单号
	private String part;// 零件号
	private String plant;// 工厂
	private String supplier;// 供应商号
	private String supplierName;// 供应商名称
	private String pickUpSite;// 提货站点
	private Date plannedPickUpTime;// 计划提货时间
	private Date actualArrivalTime;// 实际到达提货点时间
	private Date actualDepartureTime;// 实际离开提货点时间
	private String partName;// 零件名称
	private String materialRackType;// 料架类型
	private Integer plannedQuantity;// 计划数量
	private Integer numberPlannedBoxes;// 计划箱数
	private BigDecimal planCubic;// 计划立方
	private Integer pickUpQuantity;// 提货数量
	private Integer numberPickBoxes;// 提货箱数
	private BigDecimal realCubic;// 实提立方
	private String unloadingPoint;// 卸货点
	private Date requiredTime;// 需求时间
	private Date practicalArriveUnloadTime;// 实际到达卸货点时间
	private Date practicalLeaveUnloadTime;// 实际离开卸货点时间
	private String schemer;// 计划员
	private String transportManager;// 运输管理员
	private Integer longs;// 长
	private Integer wide;// 宽
	private Integer tall;// 高
	private String excelServerRCID;// 服务器
	private String ExcelServerRC1;
	private String ExcelServerWIID;
	private String ExcelServerRTID;
	private Integer ExcelServerRN;
	private Integer ExcelServerCN;
	private Integer ExcelServerCHG;
	//private SmpvOrderMain smpv_Order_Main;

	public SmpvOrderDetail() {
		super();
	}

	public SmpvOrderDetail(String order, String part, String plant,
			String supplier, String supplierName, String pickUpSite,
			Date plannedPickUpTime, Date actualArrivalTime,
			Date actualDepartureTime, String partName, String materialRackType,
			Integer plannedQuantity, Integer numberPlannedBoxes,
			BigDecimal planCubic, Integer pickUpQuantity,
			Integer numberPickBoxes, BigDecimal realCubic,
			String unloadingPoint, Date requiredTime,
			Date practicalArriveUnloadTime, Date practicalLeaveUnloadTime,
			String schemer, String transportManager, Integer longs,
			Integer wide, Integer tall, String excelServerRCID,
			String excelServerRC1, String excelServerWIID,
			String excelServerRTID, Integer excelServerRN,
			Integer excelServerCN, Integer excelServerCHG
		//	,SmpvOrderMain smpv_Order_Main
		) {
		super();
		this.order = order;
		this.part = part;
		this.plant = plant;
		this.supplier = supplier;
		this.supplierName = supplierName;
		this.pickUpSite = pickUpSite;
		this.plannedPickUpTime = plannedPickUpTime;
		this.actualArrivalTime = actualArrivalTime;
		this.actualDepartureTime = actualDepartureTime;
		this.partName = partName;
		this.materialRackType = materialRackType;
		this.plannedQuantity = plannedQuantity;
		this.numberPlannedBoxes = numberPlannedBoxes;
		this.planCubic = planCubic;
		this.pickUpQuantity = pickUpQuantity;
		this.numberPickBoxes = numberPickBoxes;
		this.realCubic = realCubic;
		this.unloadingPoint = unloadingPoint;
		this.requiredTime = requiredTime;
		this.practicalArriveUnloadTime = practicalArriveUnloadTime;
		this.practicalLeaveUnloadTime = practicalLeaveUnloadTime;
		this.schemer = schemer;
		this.transportManager = transportManager;
		this.longs = longs;
		this.wide = wide;
		this.tall = tall;
		this.excelServerRCID = excelServerRCID;
		ExcelServerRC1 = excelServerRC1;
		ExcelServerWIID = excelServerWIID;
		ExcelServerRTID = excelServerRTID;
		ExcelServerRN = excelServerRN;
		ExcelServerCN = excelServerCN;
		ExcelServerCHG = excelServerCHG;
		//this.smpv_Order_Main = smpv_Order_Main;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getPickUpSite() {
		return pickUpSite;
	}

	public void setPickUpSite(String pickUpSite) {
		this.pickUpSite = pickUpSite;
	}

	public Date getPlannedPickUpTime() {
		return plannedPickUpTime;
	}

	public void setPlannedPickUpTime(Date plannedPickUpTime) {
		this.plannedPickUpTime = plannedPickUpTime;
	}

	public Date getActualArrivalTime() {
		return actualArrivalTime;
	}

	public void setActualArrivalTime(Date actualArrivalTime) {
		this.actualArrivalTime = actualArrivalTime;
	}

	public Date getActualDepartureTime() {
		return actualDepartureTime;
	}

	public void setActualDepartureTime(Date actualDepartureTime) {
		this.actualDepartureTime = actualDepartureTime;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getMaterialRackType() {
		return materialRackType;
	}

	public void setMaterialRackType(String materialRackType) {
		this.materialRackType = materialRackType;
	}

	public Integer getPlannedQuantity() {
		return plannedQuantity;
	}

	public void setPlannedQuantity(Integer plannedQuantity) {
		this.plannedQuantity = plannedQuantity;
	}

	public Integer getNumberPlannedBoxes() {
		return numberPlannedBoxes;
	}

	public void setNumberPlannedBoxes(Integer numberPlannedBoxes) {
		this.numberPlannedBoxes = numberPlannedBoxes;
	}

	public BigDecimal getPlanCubic() {
		return planCubic;
	}

	public void setPlanCubic(BigDecimal planCubic) {
		this.planCubic = planCubic;
	}

	public Integer getPickUpQuantity() {
		return pickUpQuantity;
	}

	public void setPickUpQuantity(Integer pickUpQuantity) {
		this.pickUpQuantity = pickUpQuantity;
	}

	public Integer getNumberPickBoxes() {
		return numberPickBoxes;
	}

	public void setNumberPickBoxes(Integer numberPickBoxes) {
		this.numberPickBoxes = numberPickBoxes;
	}

	public BigDecimal getRealCubic() {
		return realCubic;
	}

	public void setRealCubic(BigDecimal realCubic) {
		this.realCubic = realCubic;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public Date getRequiredTime() {
		return requiredTime;
	}

	public void setRequiredTime(Date requiredTime) {
		this.requiredTime = requiredTime;
	}

	public Date getPracticalArriveUnloadTime() {
		return practicalArriveUnloadTime;
	}

	public void setPracticalArriveUnloadTime(Date practicalArriveUnloadTime) {
		this.practicalArriveUnloadTime = practicalArriveUnloadTime;
	}

	public Date getPracticalLeaveUnloadTime() {
		return practicalLeaveUnloadTime;
	}

	public void setPracticalLeaveUnloadTime(Date practicalLeaveUnloadTime) {
		this.practicalLeaveUnloadTime = practicalLeaveUnloadTime;
	}

	public String getSchemer() {
		return schemer;
	}

	public void setSchemer(String schemer) {
		this.schemer = schemer;
	}

	public String getTransportManager() {
		return transportManager;
	}

	public void setTransportManager(String transportManager) {
		this.transportManager = transportManager;
	}

	public Integer getLongs() {
		return longs;
	}

	public void setLongs(Integer longs) {
		this.longs = longs;
	}

	public Integer getWide() {
		return wide;
	}

	public void setWide(Integer wide) {
		this.wide = wide;
	}

	public Integer getTall() {
		return tall;
	}

	public void setTall(Integer tall) {
		this.tall = tall;
	}

	public String getExcelServerRCID() {
		return excelServerRCID;
	}

	public void setExcelServerRCID(String excelServerRCID) {
		this.excelServerRCID = excelServerRCID;
	}

	public String getExcelServerRC1() {
		return ExcelServerRC1;
	}

	public void setExcelServerRC1(String excelServerRC1) {
		ExcelServerRC1 = excelServerRC1;
	}

	public String getExcelServerWIID() {
		return ExcelServerWIID;
	}

	public void setExcelServerWIID(String excelServerWIID) {
		ExcelServerWIID = excelServerWIID;
	}

	public String getExcelServerRTID() {
		return ExcelServerRTID;
	}

	public void setExcelServerRTID(String excelServerRTID) {
		ExcelServerRTID = excelServerRTID;
	}

	public Integer getExcelServerRN() {
		return ExcelServerRN;
	}

	public void setExcelServerRN(Integer excelServerRN) {
		ExcelServerRN = excelServerRN;
	}

	public Integer getExcelServerCN() {
		return ExcelServerCN;
	}

	public void setExcelServerCN(Integer excelServerCN) {
		ExcelServerCN = excelServerCN;
	}

	public Integer getExcelServerCHG() {
		return ExcelServerCHG;
	}

	public void setExcelServerCHG(Integer excelServerCHG) {
		ExcelServerCHG = excelServerCHG;
	}

	/*public SmpvOrderMain getSmpv_Order_Main() {
		return smpv_Order_Main;
	}

	public void setSmpv_Order_Main(SmpvOrderMain smpv_Order_Main) {
		this.smpv_Order_Main = smpv_Order_Main;
	}*/

	@Override
	public String toString() {
		return "Smpv_Order_Detail [order=" + order + ", part=" + part
				+ ", plant=" + plant + ", supplier=" + supplier
				+ ", supplierName=" + supplierName + ", pickUpSite="
				+ pickUpSite + ", plannedPickUpTime=" + plannedPickUpTime
				+ ", actualArrivalTime=" + actualArrivalTime
				+ ", actualDepartureTime=" + actualDepartureTime
				+ ", partName=" + partName + ", materialRackType="
				+ materialRackType + ", plannedQuantity=" + plannedQuantity
				+ ", numberPlannedBoxes=" + numberPlannedBoxes + ", planCubic="
				+ planCubic + ", pickUpQuantity=" + pickUpQuantity
				+ ", numberPickBoxes=" + numberPickBoxes + ", realCubic="
				+ realCubic + ", unloadingPoint=" + unloadingPoint
				+ ", requiredTime=" + requiredTime
				+ ", practicalArriveUnloadTime=" + practicalArriveUnloadTime
				+ ", practicalLeaveUnloadTime=" + practicalLeaveUnloadTime
				+ ", schemer=" + schemer + ", transportManager="
				+ transportManager + ", longs=" + longs + ", wide=" + wide
				+ ", tall=" + tall + ", excelServerRCID=" + excelServerRCID
				+ ", ExcelServerRC1=" + ExcelServerRC1 + ", ExcelServerWIID="
				+ ExcelServerWIID + ", ExcelServerRTID=" + ExcelServerRTID
				+ ", ExcelServerRN=" + ExcelServerRN + ", ExcelServerCN="
				+ ExcelServerCN + ", ExcelServerCHG=" + ExcelServerCHG
				/*+ ", smpv_Order_Main=" + smpv_Order_Main + ""*/
						+ "]";
	}

}
