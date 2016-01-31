package im.bci.a2html.converters;

import im.bci.a2html.frontend.ConversionType;
import org.springframework.stereotype.Component;
import org.unbescape.javascript.JavaScriptEscape;
import org.unbescape.javascript.JavaScriptEscapeLevel;
import org.unbescape.javascript.JavaScriptEscapeType;

/**
 *
 * @author devnewton
 */
@Component
public class JavascriptConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_JAVASCRIPT;
    }

    @Override
    public String convert(String text) {
        return JavaScriptEscape.escapeJavaScript(text, JavaScriptEscapeType.UHEXA, JavaScriptEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
    }

}
