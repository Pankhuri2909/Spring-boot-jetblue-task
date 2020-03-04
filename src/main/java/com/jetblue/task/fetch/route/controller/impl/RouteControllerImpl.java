package com.jetblue.task.fetch.route.controller.impl;

import com.jetblue.task.fetch.route.controller.RouteController;
import com.jetblue.task.fetch.route.model.Route;
import com.jetblue.task.fetch.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class RouteControllerImpl implements RouteController {

    @Autowired
    private RouteService routeService;

    public List<Route> getRoute(String city) {
        return routeService.getSpecificRoute(city);
    }
}

