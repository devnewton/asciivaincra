package im.bci.a2html.converters;

import im.bci.a2html.frontend.ConversionType;

/**
 *
 * @author devnewton
 */
public interface Converter {
    ConversionType getType();
    
    String convert(String text);
}
