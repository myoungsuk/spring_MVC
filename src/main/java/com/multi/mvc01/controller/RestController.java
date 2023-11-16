package com.multi.mvc01.controller;

import com.multi.mvc01.dao.BbsDAO;
import com.multi.mvc01.dto.BbsDTO;
import com.multi.mvc01.dto.MapDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class RestController {

    @Autowired
    BbsDAO bbsDAO;

    @RequestMapping("string")
    @ResponseBody //controller에서 리턴할 때!
    public String string() {
        return "winner";
    }

    @RequestMapping("json1")
    @ResponseBody
    public BbsDTO json1() {

        BbsDTO bbsDTO = new BbsDTO();
        bbsDTO.setId(1);
        bbsDTO.setTitle("제목");
        bbsDTO.setContent("내용");
        bbsDTO.setWriter("kang");

        return bbsDTO;
    }

    @RequestMapping("json2")
    @ResponseBody
    public ArrayList<BbsDTO> json2() {

        ArrayList<BbsDTO> bbsDTOArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            BbsDTO bbsDTO = new BbsDTO();
            bbsDTO.setId(i);
            bbsDTO.setTitle("제목" + i);
            bbsDTO.setContent("내용" + i);
            bbsDTO.setWriter("kang" + i);

            bbsDTOArrayList.add(bbsDTO);
        }
        return bbsDTOArrayList;
    }


    @RequestMapping("jsonbbs")
    @ResponseBody
    public ArrayList<BbsDTO> list() throws Exception {

        ArrayList<BbsDTO> list = bbsDAO.list();

        return list;

    }

    @RequestMapping("map1")
    @ResponseBody
    public MapDTO kakaoMap(){
        MapDTO mapDTO = new MapDTO();
        mapDTO.setLat(37.498095);
        mapDTO.setLon(127.027610);

        return mapDTO;
    }
}
