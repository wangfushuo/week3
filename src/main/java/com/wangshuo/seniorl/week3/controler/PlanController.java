package com.wangshuo.seniorl.week3.controler;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.wangshuo.seniorl.week3.domain.Plan;
import com.wangshuo.seniorl.week3.service.DepartmentService;
import com.wangshuo.seniorl.week3.service.PlanService;
import com.wangshuo.seniorl.week3.util.PageUtil;

@Controller
public class PlanController {

	@Resource
	private PlanService planService;
	
	
	@Resource
	private DepartmentService departmentService; 
	@RequestMapping("selects")
	public String selects(@RequestParam(defaultValue = "")String name,@RequestParam(defaultValue = "1")Integer page,
			               @RequestParam(defaultValue = "5")Integer pageSize,Model model) {
						
		PageInfo<Plan> info = planService.selects(name, page, pageSize);
		String string = PageUtil.page(page, page, "/selects?name="+name, pageSize);
		model.addAttribute("name", name);
		model.addAttribute("plans", info.getList());
		model.addAttribute("page", page);

		return "plans";
		
	}
	
	
	@GetMapping("update")
	public String update(Integer id,Model model) {
		
		Plan plan = planService.selectByPrimaryKey(id);
		model.addAttribute("plan", plan);
		return "update";
		
	}
	@PostMapping("update")
	public boolean update(Plan record) {
		return planService.updateByPrimaryKey(record)>0;
		
	}
	@ResponseBody
	@RequestMapping("delete")
	public Boolean delete(Integer id) {
		
		return planService.deleteByPrimaryKey(id)>0;
		
	}
	
	@ResponseBody
	@RequestMapping("select")
	public Plan select(Integer id) {
	
		return 	planService.selectByPrimaryKey(id);
		
	}
	
}
