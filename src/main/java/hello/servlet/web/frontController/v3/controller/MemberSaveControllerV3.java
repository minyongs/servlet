package hello.servlet.web.frontController.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontController.ModelView;


import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paraMap) {
        //파라맵에다가 꺼냄 ->http 리퀘스트는  프론트 컨트롤러에서 처리
        String username = paraMap.get("username");
        Integer age = Integer.parseInt(paraMap.get("age"));

        Member member = new Member(username,age);
        memberRepository.save(member);
        // 모델 뷰 객체 생성
        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;


    }
}
