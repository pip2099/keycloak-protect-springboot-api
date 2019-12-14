package com.lanhusoft.controller;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright www.lanhusoft.com
 * Author:Apex Zheng
 * Date:2019/12/11
 * Description:
 */
@RestController
//@Controller
public class HomeController {
    private final HttpServletRequest request;

    @Autowired
    public HomeController(HttpServletRequest request) {
        this.request = request;
    }

    @GetMapping("/hello")
//    @ResponseBody
    public String hello() {
        return "hello";
//        KeycloakSecurityContext keycloakSecurityContext = (KeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
//        return "Hello keycloak api from=>name: "
//                + keycloakSecurityContext.getIdToken().getName()
//                + ",email: "
//                + keycloakSecurityContext.getIdToken().getEmail();
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
