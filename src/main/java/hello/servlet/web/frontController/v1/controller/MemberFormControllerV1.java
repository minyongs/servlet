package hello.servlet.web.frontController.v1.controller;

import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontController.v1.ControllerV1;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {


    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath ="/WEB-INF/views/new-form.jsp";// 뷰 경로 초기화
        //경로 전달
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        //만들어진 객체 jsp 에 전달
        dispatcher.forward(request, response);
    }
}
