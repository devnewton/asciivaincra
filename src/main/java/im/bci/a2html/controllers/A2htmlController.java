package im.bci.a2html.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class A2htmlController {

    @RequestMapping("")
    public String index(Model model) {
        return "index";
    }
}
