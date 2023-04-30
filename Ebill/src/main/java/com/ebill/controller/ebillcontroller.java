package com.ebill.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ebill.dao.ebilldao;
import com.ebill.dao.imp.ebilldaoimp;
import com.ebill.entity.billentity;
import com.ebill.entity.billerentity;
import com.ebill.entity.staffentity;
import com.ebill.entity.studententity;
@Controller
public class ebillcontroller {
	   @RequestMapping("/login")
	   public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		System.out.println("User login attempted");
		try {
		if(request.getParameter("user").equals("admin"))
			{
			if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("admin")) 
			{
            mv.setViewName("adminpage");
			}
			else
			{
			mv.addObject("message", "Some problem occured during login, Please try after some time.");
			mv.setViewName("error");
			}
			}
		else if(request.getParameter("user").equals("student"))
		{
		ebilldao ebd=new ebilldaoimp();
        int rollno=Integer.parseInt(request.getParameter("username"));
        studententity status = ebd.getstudententity(rollno);
		if (request.getParameter("password").equals(status.getPass()))
		{
        mv.setViewName("viewbill");
		}
		else
		{
		mv.addObject("message", "Some problem occured during login, Please try after some time.");
		mv.setViewName("error");
		}
		}
		else if(request.getParameter("user").equals("staff"))
		{
		ebilldao ebd=new ebilldaoimp();
        int id=Integer.parseInt(request.getParameter("username"));
        staffentity status = ebd.getstaffentity(id);
		if (request.getParameter("password").equals(status.getPass()))
		{
        mv.setViewName("viewbill");
		}
		else
		{
		mv.addObject("message", "Some problem occured during login, Please try after some time.");
		mv.setViewName("error");
		}
		}
		else if(request.getParameter("user").equals("biller"))
		{
		ebilldao ebd=new ebilldaoimp();
        int id=Integer.parseInt(request.getParameter("username"));
        billerentity status = ebd.getbillerentity(id);
		if (request.getParameter("password").equals(status.getPass()))
		{
        mv.setViewName("biller");
		}
		else
		{
		mv.addObject("message", "Some problem occured during login, Please try after some time.");
		mv.setViewName("error");
		}
		}
		}
	    
			catch (Exception ex) {
			mv.addObject("message", "Some problem occured during login, Please try after some time.");
			
		}
		return mv;
	}
	
	@RequestMapping("/createstudent")
	public ModelAndView createstudent(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createstudent");
		return mv;
	}
	@RequestMapping("/createstaff")
	public ModelAndView createstaff(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createstaff");
		return mv;
	}
	@RequestMapping("/createbiller")
	public ModelAndView createbiller(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createbiller");
		return mv;
	}
	@RequestMapping("/savestudent")
	public ModelAndView savestudent(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
        ebilldao ebd=new ebilldaoimp();
        studententity se=new studententity();
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		se.setName(fname +" "+lname);
		se.setDept(request.getParameter("dept"));
	    long phone=Long.parseLong(request.getParameter("phone"));
	    se.setPhone(phone);
	    se.setEmail(request.getParameter("email"));
	    se.setPass(request.getParameter("password"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    se.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = ebd.savestudent(se);
		mv.addObject("status", status);
		mv.setViewName("adminpage");
		return mv;	
	}
	
	@RequestMapping("/savestaff")
	public ModelAndView savestaff(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
        ebilldao ebd=new ebilldaoimp();
        staffentity se=new staffentity();
		int id=Integer.parseInt(request.getParameter("rollno"));
		se.setId(id);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		se.setName(fname +" "+lname);
		se.setDept(request.getParameter("dept"));
	    long phone=Long.parseLong(request.getParameter("phone"));
	    se.setPhone(phone);
	    se.setEmail(request.getParameter("email"));
	    se.setPass(request.getParameter("password"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    se.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = ebd.savestaff(se);
		mv.addObject("status", status);
		mv.setViewName("adminpage");
		return mv;	
	}
	
	@RequestMapping("/savebiller")
	public ModelAndView savebiller(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
        ebilldao ebd=new ebilldaoimp();
        billerentity be=new billerentity();
		int id=Integer.parseInt(request.getParameter("rollno"));
		be.setId(id);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		be.setName(fname +" "+lname);
		be.setDept(request.getParameter("dept"));
	    long phone=Long.parseLong(request.getParameter("phone"));
	    be.setPhone(phone);
	    be.setEmail(request.getParameter("email"));
	    be.setPass(request.getParameter("password"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    be.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = ebd.savebiller(be);
		mv.addObject("status", status);
		mv.setViewName("adminpage");
		return mv;	
	}
	@RequestMapping("/createbill")
	public ModelAndView createbill(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createbill");
		return mv;
	}
	@RequestMapping("/viewbill")
	public ModelAndView viewbill(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewbill");
		return mv;
	}
	@RequestMapping("/savebill")
	public ModelAndView savebill(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
        ebilldao ebd=new ebilldaoimp();
        billentity se=new billentity();
        int id=Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(id);
		long totalfees=10000;
		se.setTotalfees(totalfees);
	    long paidfees=Long.parseLong(request.getParameter("paidfees"));
	    se.setPaidfees(paidfees);
	    String status = ebd.savebillentity(se);
		mv.addObject("status", status);
		mv.setViewName("biller");
		return mv;	
	}
	@RequestMapping("/seebill")
	public ModelAndView seebill(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		ebilldao ebd=new ebilldaoimp();
		int id=Integer.parseInt(request.getParameter("rollno"));
        billentity status = ebd.getbillentity(id);
        mv.addObject("billno",status.getId());
        mv.addObject("rollno",status.getRollno());
        mv.addObject("totalfees",status.getTotalfees());
        mv.addObject("paidfees",status.getPaidfees());
		mv.setViewName("seebill");
		return mv;
	}
}
