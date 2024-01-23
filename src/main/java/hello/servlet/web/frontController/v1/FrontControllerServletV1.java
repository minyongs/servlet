package hello.servlet.web.frontController.v1;

import hello.servlet.web.frontController.v1.controller.MemberFormControllerV1;
import hello.servlet.web.frontController.v1.controller.MemberSaveControllerV1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
// url 을 이렇게 하면 v1 아래의 모든 링크가 프론트 컨트롤러를 거쳐야함
@WebServlet(name = "frontControllerServletV1", urlPatterns ="/front-controller/v1/*")
public class FrontControllerServletV1 extends HttpServlet {

    // 컨트롤러 객체 들을 모아두는 맵
    private Map<String, ControllerV1> controllerMap = new HashMap<>();

    //생성자로 url , 컨트롤러 객체 주입
    public FrontControllerServletV1() {
        controllerMap.put("/front-controller/v1/members/new-form", new MemberFormControllerV1());
        controllerMap.put("/front-controller/v1/members/save", new MemberSaveControllerV1());

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV1.service");

        String requestURI = request.getRequestURI();//요청으로 온 uri 저장
        // 요청에 맞는 컨트롤러 url 로 맵에서 찾아 꺼내옴
        ControllerV1 controller = controllerMap.get(requestURI);
        // 컨트롤러가 없을시 404
        if(controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        controller.process(request,response);
    }
}
