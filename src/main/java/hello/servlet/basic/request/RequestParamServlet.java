package hello.servlet.basic.request;

import hello.servlet.basic.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
파라미터 전송 기능
 */

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("[전체 파라미터 조회] - start" );
        req.getParameterNames().asIterator()
                        .forEachRemaining(paramName -> System.out.println(paramName +"="+req.getParameter(paramName)));
        System.out.println("[전체 파라미터 조회] - end" );
        System.out.println();


        System.out.println("단일 파라미터 조회");
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println();


        //?username=hello&age=20&username=hello2 일때
        // username 파라미터가 두개이다
        //그냥 내부 우선순위에서 먼저 잡히는애가 먼저 나옴

        System.out.println("이름이 같은 복수 파라미터 조회");
        String[] usernames = req.getParameterValues("username");

        for (String s : usernames) {
            System.out.println("s = " + s);
            
        }

        resp.getWriter().write("ok");


    }
}
