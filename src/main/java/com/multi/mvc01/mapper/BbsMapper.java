package com.multi.mvc01.mapper;

import com.multi.mvc01.dto.BbsDTO;
import com.multi.mvc01.dto.BookDTO;
import org.mapstruct.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface BbsMapper {

    List<BbsDTO> findBbs();


}
