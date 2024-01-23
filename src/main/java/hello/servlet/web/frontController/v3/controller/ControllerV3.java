package hello.servlet.web.frontController.v3.controller;

import hello.servlet.web.frontController.ModelView;

import java.util.Map;

public interface ControllerV3 {

    //서블릿 기술들이 들어가지 않음
    ModelView process(Map<String,String> paraMap);
}
