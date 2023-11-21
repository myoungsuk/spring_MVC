package com.multi.mvc01.dao;

import com.multi.mvc01.dto.ChartDTO;
import com.multi.mvc01.dto.MapDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChartDAO {

    @Autowired
    SqlSessionTemplate my;

    public ChartDTO getChart(int id) {
        return my.selectOne(("chart.getChart"), id);
    }

    public List<ChartDTO> getChartList() {
        return my.selectList("chart.getChartList");
    }
}
