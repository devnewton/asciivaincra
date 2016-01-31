package im.bci.asciivaincra.frontend;

import java.io.Serializable;

public class ConvertRQ implements Serializable {

    private static final long serialVersionUID = 1L;
    private String text;
    private ConversionType conversion = ConversionType.TO_HTML;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ConversionType getConversion() {
        return conversion;
    }

    public void setConversion(ConversionType conversion) {
        this.conversion = conversion;
    }

}
