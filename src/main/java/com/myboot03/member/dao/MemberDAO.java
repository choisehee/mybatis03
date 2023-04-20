package com.myboot03.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot03.member.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	
	//�� ���� ���̹�Ƽ�������� DAO �������̽��� �߻�޼ҵ带 ������ �Ŀ� �������̽� ����Ŭ�������� SqlSessionŬ������ ���� ������
	//SQL ���� �����ؼ� ���������� ��������Ʈ������ ���� ũ������ �������� ���� Ŭ�������� DAO �������̽��� �߻� �޼��带 ȣ���ϸ�
	//�������̽������� ���� ���Ͽ��� ȣ��� �̸��� ������ id�� sql���� �ٷ� ���
	public List selectAllMemberList() throws DataAccessException ;
	
	public int insertMember(MemberVO memberVO) throws DataAccessException ;
	
	public void deleteMember(String id) throws DataAccessException;
	
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
}
