package dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import dao.FansDao;
import entity.Fans;


@Repository
@Transactional


public class FansDaoImpl implements FansDao{
	@Autowired
    SessionFactory sessionFactory;
	
	/**
	 * 添加关注
	 */
	public Object addFollow(Fans fans){
		return sessionFactory.getCurrentSession().save(fans);
	}
	
	/**
	 * 删除关注人
	 */
	
	/**
	 * 获取所有关注人
	 */
	public List getFollowsById(int userId) {
		String hql="FROM fans where userId=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	/**
	 * 将当前用户的ID作为fans表中的fansid,获得关注这位的用户的粉丝列表
	 */
	public List getFansById(int userId){
		String hql="FROM fans where fansId=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args)    
	{  
		System.out.println(args); //[ljava.lang.string;@139a55  “[”代表数组， “l”代表long , "@139a55"代表哈希值  
	    System.out.println(args.length);  //默认长度为0  
	    for(int i = 0; i < args.length; i++)  
	        System.out.println(args[i]);   
	    
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	    FansDao fansDao=(FansDao)context.getBean("fansDao");
	    Fans fans=new Fans();
	    fans.setFansId(1);
	    fans.setUserId(2);
	    fansDao.addFollow(fans);
	        
	    }  
	

}
