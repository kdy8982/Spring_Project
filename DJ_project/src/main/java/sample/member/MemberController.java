package sample.member;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sample.domain.Member;
import sample.member.service.MemberService;

@Controller
@RequestMapping("/member")
@SessionAttributes("member")
public class MemberController {
	
	@Autowired
	 MemberService memberService;
	
	@RequestMapping("/list")
	public void list(Model model){
		System.out.println("list is??");
		model.addAttribute("list", memberService.list());
	}
	
	@RequestMapping("/form")
	public void form(Model model){
		model.addAttribute("member", new Member());
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String formSubmit(@Valid Member member, BindingResult result){
		if(result.hasErrors()) {
			return "member/form";
		}
		memberService.add(member);
		return "redirect:/member/list";
	}

    // id 로 member 를 조회하는 handler
	@RequestMapping("/{id}")
    public String view(@PathVariable String id, Model model) {
        model.addAttribute("member", memberService.get(id));
        return "member/view";
    }

    @RequestMapping("/update/{id}")
    public String updateForm(@PathVariable String id, Model model) {
        model.addAttribute("member", memberService.get(id));
        return "member/update";
    }

    @RequestMapping(value="/update", method = RequestMethod.POST)
    public String updateSubmit(@Valid Member member, BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "member/update";
        }
        memberService.update(member);
        status.setComplete();
        return "redirect:/member/list";
    }

    @RequestMapping("/delete/{id}")
    public String deleteForm(@PathVariable String id, Model model) {
        memberService.delete(id);
        return "redirect:/member/list";
    }

	
	
}
