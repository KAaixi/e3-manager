package com.fenqing.shopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenqing.shopping.mapper.TbItemMapper;
import com.fenqing.shopping.pojo.TbItem;
import com.fenqing.shopping.service.IItemService;

@Service
public class ItemServiceImpl implements IItemService{
	
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public List<TbItem> queryList(int page, int rows) {
		
		int start = (page - 1) * rows;
		return itemMapper.selectListByPage(start, rows);
	}

}
