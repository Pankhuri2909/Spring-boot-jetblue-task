package com.jetblue.task.fetch.route.controller;

import com.jetblue.task.fetch.route.AbstractTest;
import com.jetblue.task.fetch.route.model.Route;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

public class RouteControllerTest extends AbstractTest {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {
        initMocks(this);
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void getRouteSpecificListTest() throws Exception {
        String uri = "/route/ABQ";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Route[] routeList = super.mapFromJson(content ,Route[].class);
        assertTrue(routeList.length > 0);

    }

}
