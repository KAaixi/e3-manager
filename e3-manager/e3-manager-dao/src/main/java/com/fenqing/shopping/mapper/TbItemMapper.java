package com.fenqing.shopping.mapper;

import com.fenqing.shopping.pojo.TbItem;
import com.fenqing.shopping.pojo.TbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    int countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);
    
    /**
     * 分页查询商品列表
     * @param start 开始位置
     * @param size 一页多少条数据 
     * @return 查询到的结果集合
     */
    List<TbItem> selectListByPage(@Param("start")int start, @Param("size") int size);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}