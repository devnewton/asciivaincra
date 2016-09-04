package im.bci.asciivaincra.controllers;

import im.bci.asciivaincra.converters.Converter;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import im.bci.asciivaincra.frontend.ConvertMV;
import im.bci.asciivaincra.frontend.ConvertRQ;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/ajax")
public class AjaxController {

    @Autowired
    private Converter[] converters;

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public ConvertMV convert(ConvertRQ rq, Model model) {
        ConvertMV mv = new ConvertMV();
        for (Converter converter : converters) {
            if (rq.getConversion() == converter.getType()) {
                mv.setConvertedText(converter.convert(rq.getText()));
                break;
            }
        }
        return mv;
    }

}
