package com.entity.view;

import com.entity.DiscussbijifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 笔记分享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 22:11:50
 */
@TableName("discussbijifenxiang")
public class DiscussbijifenxiangView  extends DiscussbijifenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbijifenxiangView(){
	}
 
 	public DiscussbijifenxiangView(DiscussbijifenxiangEntity discussbijifenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussbijifenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
