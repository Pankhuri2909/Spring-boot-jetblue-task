package com.jetblue.task.fetch.route.controller;

import com.jetblue.task.fetch.route.model.Route;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RouteController {

    @GetMapping(value = "/route")
    public List<Route> get();

    @GetMapping(value = "/route/{name}")
    public List<Route> getSpecificRoute(@PathVariable(value = "name") String city);
}
