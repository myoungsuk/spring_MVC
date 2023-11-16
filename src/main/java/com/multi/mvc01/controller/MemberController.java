package com.multi.mvc01.controller;

import javax.servlet.http.HttpSession;

import com.multi.mvc01.dao.MemberDAO;
import com.multi.mvc01.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 객체 생성 + 컨트롤러로 역할을 하는 클래스로도 설정 
public class MemberController {

    //스프링이 찾아서 주소룰 넣어줌

    @Autowired //자동으로 이 MemberDAO클래스로 만들어진 개게가 램에 어디에 있는지 주소를 찾아서 아래 변수의 주소를 넣어준다.
    MemberDAO memberDAO;

    //버튼을 눌러서 요청 --> 함수 하나!!!
    @RequestMapping("insert")
    public String insert(MemberDTO memberDTO) {
        //함수(bag) ==> 요청할 때 만든다.(프로토타입)
        //함수(bag) ==> 클라이언트로부터 전달된 값을 가방을 만들어서 넣어주세요ㅣ.
        System.out.println(memberDTO);

        //MemberDAO dao = new MemberDAO();
        int result = memberDAO.insert(memberDTO); //int(1/0)
        String resultText = "";
        if (result == 1) {
            resultText = "회원가입에 성공했습니다.";
        } else {
            resultText = "회원가입에 실패했습니다.";
        }
        System.out.println(resultText);

        return "redirect:member.jsp";
    }

    @RequestMapping("login")
    public String login(MemberDTO memberDTO, HttpSession session) throws Exception {

        try {
            boolean result = memberDAO.login(memberDTO);

            if (result) {
                session.setAttribute("id", memberDTO.getId());
                return "redirect:bbs_mvc2.jsp";
            } else {
                return "redirect:member.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:member.jsp";
        }
    }


}
