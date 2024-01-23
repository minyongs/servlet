package hello.servlet.web.frontController.v3.controller;

import hello.servlet.web.frontController.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String,String> paraMap);
}
