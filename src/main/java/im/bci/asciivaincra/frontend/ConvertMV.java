package im.bci.asciivaincra.frontend;

import java.io.Serializable;

public class ConvertMV implements Serializable{

    private static final long serialVersionUID = 1L;

    private String convertedText;

    public String getConvertedText() {
        return convertedText;
    }

    public void setConvertedText(String convertedText) {
        this.convertedText = convertedText;
    }
}
