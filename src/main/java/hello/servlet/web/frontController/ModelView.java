package hello.servlet.web.frontController;

import java.util.HashMap;
import java.util.Map;

public class ModelView {

    private String viewName; // 뷰
    //모델에다 원하는 데이터를 넣으면 나중에 jsp에서 쓸수 있도록 함
    private Map<String, Object> model = new HashMap<>(); //모델

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
