package im.bci.asciivaincra.converters;

import im.bci.asciivaincra.frontend.ConversionType;
import org.springframework.stereotype.Component;
import org.unbescape.css.CssEscape;
import org.unbescape.css.CssStringEscapeLevel;
import org.unbescape.css.CssStringEscapeType;

/**
 *
 * @author devnewton
 */
@Component
public class CssConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_CSS;
    }

    @Override
    public String convert(String text) {
        return CssEscape.escapeCssString(text, CssStringEscapeType.COMPACT_HEXA, CssStringEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
    }

}
