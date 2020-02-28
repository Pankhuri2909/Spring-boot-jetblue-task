package com.jetblue.task.fetch.route.service.impl;

import com.jetblue.task.fetch.route.dao.RouteDao;
import com.jetblue.task.fetch.route.model.Route;
import com.jetblue.task.fetch.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {

    private static List<Route> list;

    @Autowired
    RouteDao routeDao;

    @Override
    public List<Route> get() {
        return list;
    }

    public List<Route> getSpecificRoute(@PathVariable(value = "name") String city) {
        System.out.println("CITY : " + city);
        List<Route> listOfAllRoutes = get();

        List<Route> routes = listOfAllRoutes.stream()
                .filter(route -> route.getCity1().equals(city))
                .collect(Collectors.toList());

        System.out.println("COUNT OF SPECIFIC CITY :"+routes.size());

        return routes;
    }

    @PostConstruct
    public void loadList(){
        list =  routeDao.getAllRoutes();
    }
}
