package com.multi.mvc01.controller;

import com.multi.mvc01.dao.BbsDAO;
import com.multi.mvc01.dto.BbsDTO2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

    @RequestMapping("one")
    public void one(BbsDTO2 dto, Model model) throws Exception {
        BbsDAO dao = new BbsDAO();
		BbsDTO2 bag = dao.one(dto);
		model.addAttribute("bag", bag);
		// 자동타입변환(자동 형변환, Casting, 업캐스팅)


    }

	@RequestMapping("list")
    public void list() throws Exception {
		BbsDAO dao = new BbsDAO();
		dao.list();

    }


    //요청하나당 함수하나.
    @RequestMapping("insert2") //등록 컨트롤러
    public void insert2(BbsDTO2 bag, Model model) {
        //db처리 --> views/

        BbsDAO dao = new BbsDAO();
        int result = dao.insert(bag);
        System.out.println("result: " + result);
        //result는 views 아래까지 가지고 가야하는 속성값이야 설정
        //views까지 데이터를 넘길 수 있는 객체 필요(Model)
        //함수 (Model model)써놓으면 스프링이 model 객체를 만들어서 넣어준다.
        model.addAttribute("result", result);

    }

    @RequestMapping("update2") //업데이트 컨트롤러
    public String update2(BbsDTO2 bag) {
        BbsDAO dao = new BbsDAO();
        int result = dao.update(bag);
        if (result == 1) {
            return "redirect:bbs.jsp"; //views/ok.jsp
        } else {
            return "no"; //views/no.jsp
        }
    }

    @RequestMapping("delete2") //삭제 컨트롤러
    public String delete2(BbsDTO2 bag) {
        BbsDAO dao = new BbsDAO();
        int result = dao.delete(bag);
        if (result == 1) {
            return "ok"; //views/ok.jsp
        } else {
            return "no"; //views/no.jsp
        }
    }
}
