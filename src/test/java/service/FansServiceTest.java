package service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class FansServiceTest {
	
	@Autowired
	FansService fansService;
	

	@Test
	public void getAllFollow() {
		if(fansService.getAllFollow(1)!=null){
			System.out.println(fansService.getAllFollow(1).size());
		}
		else{
			System.out.println("fasfsadas");
		}
	}

}
