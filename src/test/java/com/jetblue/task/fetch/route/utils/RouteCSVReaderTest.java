package com.jetblue.task.fetch.route.utils;

import com.jetblue.task.fetch.route.model.Route;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RouteCSVReaderTest {

    private Exception exception;

    @Test
    public void getCSVRouteDataTest() {
        List<Route> routes = RouteCSVReader.getCSVRouteData();
        assertEquals("ABQ",routes.get(0).getCity1());
        assertEquals("0",routes.get(0).getCity2());
        assertEquals("JFK",routes.get(0).getCity3());
        assertEquals("0",routes.get(0).getMint());
        assertEquals("0",routes.get(0).getSeasonal());
        assertEquals(69,routes.size());
        assertNotNull(routes);
    }

}
