package hello.servlet.web.frontController.v4;

import java.util.Map;



public interface ControllerV4 {
    String process(Map<String,String> paraMap, Map<String,Object> model);
}
