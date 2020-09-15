package com.gura.spring05.aspect;

import javax.servlet.http.HttpServletRequest;

<<<<<<< HEAD
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gura.spring05.cafe.dao.CafeDao;
import com.gura.spring05.cafe.dto.CafeDto;
import com.gura.spring05.exception.NotDeleteException;
import com.gura.spring05.file.dao.FileDao;
import com.gura.spring05.file.dto.FileDto;

@Aspect
@Component
public class DeleteAspect {
	
	@Autowired
	private FileDao fileDao;
	@Autowired
	private CafeDao cafeDao;
	
	@Around("execution(void com.gura.spring05.cafe.service.*.deleteContent(..))")
	public void checkCafeDelete(ProceedingJoinPoint joinPoint) throws Throwable {
		//메소드에 전달된 인자값을 저장할 지역 변수 
		int num=0;
		HttpServletRequest request=null;
		
		Object[] args=joinPoint.getArgs();
		for(Object tmp:args) {
			if(tmp instanceof Integer) { //전달된 인자중에서 정수(int) 찾기
				num=(int)tmp;
			}
			if(tmp instanceof HttpServletRequest) {//HttpServletRequest 찾기
				request=(HttpServletRequest)tmp;
			}
		}
		//삭제할 글 정보를 얻어온다.
		CafeDto cafeDto=cafeDao.getData(num);
		//세션에 저장된 아이디를 읽어온다(로그인된 아이디)
		String id=(String)request.getSession().getAttribute("id");
		if(!id.equals(cafeDto.getWriter())) {
			throw new NotDeleteException("남의 글 지우기 없기!");
		}
		//메소드 정상 수행하기 
		joinPoint.proceed();		
	}
	
	@Around("execution(void com.gura.spring05.file.service.*.delete*(..))")
	public void checkFileDelete(ProceedingJoinPoint joinPoint) throws Throwable {
		//메소드에 전달된 인자값을 저장할 지역 변수 
		int num=0;
		HttpServletRequest request=null;
		
		Object[] args=joinPoint.getArgs();
		for(Object tmp:args) {
			if(tmp instanceof Integer) { //전달된 인자중에서 정수(int) 찾기
				num=(int)tmp;
			}
			if(tmp instanceof HttpServletRequest) {//HttpServletRequest 찾기
				request=(HttpServletRequest)tmp;
			}
		}
		//삭제할 파일의 정보를 얻어온다.
		FileDto fileDto=fileDao.getData(num);
		//세션에 저장된 아이디를 읽어온다(로그인된 아이디)
		String id=(String)request.getSession().getAttribute("id");
		if(!id.equals(fileDto.getWriter())) {
			throw new NotDeleteException("남의 파일 지우기 없기!");
		}
		//메소드 정상 수행하기 
		joinPoint.proceed();
	}
}






=======
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gura.spring05.cafe.dao.CafeDao;
import com.gura.spring05.cafe.dto.CafeDto;
import com.gura.spring05.exception.NotDeleteException;
import com.gura.spring05.file.dao.FileDao;
import com.gura.spring05.file.dto.FileDto;

@Aspect
@Component
public class DeleteAspect {
	
	@Autowired
	private FileDao fileDao;
	@Autowired
	private CafeDao cafeDao;
	
	@Around("execution(void com.gura.spring05.cafe.service.*.deleteContent*(..))")
	public void checkCafeDelete(ProceedingJoinPoint joinPoint) throws Throwable{
		//메소드에 전달된 인자값을 저장할 지역 변수
		int num=0;
		HttpServletRequest request=null;
		
		Object[] args=joinPoint.getArgs();
		for (Object tmp:args) {
			if (tmp instanceof Integer) {
				num=(int)tmp;
			}
			if (tmp instanceof HttpServletRequest) {
				request=(HttpServletRequest)tmp;
			}
		}
		CafeDto dto=cafeDao.getData(num);
		//2. 본인이 작성한 글이 아닌경우 에러 처리를한다 (예외를 발생시킨다)
		String id=(String)request.getSession().getAttribute("id");
		//만일 로그인된 아이디와 글 작성자가 다르면
		if(!id.equals(dto.getWriter())) {
			throw new NotDeleteException("남의 글 지우기 없기!");
		}
		joinPoint.proceed();
	}
	
	@Around("execution(void com.gura.spring05.file.service.*.delete*(..))")
	//.*. 은 class delete*는 method
	public void checkFileDelete(ProceedingJoinPoint joinPoint) throws Throwable{
		//메소드에 전달된 인자값을 저장할 지역 변수
		int num=0;
		HttpServletRequest request=null;
		
		Object[] args=joinPoint.getArgs();
		for (Object tmp:args) {
			if (tmp instanceof Integer) {//전달된 인자중에서 정수 (int)찾기
				num=(int)tmp;
			}
			if (tmp instanceof HttpServletRequest) {//HttpServletRequest 찾기
				request=(HttpServletRequest)tmp;
			}
		}
		//삭제할 파일의 정보를 얻어온다.
		FileDto fileDto=fileDao.getData(num);
		//세션에 저장된 아이디를 읽어온다(로그인된 아이디)
		String id=(String)request.getSession().getAttribute("id");
		if (!id.equals(fileDto.getWriter())) {
			throw new NotDeleteException("남의 파일 지우기 없기!");
		}
		//메소드 정상수행하기
		joinPoint.proceed();
	}
}
>>>>>>> refs/remotes/origin/irene
