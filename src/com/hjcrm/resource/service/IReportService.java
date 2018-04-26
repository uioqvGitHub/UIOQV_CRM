package com.hjcrm.resource.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ResponseBody;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.resource.entity.Student;
import com.hjcrm.system.entity.User;

/**
 * 报表接口
 * @author 
 * 
 */
public interface IReportService {

	
	/**
	 * 查询总表学员数据--财务部
	 * @param studentIds
	 * @param deptid
	 * @param userid
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Student> queryStudentscaiwu(Student student,Long roleid,String studentIds,Long deptid,Long userid,PageBean pageBean); 
	
	/**
	 * 查询业绩--全部
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceAll();
	
	/**
	 * 查询业绩--全部
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceAllnotAC();
	
	/**
	 * 查询业绩--本月
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceTodayMoth();
	
	/**
	 * 查询业绩--本月
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceTodayMothnotAC();
	
	/**
	 * 查询业绩--本周  
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceTodayWeek();
	
	/**
	 * 查询业绩--本周  
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceTodayWeeknotAC();
	
	/**
	 * 查询业绩--昨日  
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceYestoday();
	/**
	 * 查询业绩--昨日  
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceYestodaynotAC();
	
	/**
	 * 查询业绩--课程
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceCourse(String courseid);
	
	/**
	 * 查询业绩--月份筛选
	 * @return
	 * @author  
	 * 
	 */
	public  List<User> queryPerformanceMoth(String moth);

	/**
	 * 用户录入统计-全部
	 * @param countTime
	 * @return
	 * @author  
	 * 
	 */
	public List<User> queryUserAddCountAll(PageBean pageBean);
	
	/**
	 * 用户录入统计-本月
	 * @param countTime
	 * @return
	 * @author  
	 * 
	 */
	public List<User> queryUserAddCountMoth(PageBean pageBean);
	
	/**
	 * 用户录入统计-本周
	 * @return
	 * @author  
	 * 
	 */
	public List<User> queryUserAddCountWeek(PageBean pageBean);
	
	/**
	 * 用户录入统计-今日
	 * @param countTime
	 * @return
	 * @author  
	 * 
	 */
	public List<User> queryUserAddCountToday(String countTime,PageBean pageBean);

	/**
	 * 用户录入统计
	 * 按照时间条件进行选取
	 * @param countTime
	 * @param processPageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<User> queryUserAddCountTime(String countTime,PageBean processPageBean);
	
	/**
	 * 查询所有销售客服机构代理的提成资源列表
	 * @param userid 登陆用户ID
	 * @param deptgroup 部门大类
	 * @param roleid 角色ID
	 * @param dealStartTime 成交开始时间
	 * @param dealEndTime 成交结束时间
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Student> queryCommissionAll(Long userid,Long deptgroup,Long roleid,String dealStartTime,String dealEndTime,PageBean pageBean);
	
	/**
	 * 根据招生老师ID和课程ID，查询该老师的总成交金额
	 * @param belongid
	 * @param courseid
	 * @return
	 * @author  
	 * 
	 */
	public List<Student> querydealpriceSum(String deptgroupName,Long belongid,Integer courseid);

	/**
	 * 业绩明细
	 * @param userName
	 * @param userid
	 * @param startTime
	 * @param endTime
	 * @param processPageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<User> queryPerformanceDetail(String userName, String userid,String startTime, String endTime, PageBean pageBean);

	
}
