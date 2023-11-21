package com.multi.mvc01.dao;

import com.multi.mvc01.dto.MapDTO;
import com.multi.mvc01.dto.ReplyDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MapDAO {

    @Autowired
    SqlSessionTemplate my;

    public MapDTO getMap(String location) {
        return my.selectOne(("map.getMap"), location);
    }

    public List<MapDTO> getMapList() {
        return my.selectList("map.getMapList");
    }
}
