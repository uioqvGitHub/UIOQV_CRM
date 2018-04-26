package com.hjcrm.resource.service;

import java.util.List;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.resource.entity.Matchinfo;
import com.hjcrm.resource.entity.Student;

/**
 * 到账信息接口
 * @author 
 * 
 */
public interface IMatchinfoService {
	
	/**
	 * 查询到账信息
	 * @param matchinfo
	 * @return
	 * @author  
	 * 
	 */
	public List<Matchinfo> queryMatchinfo(Matchinfo matchinfo,PageBean pageBean);
	
	/**
	 * 查询到账信息(行政专用)
	 * @return
	 * @author  
	 * 
	 */
	public List<Matchinfo> queryMatchinfo(String matchname,PageBean pageBean);
	
	/**
	 * 保存到账信息
	 * @param matchinfo
	 * @author  
	 * 
	 */
	public void saveOrUpdateMatchinfo(Matchinfo matchinfo);
	
	/**
	 * 修改到账信息的匹配状态
	 * @param matchinfoIds
	 * @param ismatch
	 * @author  
	 * 
	 */
	public void updateIsmatch(String matchinfoIds,Integer ismatch);
	
	/**
	 * 到账信息查重
	 * @param matchnames
	 * @param isInfo
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Matchinfo> queryRepeatMatchinfo(String matchnames,String isInfo,PageBean pageBean);
	
	/**
	 * 根据姓名查询到账信息
	 * @param matchname
	 * @return
	 * @author  
	 * 
	 */
	public List<Matchinfo> queryMatchinfoBymname(String matchname);
	
	/**
	 * 查询有网络培训费的学员列表
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Student> queryNetworkEduMoneyBycaiwu(String phone,PageBean pageBean);
	
	/**
	 * 到账学员删除(未匹配)
	 * @param userid
	 * @param matchInfoIds
	 * @author  
	 * 
	 */
	public void deleteMatchinfos(Long userid,String matchInfoIds);
	
}
