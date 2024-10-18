package com.dao;

import com.entity.BijileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BijileixingVO;
import com.entity.view.BijileixingView;


/**
 * 笔记类型
 * 
 * @author 
 * @email 
 * @date 2021-04-02 22:11:50
 */
public interface BijileixingDao extends BaseMapper<BijileixingEntity> {
	
	List<BijileixingVO> selectListVO(@Param("ew") Wrapper<BijileixingEntity> wrapper);
	
	BijileixingVO selectVO(@Param("ew") Wrapper<BijileixingEntity> wrapper);
	
	List<BijileixingView> selectListView(@Param("ew") Wrapper<BijileixingEntity> wrapper);

	List<BijileixingView> selectListView(Pagination page,@Param("ew") Wrapper<BijileixingEntity> wrapper);
	
	BijileixingView selectView(@Param("ew") Wrapper<BijileixingEntity> wrapper);
	
}
