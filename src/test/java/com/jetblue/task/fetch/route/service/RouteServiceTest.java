package com.jetblue.task.fetch.route.service;

import com.jetblue.task.fetch.route.AbstractTest;
import com.jetblue.task.fetch.route.dao.RouteDao;
import com.jetblue.task.fetch.route.model.Route;
import com.jetblue.task.fetch.route.service.impl.RouteServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RouteServiceTest extends AbstractTest {
    @InjectMocks
    private RouteServiceImpl routeService;

    @Mock
    private RouteDao routeDao;

    @Before
    public void setup() {
        initMocks(this);
        ReflectionTestUtils.setField(routeService, "list", mockListData());
    }


    @Test
    public void testGetSpecificRoute() {
        List<Route> result = routeService.getSpecificRoute("ABC");
        assertEquals("ABC", result.get(0).getCity1());
        assertEquals("MNO", result.get(0).getCity2());
        assertEquals("PQR", result.get(0).getCity3());
        assertEquals("0", result.get(0).getMint());
        assertEquals("1", result.get(0).getSeasonal());
    }

    private List<Route> mockListData() {
        Route route = new Route("ABC", "MNO", "PQR", "0", "1");
        List<Route> routeList = new ArrayList<>();
        routeList.add(route);
        return routeList;
    }

}
