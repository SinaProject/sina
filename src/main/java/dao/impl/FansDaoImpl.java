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
    private Fans fans;

    /**
     * ��ӹ�ע
     */
    public Object addFollow(int followId,int userId){

        this.fans=new Fans();
        this.fans.setFansId(followId);
        this.fans.setUserId(userId);
        return sessionFactory.getCurrentSession().save(fans);
    }

    /**
     * ɾ���ע��
     */

    /**
     * 通过ID找关注
     */
    public List getFollowsById(int userId) {
        String hql="FROM Fans f where f.userId=?";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0, userId);
        return query.list();
    }

    /**
     * 因为是找粉丝，所以要找用当前的userid来查找
     */
    public List getFansById(int userId){
        String hql="FROM Fans f where f.fansId=?";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0, userId);
        return query.list();
    }

    /**
     * 这里的Fans是指数据库里面一行Fans
     */
    public void deleteFans(int fansId,int userId) throws Exception{
        String hql="From Fans f WHERE f.fansId=? and f.userId=?";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0, fansId);
        query.setParameter(1, userId);
        List<Fans> fansL=query.list();
        if(fansL.size()>1||fansL.size()==0){
            throw new Exception();
        }else{
            sessionFactory.getCurrentSession().delete(fansL.get(0));
        }
    }



}
