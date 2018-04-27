package dao.impl;

import dao.CollectDao;
import entity.Collect;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.SQLDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/23
 * @description
 */

@Repository
@Transactional
public class CollectDaoImpl implements CollectDao {

    public static final Logger LOG = Logger.getLogger(CollectDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;


    public List<Collect> getCollectsByUser(int userId) {
        String hql="FROM Collect e where e.userId=?";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0,userId);
        return query.list();
    }

    public Object addCollect(Collect collect) {
        return sessionFactory.getCurrentSession().save(collect);
    }

    public void deleteCollect(int msgId,int userId) throws Exception {

        String hql="From Collect e WHERE e.msgId=? and e.userId=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0,msgId);
        query.setParameter(1,userId);

        List<Collect> collects=query.list();
        if(collects.size()>1||collects.size()==0){
            throw new Exception();
        }else{
            sessionFactory.getCurrentSession().delete(collects.get(0));
        }

    }
}
