package com.woniuxy.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = req.getSession();
//		session.setAttribute("Session����", "���ǲ��ԣ�");
////		System.out.println("����ɶ"+session.getAttribute("Session����"));
////		session.getAttribute("Session����");
//		resp.sendRedirect(req.getContextPath()+"/NewFile.jsp");
		 ServletContext context=req.getServletContext();
		   
		   context.setAttribute("status", "��ͬѧ�����Ͽδ���");
		   
		   context.setAttribute("status", "�����ˡ���������");
		   
		   context.removeAttribute("status");
		   
//		   try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		   System.out.println("���󵽴������");
//		   HttpSession session=req.getSession();
//		   
//		   session.setAttribute("uname", "admin");
//		   session.setAttribute("uname", "gly");
//		   session.removeAttribute("uname");
//		   resp.sendRedirect("one.jsp");
//		   
//		   System.out.println("��Ӧ����������������");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
