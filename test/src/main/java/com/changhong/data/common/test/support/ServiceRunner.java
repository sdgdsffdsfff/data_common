package com.changhong.data.common.test.support;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Tony
 * @mail tony.qiyao@foxmail.com
 * @date 2015年6月18日
 * @since 1.0.0 用于构建Spring运行环境的单元测试超类，加载所有classpath下的applicationContext.xml文件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
	"classpath*:/applicationContext.xml"
})
@ActiveProfiles("dev")
public class ServiceRunner extends AbsOut {

}
