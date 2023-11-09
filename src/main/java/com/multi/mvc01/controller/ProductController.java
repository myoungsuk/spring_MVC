package com.multi.mvc01.controller;

import com.multi.mvc01.dao.ProductDAO;
import com.multi.mvc01.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤
public class ProductController {

    //요청 하나당 함수하나!
    @RequestMapping("insert3")
    public String insert3(ProductDTO dto, Model model) {
        System.out.println("insert3() 호출됨");
        ProductDAO dao = new ProductDAO();
        int result = dao.insert(dto);

        model.addAttribute("result", result);

        if(result == 1) {
            return "insert3";
        }else {
            return "redirect:product.jsp";
        }
    }

    @RequestMapping("update3")
    public String update3(ProductDTO dto, Model model) {
        System.out.println("update3() 호출됨");
        ProductDAO dao = new ProductDAO();
        int result = dao.update(dto);

        model.addAttribute("result", result);

        if(result == 1) {
            return "ok";
        } else {
            return "no";
        }

    }
}
