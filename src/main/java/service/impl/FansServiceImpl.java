package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FansDao;
import entity.Fans;
import service.FansService;


@Service
public class FansServiceImpl implements FansService {


    @Autowired
    private FansDao fansDao;

    public Object addFans(int followId,int userId) {
        // TODO Auto-generated method stub
        return null;
    }
    /**
     *ͨuserId查询关注
     */

    public List<Fans> getAllFollow(int userId){
        return fansDao.getFollowsById(userId);
    }

    public void deleteFollow(int followId,int userId) throws Exception{
        fansDao.deleteFans(followId, userId);
    }


}
