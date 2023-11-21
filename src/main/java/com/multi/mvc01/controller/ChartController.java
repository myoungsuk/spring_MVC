package com.multi.mvc01.controller;

import com.multi.mvc01.dao.ChartDAO;
import com.multi.mvc01.dao.MapDAO;
import com.multi.mvc01.dto.ChartDTO;
import com.multi.mvc01.dto.MapDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class ChartController {

    @Autowired
    ChartDAO chartDAO;


    @RequestMapping("getChart/one")
    @ResponseBody
    public ChartDTO chartDTO(int id) {

        return chartDAO.getChart(id);
    }

    @RequestMapping("getChartList")
    @ResponseBody
    public ArrayList<ChartDTO> getChartList() {

        return (ArrayList<ChartDTO>) chartDAO.getChartList();
    }

}
