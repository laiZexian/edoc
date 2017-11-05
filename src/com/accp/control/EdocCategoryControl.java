package com.accp.control;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.EdocCategoryBiz;
import com.accp.biz.EdocEntryBiz;
import com.accp.entity.Edoc_category;
import com.accp.entity.Edoc_entry;

@Controller
@RequestMapping("/cate")
public class EdocCategoryControl {
	@Resource
	private EdocEntryBiz edocEntryBiz =null;
	
	@Resource
	private EdocCategoryBiz edocCategoryBiz =null;
	
	@RequestMapping("/list")
	public String showEntury(Edoc_entry e,Model m){
		List<Edoc_category>list =edocCategoryBiz.queryEdocCategorys();
		m.addAttribute("cateList", list);
		m.addAttribute("queryCateId", e.getCategoryId());
		List<Edoc_entry> list2 =edocEntryBiz.queryEdocEntrys(e);
		m.addAttribute("entryList", list2);
		return "index";
	}
	@RequestMapping("/del/{id}")
	public String del(@PathVariable int id){
		Edoc_entry e =new Edoc_entry();
		e.setId(id);
		edocEntryBiz.deleteEdocEntry(e);
		return "redirect:/cate/list";
	}
	@RequestMapping("/into")
	public String into(int cateId,Model m){
		m.addAttribute("cateId",cateId);
		return "editor";
	}
	@RequestMapping("/add")
	public String add(Edoc_entry e,Model m){
		if(edocEntryBiz.addEdocEntry(e)){
			return "redirect:/cate/list";
		}
		return "editor";
	}
	@RequestMapping("/one")
	public String getOne(int id,Model m){
		Edoc_entry e =new Edoc_entry();
		e.setId(id);
		Edoc_entry entry=edocEntryBiz.queryEdocEntry(e);
		m.addAttribute("entry", entry);
		return "editor2";
	}
	
	@RequestMapping("/update")
	public String update(Edoc_entry e){
		if (edocEntryBiz.updateEdocEntry(e)) {
			return "redirect:/cate/list";
		} 
		return "editor2";
	}
	
	

}
