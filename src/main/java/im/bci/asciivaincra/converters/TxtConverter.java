package im.bci.asciivaincra.converters;

import im.bci.asciivaincra.frontend.ConversionType;
import org.springframework.stereotype.Component;

import com.github.slugify.Slugify;

/**
 *
 * @author devnewton
 */
@Component
public class TxtConverter implements Converter {

    @Override
    public ConversionType getType() {
        return ConversionType.TO_SLUG;
    }

    @Override
    public String convert(String text) {
    	Slugify slugify = new Slugify();
    	return slugify.slugify(text);
    }

}
