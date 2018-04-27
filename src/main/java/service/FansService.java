package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.FansDao;
import entity.Fans;



public interface FansService {

    public Object addFans(int followId, int userId);

    public List<Fans> getAllFollow(int userId);

    public void deleteFollow(int followId, int userId) throws Exception;
}
