package com.woniuxy.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("������IDΪ"+se.getSession().getId()+"session���������һ������"+se.getName()+":"+se.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("������IDΪ"+se.getSession().getId()+"session�������Ƴ�һ������"+se.getName()+":"+se.getValue());

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		System.out.println("������IDΪ"+se.getSession().getId()+"session�������޸�һ������"+se.getName()+":"+se.getValue());
	}

}
