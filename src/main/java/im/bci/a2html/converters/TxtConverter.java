package im.bci.a2html.converters;

import im.bci.a2html.frontend.ConversionType;
import net.sf.junidecode.Junidecode;
import org.springframework.stereotype.Component;

/**
 *
 * @author devnewton
 */
@Component
public class TxtConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_TXT;
    }

    @Override
    public String convert(String text) {
        return Junidecode.unidecode(text);
    }

}
