package hello.servlet.web.frontController.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//컨트롤러 인터페이스
public interface ControllerV1 {

    //서블릿 모양과 유사함
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
