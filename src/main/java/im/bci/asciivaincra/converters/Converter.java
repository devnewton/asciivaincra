package im.bci.asciivaincra.converters;

import im.bci.asciivaincra.frontend.ConversionType;

/**
 *
 * @author devnewton
 */
public interface Converter {
    ConversionType getType();
    
    String convert(String text);
}
