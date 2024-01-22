//package hello.servlet.web.servlet;
//
//import hello.servlet.domain.member.Member;
//import hello.servlet.domain.member.MemberRepository;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//@WebServlet(name = "memeberListServlet", urlPatterns = "/servlet/members")
//public class MemberListServlet extends HttpServlet {
//
//    private MemberRepository memberRepository = MemberRepository.getInstance();
//
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        List<Member> members = memberRepository.findAll();
//
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("utf-8");
//
//        PrintWriter w = resp.getWriter();
//
//        w.write("<html>");
//        w.write("<head>");
//        w.write("    <meta charset=\"UTF-8\">");
//        w.write("    <title>Title</title>");
//        w.write("</head>");
//        w.write("<body>");
//        w.write("<a href=\"/index.html\">메인</a>");
//        w.write("<table>");




//    }
//}