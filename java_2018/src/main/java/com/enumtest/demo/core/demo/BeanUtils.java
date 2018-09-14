package com.enumtest.demo.core.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author fengyonggang
 *
 */
@Component
public class BeanUtils implements BeanFactoryAware {

	private static BeanFactory beanFactory;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		BeanUtils.beanFactory = beanFactory;
	}

	public static <T> T getBean(Class<T> requiredType, Object ...args) {
		return beanFactory.getBean(requiredType, args);
	}
	
	public static <T> T getBean(Class<T> requiredType){
		return beanFactory.getBean(requiredType);
	}
	public static <T> T getBeanSimple(Class<T> requiredType){
		if(requiredType.getName().equals("com.enumtest.demo.HashMapTest.demo.Food")){
			return (T)new Food();
		}else{
			return (T)new Water();
		}

	}
	
}
