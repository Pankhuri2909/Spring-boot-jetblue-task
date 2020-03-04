package com.jetblue.task.fetch.route.service.impl;

import com.jetblue.task.fetch.route.dao.RouteDao;
import com.jetblue.task.fetch.route.model.Route;
import com.jetblue.task.fetch.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private static List<Route> list;

    @Autowired
    RouteDao routeDao;

    public List<Route> getSpecificRoute(String city) {
        System.out.println("CITY : " + city);
        List<Route> listOfAllRoutes = list;

        List<Route> routes = listOfAllRoutes.stream()
                .filter(route -> route.getCity1().equals(city))
                .collect(Collectors.toList());

        return routes;
    }

    @PostConstruct
    public void loadList(){
        list =  routeDao.get();
    }
}
