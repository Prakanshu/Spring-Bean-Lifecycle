package guru.springframework.bean.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean,BeanNameAware,BeanFactoryAware,DisposableBean,ApplicationContextAware {

	@Override
	public void afterPropertiesSet() throws Exception {
		

		System.out.println("After property set is called");
	}

	public LifeCycleDemoBean() {
		
		System.out.println("I'm in the Lifecycle bean constructor");
	}

	@Override
	public void setBeanName(String name) {

		System.out.println("Bean Name is "+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		
		System.out.println("Set Bean Factory is Executed "+beanFactory.getBean("lifeCycleDemoBean").getClass().getName());
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Disposable bean's destroy () is called");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("ApplicationContext is Executed "+applicationContext.getBeanDefinitionCount());
	}
   @PreDestroy
   public void preDestroy() {
	   
	   System.out.println("Pre Destroy is Called");
   }
   
   @PostConstruct
   public void postConstruct() {
	   System.out.println("Post Construct is Called");
   }

public void beforeInit() {
	
	System.out.println("Before Init - Called By Bean Post Proccessor");
}



public void afterInit() {
	
	System.out.println("After Init - Called By Bean Post Proccessor");
}
}
