package part02_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//java소스를 이용해 환경설정한다.
@Configuration
///<aop:aspectj-autoproxy></aop:aspectj-autoproxy>를 자바소스로 준것
@EnableAspectJAutoProxy
public class Config {
	public Config() {
	
	}
	
	//@Bean에 이름을 주지 않으면 메소드명이 @Bean의 id가 된다.
	@Bean
	public ServiceImp svc() {
		return new ServiceImp();
	}
	
	@Bean
	public AdviceCommon common() {
		return new AdviceCommon();
	}
}//end class
