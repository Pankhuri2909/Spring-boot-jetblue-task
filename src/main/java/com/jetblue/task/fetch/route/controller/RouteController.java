package com.jetblue.task.fetch.route.controller;

import com.jetblue.task.fetch.route.model.Route;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public interface RouteController {

    @GetMapping(value = "/route")
    @ApiOperation(value = "Finds all the routes",
    notes = "It does not require any argument to be passed, it just returns all the possible routes",
    response = Route.class)
    public List<Route> get();

    @GetMapping(value = "/route/{name}")
    @ApiOperation(value = "Finds the routes from specific city",
            notes = "It requires a city to be passed as an argument and then it just returns all the possible routes",
            response = Route.class)
    public List<Route> getSpecificRoute(@ApiParam(value = "cityname", required = true) @PathVariable(value = "name") String city);
}
