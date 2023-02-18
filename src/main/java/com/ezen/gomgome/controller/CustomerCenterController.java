package com.ezen.gomgome.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ezen.gomgome.service.admin.AdminService;
import com.ezen.gomgome.service.customercenter.CustomerCenterService;

@RestController
@RequestMapping("/customercenter")
public class CustomerCenterController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CustomerCenterService customerService;
	
	
	
	@GetMapping("/getNoticeList")
	public ModelAndView getNoticeList() {
		return null;
	}
	
	
	@GetMapping("/faqlist")
	public ModelAndView faqlist() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("customercenter/cscenter_faq.html");
		return mv;
	}
	
	

	@GetMapping("/noticeList")
	public ModelAndView noticeList() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("customercenter/cscenter_noticelist.html");
		return mv;
	}
		
	
	@GetMapping("/notice")
	public ModelAndView notice() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("customercenter/cscenter_notice.html");
		return mv;
	}
	
	
	
	@GetMapping("/inquirylist")
	public ModelAndView inquirylist() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("customercenter/cscenter_inquirylist.html");
		return mv;
	}
	
	@GetMapping("/inquiryreg")
	public ModelAndView inquiryreg() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("customercenter/cscenter_inquiry_reg.html");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("/getNotice")
	public ModelAndView getNotice() {
		return null;
	}
	
	@GetMapping("/getFaq")
	public ModelAndView getFaq() {
		return null;
	}
	
	@GetMapping("/getQuestionList")
	public ModelAndView getQuestionList() {
		return null;
	}
	
	@GetMapping("/getQuestion")
	public ModelAndView getQuestion() {
		return null;
	}
	
	@PostMapping("/insertQuestionView")
	public String insertQuestionView() {
		return null;
	}
	
	@PostMapping("/insertQuestion")
	public ResponseEntity<?> insertQuestion() {
		return null;
	}
	
	@Transactional
	@PutMapping("/updateQuestion")
	public ResponseEntity<?> updateQuestion() {
		return null;
	}
	
	@DeleteMapping("/deleteQuestion")
	public ResponseEntity<?> deleteQuestion() {
		return null;
	}
}
