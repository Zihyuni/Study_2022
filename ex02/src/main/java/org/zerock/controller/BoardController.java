package org.zerock.controller;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {


    private BoardService service;
//
//    @GetMapping("/list")
//        public String list(Model model){
//        log.info("list에 접근했어요,,,");
//        model.addAttribute("list", service. getList());
//
//        System.out.println("리스트..접근가능하나요...");
//        return "/board/list";
//
//    }

    @GetMapping("/list")
    public void list(Criteria cri , Model model){
        log.info("list:::" + cri);
        model.addAttribute("list",service.getList(cri));
        model.addAttribute("pageMaker",new PageDTO(cri,123));
    }

    @PostMapping("/register")
    public String register(BoardVO board , RedirectAttributes rttr){
        log.info("register::::"+board);
        service.register(board);
        //rttr에 어튜리뷰트 합니다 "result"라는 이름으로 board.getBno를!!
        rttr.addFlashAttribute("result",board.getBno());
        return "redirect:/board/list";
        //리다이렉트 하겠습니다 board/list로

    }
    @GetMapping("/register")
    public String register(){
        return "/board/register";
    }

    @GetMapping({"/get","/modify"})
    public void get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model)
    {
        log.info("겟입니다!!!!! 겟매핑에 get이면서 수정입니다!!!");
        model.addAttribute("board",service.get(bno));
    }

    @PostMapping("/modify")
    public String modify(BoardVO board , RedirectAttributes rttr){
        log.info("modify:::"+board);

        if(service.modify(board)){
            rttr.addFlashAttribute("result","success");
        }
        return "redirect:/board/list";
    }

    @PostMapping("/remove")
    public String remove(@RequestParam("bno")Long bno, RedirectAttributes rttr ,@ModelAttribute("cri")
                         Criteria cri){
        log.info("삭제하겠씁니다...remove 들어옴"+bno);
        if (service.remove(bno)){
            rttr.addFlashAttribute("result","success");
        }
        rttr.addAttribute("pageNum",cri.getPageNum());
        rttr.addAttribute("amount", cri.getAmount());

        return "redirect:/board/list";
    }

}
