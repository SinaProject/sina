package service.impl;

import dao.MsgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @anthor tanshangou
 * @time 2018/4/10
 * @description
 */

@Service
@Transactional
public class MsgServiceImpl {

    @Autowired
    MsgDao msgDao;


}
