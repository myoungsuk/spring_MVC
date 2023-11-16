package com.multi.mvc01.dao;

import com.multi.mvc01.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DB를 접근하여 CRUD처리만 담당하는 부품
//다른 역할을 하지 않음.
@Repository //싱글톤 객체 + db예외처리, 창고, 저장소
public class MemberDAO {

    // 스프링이 램에 있는 mybatis를 찾아서 주소를 변수에 넣어준다.
    @Autowired
    SqlSessionTemplate my;

    // 각각의 처리를 메서드(함수)로 만들어라.
    // 가입처리
    public int insert(MemberDTO dto) {
        int result = my.insert("member.createMember", dto);

        return result; //1, 0
    }

    // 로그인처리
    public boolean login(MemberDTO dto) {

        try {
            int resultDTO = my.selectOne("member.login", dto);

            if (resultDTO == 1) {
                // 추가적인 비밀번호 확인 로직이 필요합니다
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
