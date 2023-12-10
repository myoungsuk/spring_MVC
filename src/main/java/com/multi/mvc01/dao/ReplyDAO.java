//package com.multi.mvc01.dao;
//
//import com.multi.mvc01.dto.ReplyDTO;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class ReplyDAO {
//
//    @Autowired
//    SqlSessionTemplate my;
//
//    public int insertReply(ReplyDTO replyDTO){
//        return my.insert("reply.insertReply", replyDTO);
//    }
//
//    public List<ReplyDTO> getReplylist(int id) {
//        return my.selectList("reply.getReplylist", id);
//    }
//}
