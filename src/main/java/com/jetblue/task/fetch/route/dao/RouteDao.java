package com.jetblue.task.fetch.route.dao;

import com.jetblue.task.fetch.route.model.Route;
import com.jetblue.task.fetch.route.utils.RouteCSVReader;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RouteDao {

    public List<Route> get() {
        List<Route> listOfRoutes = RouteCSVReader.getCSVRouteData();
        return listOfRoutes;
    }

}
