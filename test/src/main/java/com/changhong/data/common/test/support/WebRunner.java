/**
 * 
 */
package com.changhong.data.common.test.support;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author QiYao
 * @mail tony.qiyao@foxmail.com
 * @date 2015年6月19日
 * @since 1.0.0 用于构建Web+Spring的单元测试超类，默认的环境是：src/main/webapp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath*:/applicationContext.xml"
	})
@WebAppConfiguration
@ActiveProfiles("dev")
public class WebRunner  extends AbsOut{
	
	@Autowired
    private WebApplicationContext wac;

    protected MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    /**
     * This is a test show
     */
//    @Test
//    public void getAccount() throws Exception {
//        this.mockMvc.perform(get("/accounts/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//            .andExpect(status().isOk())
//            .andExpect(content().contentType("application/json"))
//            .andExpect(jsonPath("$.name").value("Lee"));
//    }
}
