package im.bci.asciivaincra.converters;

import im.bci.asciivaincra.frontend.ConversionType;
import org.springframework.stereotype.Component;
import org.unbescape.json.JsonEscape;
import org.unbescape.json.JsonEscapeLevel;
import org.unbescape.json.JsonEscapeType;

/**
 *
 * @author devnewton
 */
@Component
public class JsonConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_JSON;
    }

    @Override
    public String convert(String text) {
        return JsonEscape.escapeJson(text, JsonEscapeType.UHEXA, JsonEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
    }

}
