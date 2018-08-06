package com.sun.onlineRetailers.product.domain;
/**
 * 功能：产品
 * 说明：
 * @author 孙荆阁:
 * @Date 2018年8月6日 下午1:30:03
 */
public class Product {

	private Long id;//主键
	private String name;//商品标题
	private Long category_id;//商品分类编号
	private Long mer_id;//商家编号
	private Long freight_id;//
	private int type_id;//类型编号
	private String sketch;//简述
	private String intro;//商品描述
	private String keywords;//商品关键字
	private String tags;//标签
	private String marque;//商品型号
	private String barcode;//仓库条码
	private Long brand_id;//品牌编号
	private Long virtual;//虚拟购买量
	private String price;//商品价格
	private String market_price;//市场价格
	private int integral;//可使用积分抵消
	private Long stock;//库存量
	private Long warning_stock;//库存警告
	private String picture_url;//封面图
	private String posters;//
	private int status;//状态 -1=>下架,1=>上架,2=>预售,0=>未上架
	private int state;//审核状态 -1 审核失败 0 未审核 1 审核成功
	private String is_package;//是否是套餐
	private String is_integral;//是否是积分产品
	private int sort;//排序
	private String deleted_at;//
	private String created_at;//
	private String updated_at;//

	
}
