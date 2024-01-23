package hello.servlet.web.frontController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;
// 별도로 View 를 처리하는 객체
public class MyView {
    private String viewPath;

    //프론트 컨트롤러로부터 viewpath 받아옴
    //생성자로 viewpath 초기화
    public MyView(String viewPath){
        this.viewPath = viewPath;
    }
    // viewpath 를 받아서 jsp 로 렌더링하는 메서드
    public void render(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }

    public void render(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        modelToRequestAttribute(model, request);
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }

    private static void modelToRequestAttribute(Map<String, Object> model, HttpServletRequest request) {
        model.forEach((key, value)-> request.setAttribute(key,value));
    }
}
