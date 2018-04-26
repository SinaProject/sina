package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class FansDaoTest {

	@Autowired
	FansDao fansDao;
	
	@Test
	public void getFollowsById() {
		if(fansDao.getFansById(1)!=null){
			System.out.println(fansDao.getFollowsById(1).size());
		}
		else{
			System.out.println("fasfsadas");
		}
	}

}
