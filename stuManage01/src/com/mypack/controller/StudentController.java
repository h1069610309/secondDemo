package com.mypack.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.Student;
import com.mypack.service.StudentServiceIF;


@RequestMapping("/student")
@Controller
public class StudentController {
	
	//@Autowired Ĭ�ϰ�����װ��  @Resource Ĭ�ϰ�����װ��
	@Autowired
	StudentServiceIF studentService;
	
	
	

	public StudentServiceIF getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentServiceIF studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/listall")
	public String listAllStu(Model model){
		
		List<Student> stulst=studentService.listAllStu();
		model.addAttribute("lst", stulst);
		return "list";
	}
	
	

}
