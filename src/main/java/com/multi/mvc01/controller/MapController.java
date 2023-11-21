package com.multi.mvc01.controller;

import com.multi.mvc01.dao.BbsDAO;
import com.multi.mvc01.dao.MapDAO;
import com.multi.mvc01.dto.BbsDTO;
import com.multi.mvc01.dto.MapDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MapController {

    @Autowired
    MapDAO mapDAO;


    @RequestMapping("getMap")
    @ResponseBody
    public MapDTO getMap(String location) {

        return mapDAO.getMap(location);
    }

    @RequestMapping("getMapList")
    @ResponseBody
    public ArrayList<MapDTO> getMapList() {

        return (ArrayList<MapDTO>) mapDAO.getMapList();
    }

}
