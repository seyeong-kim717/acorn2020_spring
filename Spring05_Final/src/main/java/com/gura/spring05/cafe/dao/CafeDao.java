package com.gura.spring05.cafe.dao;

import java.util.List;

import com.gura.spring05.cafe.dto.CafeDto;

public interface CafeDao {
	//글목록
	public List<CafeDto> getList(CafeDto dto);
	//글의 갯수
	public int getCount(CafeDto dto);
<<<<<<< HEAD
	//글 추가
	public void insert(CafeDto dto);
	//글정보 얻어오기
	public CafeDto getData(int num);
	//키워드를 활용한 글정보 얻어오기
	public CafeDto getData(CafeDto dto);
	//조회수 증가 시키기
	public void addViewCount(int num);
	//글 삭제
	public void delete(int num);
	//글 수정
	public void update(CafeDto dto);
}









=======
	//글추가
	public void insert(CafeDto dto);
	//글 정보 얻어오기
	public CafeDto getData(int num);
	//키워드를 활용한 글정보 얻어오기
	public CafeDto getData(CafeDto dto);//인지값이 달라서 같은 필드명을 가질수 있다.
	//조회수 증가 시키기
	public void addViewCount(int num);
	//글 삭제
	public void delete(int num);
	//글 수정
	public void update(CafeDto dto);
	
}
>>>>>>> refs/remotes/origin/irene
