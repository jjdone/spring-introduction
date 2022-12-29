package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /**
     * 생성자 주입이라고 한다.
     */
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
