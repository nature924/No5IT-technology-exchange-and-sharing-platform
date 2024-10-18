package com.entity.view;

import com.entity.BijileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 笔记类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 22:11:50
 */
@TableName("bijileixing")
public class BijileixingView  extends BijileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BijileixingView(){
	}
 
 	public BijileixingView(BijileixingEntity bijileixingEntity){
 	try {
			BeanUtils.copyProperties(this, bijileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
