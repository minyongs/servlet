package hello.servlet.web.frontController.v3.controller;

import hello.servlet.web.frontController.ModelView;


import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    //view 의 전체 path 를 넣는게 아닌 논리적인 이름만 넣음 !

    @Override
    public ModelView process(Map<String, String> paraMap) {
        return new ModelView("new-form");
    }
}
