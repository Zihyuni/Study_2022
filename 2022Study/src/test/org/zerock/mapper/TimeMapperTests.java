package org.zerock.mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class TimeMapperTests {

    @Setter(onMethod_ = @Autowired)
    private TimeMapper timeMapper;

    @Test
    public void testGetTime(){
        log.info("타임 매퍼에서 클래스를 가져오고 이름을 가져오겠다!!!::"+timeMapper.getClass().getName());

        log.info("타임 매퍼에서의 타임을 가져오겠다!!!::"+timeMapper.getTime());
    }

    @Test
    public void testGetTime2(){
        log.info("겟타임 2!!!!!!::::");
        log.info("겟타임2 매퍼입니다::::"+timeMapper.getTime2());
    }

}