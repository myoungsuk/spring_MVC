package com.multi.mvc01.controller;

import com.multi.mvc01.dao.BbsDAO;

import com.multi.mvc01.dto.BbsDTO;
import com.multi.mvc01.dto.ReplyDTO;
import com.multi.mvc01.service.BbsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bbs")
@Slf4j
public class BbsController {

    private final BbsService bbsService;


    @GetMapping("/mapper")
    public ResponseEntity<List<BbsDTO>> findBbs(BbsDTO bbsDTO) {

        List<BbsDTO> bbsDTOList = bbsService.findBbs(bbsDTO);

        return ResponseEntity.ok(bbsDTOList);
    }

    @GetMapping("/jpa")
    public ResponseEntity<List<BbsDTO>> findAllBbs() {

        List<BbsDTO> bbsDTOList = bbsService.findAllBbs();

        return ResponseEntity.ok(bbsDTOList);
    }

//    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<?> addComment(@RequestParam("oriid") int oriid,
//                                        @RequestParam("content") String content) {
//        ReplyDTO reply = new ReplyDTO();
//        reply.setOriid(oriid); // oriid를 String으로 변환할 필요가 없습니다.
//        reply.setContent(content);
//        reply.setWriter("apple");
//
//        int result = replyDAO.insertReply(reply);
//        if (result == 1) {
//            return ResponseEntity.ok("{\"result\": \"success\"}");
//        } else {
//            return ResponseEntity
//                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("{\"result\": \"fail\"}");
//        }
//    }


//    @RequestMapping("one")
//    public void one(BbsDTO BbsDTO, Model model) throws Exception {
//
//        BbsDTO bbsDTO = bbsDAO.getOneBbs(BbsDTO); // 게시글 하나를 가져온다
//        List<ReplyDTO> replyDTOList = replyDAO.getReplylist(BbsDTO.getId()); //댓글 리스트를 가져온다
//
//        model.addAttribute("bbsDTO", bbsDTO); // views/one.jsp 에 게시글 속성값을 부여해준다
//        model.addAttribute("replyDTOList", replyDTOList); // views/one.jsp에 댓글리스트 속성값을 부여해준ㄲㄷ벼
//    }
//
//    @RequestMapping("list")
//    public void list(Model model) throws Exception {
//        //BbsDAO dao = new BbsDAO();
//        ArrayList<BbsDTO> list = bbsDAO.list();
//        System.out.println("list.size() : " + list.size());
//
//        model.addAttribute("list", list);
//
//    }
//
//
//    //요청하나당 함수하나.
//    @RequestMapping("insert2") //등록 컨트롤러
//    public void insert2(BbsDTO bag, Model model) {
//        //db처리 --> views/
//
//        //BbsDAO dao = new BbsDAO();
//        int result = bbsDAO.insert(bag);
//        System.out.println("result: " + result);
//        //result는 views 아래까지 가지고 가야하는 속성값이야 설정
//        //views까지 데이터를 넘길 수 있는 객체 필요(Model)
//        //함수 (Model model)써놓으면 스프링이 model 객체를 만들어서 넣어준다.
//        model.addAttribute("result", result);
//
//    }
//
//    @RequestMapping("update2") //업데이트 컨트롤러
//    public String update2(BbsDTO bag) {
//        //BbsDAO dao = new BbsDAO();
//        int result = bbsDAO.update(bag);
//        if (result == 1) {
//            return "redirect:bbs.jsp"; //views/ok.jsp
//        } else {
//            return "no"; //views/no.jsp
//        }
//    }
//
//    @RequestMapping("delete2") //삭제 컨트롤러
//    public String delete2(BbsDTO bag) {
//        //BbsDAO dao = new BbsDAO();
//        int result = bbsDAO.delete(bag);
//        if (result == 1) {
//            return "ok"; //views/ok.jsp
//        } else {
//            return "no"; //views/no.jsp
//        }
//    }
}
