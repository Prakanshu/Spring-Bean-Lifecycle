# Spring-Bean-Lifecycle
Demonstration of spring bean life cycle

o/p:-


I'm in the Lifecycle bean constructor  // Instantiation
Bean Name is lifeCycleDemoBean         // setBean() from BeanName Aware Interface
Set Bean Factory is Executed guru.springframework.bean.lifecycle.LifeCycleDemoBean //setBeanFactory() from BeanFactory Aware Interface
ApplicationContext is Executed 31     //  setApplicationContext() from ApplicationContextAware Interface
Before Init - Called By Bean Post Proccessor  // beforeInit() from BeanPostProcessor Marker Interface
Post Construct is Called                      // Annotation called just after bean is constructed and handed over to requester
After property set is called                  // afterPropertiesSet() from InitializingBean Interface is called
After Init - Called By Bean Post Proccessor   // afterInit() from BeanPostProcessor Marker Interface
Pre Destroy is Called                         // Annotation called just before bean is ready for destroy
Disposable bean's destroy () is called        // destroy() from DisposableBean is called
