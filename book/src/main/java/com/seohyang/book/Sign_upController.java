package com.seohyang.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sign_upController {
	
	@Autowired
	Sign_upDAO dao;
	
	@RequestMapping("insert.do")
	public String insert(Sign_upDTO sign_upDTO) {
		dao.insert(sign_upDTO);
		return "sign_upView";
	}
	@RequestMapping("select.do")
	public String select(Sign_upDTO sign_upDTO, Model model) /*여기서 만드는 것은 프로토 타입*/ {
		Sign_upDTO dto = dao.select(sign_upDTO);
		model.addAttribute("dto", dto);
		return "id_check";
	}
	
}
