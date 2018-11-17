package com.fenqing.shopping.service;

import java.util.List;

import com.fenqing.shopping.pojo.TbItem;

/**
 * item表的相关操作
 * @author yikai
 *
 */
public interface IItemService {
	
	/**
	 * 分页查询商品列表
	 * @param page 当前页数
	 * @param rows 一页多少条
	 * @return 结果集合
	 */
	public List<TbItem> queryList(int page, int rows);
	
}
