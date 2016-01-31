package im.bci.a2html.converters;

import im.bci.a2html.frontend.ConversionType;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.safety.Whitelist;
import org.springframework.stereotype.Component;

/**
 *
 * @author devnewton
 */
@Component
public class HtmlConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_HTML;
    }

    @Override
    public String convert(String text) {
        String cleaned = Jsoup.clean(text, "", Whitelist.basicWithImages(), new Document.OutputSettings().prettyPrint(false).escapeMode(Entities.EscapeMode.extended).charset("ASCII"));
        return cleaned;
    }

}
