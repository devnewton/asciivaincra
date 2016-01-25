package im.bci.a2html.controllers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.safety.Whitelist;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import im.bci.a2html.frontend.ConvertMV;
import im.bci.a2html.frontend.ConvertRQ;

@RestController
@RequestMapping("/ajax")
public class A2htmlAjaxController {

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public ConvertMV convert(ConvertRQ rq, Model model) {
        ConvertMV mv = new ConvertMV();
        String cleaned = Jsoup.clean(rq.getText(), "", Whitelist.basic(), new OutputSettings().prettyPrint(false).escapeMode(EscapeMode.extended).charset("ASCII"));
        mv.setConvertedText(cleaned);
        return mv;
    }

}
