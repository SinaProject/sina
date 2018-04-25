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
	 * ��ӹ�ע
	 */
	public Object addFollow(Fans fans){
		return sessionFactory.getCurrentSession().save(fans);
	}
	
	/**
	 * ɾ����ע��
	 */
	
	/**
	 * ��ȡ���й�ע��
	 */
	public List getFollowsById(int userId) {
		String hql="FROM fans where userId=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	/**
	 * ����ǰ�û���ID��Ϊfans���е�fansid,��ù�ע��λ���û��ķ�˿�б�
	 */
	public List getFansById(int userId){
		String hql="FROM fans where fansId=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	
	/**
	 * ����
	 * @param args
	 */
	public static void main(String[] args)    
	{  
		System.out.println(args); //[ljava.lang.string;@139a55  ��[���������飬 ��l������long , "@139a55"�����ϣֵ  
	    System.out.println(args.length);  //Ĭ�ϳ���Ϊ0  
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
