package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * @anthor tanshangou
 * @time 2018/4/24
 * @description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class CollectDaoTest {

    @Autowired
    CollectDao collectDao;


    @Test
    public void deleteCollect() {

        try {
            collectDao.deleteCollect(1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}