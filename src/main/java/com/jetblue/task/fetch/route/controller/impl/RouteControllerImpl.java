package com.jetblue.task.fetch.route.controller.impl;

import com.jetblue.task.fetch.route.controller.RouteController;
import com.jetblue.task.fetch.route.model.Route;
import com.jetblue.task.fetch.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class RouteControllerImpl implements RouteController {

    @Autowired
    private RouteService routeService;

    public List<Route> get() {
        return routeService.get();
    }

    public List<Route> getSpecificRoute(@PathVariable(value = "name") String city) {
        return routeService.getSpecificRoute(city);
    }
}

