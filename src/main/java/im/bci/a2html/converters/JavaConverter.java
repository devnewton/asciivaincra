package im.bci.a2html.converters;

import im.bci.a2html.frontend.ConversionType;
import org.springframework.stereotype.Component;
import org.unbescape.java.JavaEscape;
import org.unbescape.java.JavaEscapeLevel;

/**
 *
 * @author devnewton
 */
@Component
public class JavaConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_JAVA;
    }

    @Override
    public String convert(String text) {
        return JavaEscape.escapeJava(text, JavaEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
    }

}
