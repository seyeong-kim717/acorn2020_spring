package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// init.xml 문서를 로딩해서 Spring 이 생성할 객체는 생성해서 관리 하도록 한다.
		ApplicationContext context=
				new ClassPathXmlApplicationContext("test/main/init.xml");
		// 관리 하고 있는 객체 중에서 id  가  myWeapon 인 객체의 참조값 얻어와서 
		// 인터페이스 type 으로 casting  한다. 
		Weapon w=(Weapon)context.getBean("myWeapon");
		// 필요한 기능 사용하기 
		w.attack();
	}
}

//Mainclass01과 출력값은 같다 01과는 다르게 import 하지 않음
//Weapon에 의지하지 않아 코딩량이 증가하긴 하지만 의존성이 낮아지고 유지보수가 쉬워진다.
//(스프링 쓰는이유)







