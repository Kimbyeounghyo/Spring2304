package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TVMain {

	/*
	 * public static void main(String[] args) {
	 * 
	 * ClassPathXmlApplicationContext ctx = new
	 * ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	 * 
	 * TV tvc1 = (TV)ctx.getBean("tv1"); TVcontrol(tvc1);
	 * 
	 * TV tvc2 = (TV)ctx.getBean("tv2"); TVcontrol(tvc2);
	 * 
	 * ctx.close(); } public static void TVcontrol(TV tv) { tv.powerOff();
	 * tv.powerOn(); tv.volumeDown(); tv.volumeUp(); }
	 */

	public static void main(String[] args) {
	//Spring 컨테이너 
	/* AbstractApplicationContext : BeanFactory + ApplicationContext 
	 * GenericXmlApplicationContext : 파일과 클래스 관리 설정(xml)*/
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
	//컨테이너로부터 필요한 객체를 요청
		TV tv1=(TV)ctx.getBean("tv1");
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		
		TV tv2=(TV)ctx.getBean("tv2");
		tv2.powerOn();
		tv2.powerOff();
		tv2.volumeUp();
		tv2.volumeDown();
		
		ctx.close();
	}
}
