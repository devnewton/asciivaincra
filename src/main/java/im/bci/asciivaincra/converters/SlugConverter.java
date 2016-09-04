package im.bci.asciivaincra.converters;

import im.bci.asciivaincra.frontend.ConversionType;
import net.sf.junidecode.Junidecode;
import org.springframework.stereotype.Component;

/**
 *
 * @author devnewton
 */
@Component
public class SlugConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_TXT;
    }

    @Override
    public String convert(String text) {
        return Junidecode.unidecode(text);
    }

}
