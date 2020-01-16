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
//		session.setAttribute("Session名称", "这是测试！");
////		System.out.println("这是啥"+session.getAttribute("Session名称"));
////		session.getAttribute("Session名称");
//		resp.sendRedirect(req.getContextPath()+"/NewFile.jsp");
		 ServletContext context=req.getServletContext();
		   
		   context.setAttribute("status", "有同学正在上课打盹");
		   
		   context.setAttribute("status", "清醒了。。。。。");
		   
		   context.removeAttribute("status");
		   
//		   try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		   System.out.println("请求到达。。。。");
//		   HttpSession session=req.getSession();
//		   
//		   session.setAttribute("uname", "admin");
//		   session.setAttribute("uname", "gly");
//		   session.removeAttribute("uname");
//		   resp.sendRedirect("one.jsp");
//		   
//		   System.out.println("响应结束。。。。。。");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
