package part01_xml;

import org.aspectj.lang.ProceedingJoinPoint;

//공통로직만 구현해 놓은 클래스 - Advice
public class AdviceCommon {
	public AdviceCommon() {
	
	}
	
	public void comm1() {
		System.out.println("before");
	}
	
	public void comm2() {
		System.out.println("after");
	}
	
	public void comm3(String name) {
		System.out.println(name);
	}
	
	public void comm4(Exception ex) {
		System.out.println("comm4:" + ex);
	}
	
	public void comm5(ProceedingJoinPoint point) {
		System.out.println("comm5 start");
		
		try {
			point.proceed();  //핵심로직 prn5로 이동
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("comm5 end");
	}
}
