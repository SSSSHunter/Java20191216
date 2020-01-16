package com.woniuxy.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("正在向ID为"+se.getSession().getId()+"session对象中添加一个属性"+se.getName()+":"+se.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("正在向ID为"+se.getSession().getId()+"session对象中移除一个属性"+se.getName()+":"+se.getValue());

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("正在向ID为"+se.getSession().getId()+"session对象中修改一个属性"+se.getName()+":"+se.getValue());
	}

}
