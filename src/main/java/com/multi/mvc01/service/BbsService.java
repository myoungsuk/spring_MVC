package com.multi.mvc01.service;

import com.multi.mvc01.dto.BbsDTO;
import com.multi.mvc01.entity.BbsEntity;
import com.multi.mvc01.mapper.BbsMapper;
import com.multi.mvc01.repository.BbsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class BbsService {

    private final BbsMapper bbsMapper;
    private final BbsRepository bbsRepository;



    public List<BbsDTO> findBbs(BbsDTO bbsDTO) {
        log.info("service ...");

        return bbsMapper.findBbs();
    }


    @Transactional(readOnly = true)
    public List<BbsDTO> findAllBbs() {
        log.info("service ...");

        return bbsRepository.findAll().stream()
                .map(BbsDTO::from)
                .collect(Collectors.toList());
    }
}
