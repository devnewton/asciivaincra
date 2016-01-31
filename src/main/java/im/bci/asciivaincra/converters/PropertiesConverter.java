package im.bci.asciivaincra.converters;

import im.bci.asciivaincra.frontend.ConversionType;
import org.springframework.stereotype.Component;
import org.unbescape.properties.PropertiesEscape;
import org.unbescape.properties.PropertiesValueEscapeLevel;

/**
 *
 * @author devnewton
 */
@Component
public class PropertiesConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_PROPERTIES;
    }

    @Override
    public String convert(String text) {
        return PropertiesEscape.escapePropertiesValue(text, PropertiesValueEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
    }

}
