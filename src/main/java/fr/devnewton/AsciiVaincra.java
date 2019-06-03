package fr.devnewton;

import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;
import org.unbescape.css.CssEscape;
import org.unbescape.css.CssStringEscapeLevel;
import org.unbescape.css.CssStringEscapeType;
import org.unbescape.html.HtmlEscape;
import org.unbescape.java.JavaEscape;
import org.unbescape.java.JavaEscapeLevel;
import org.unbescape.javascript.JavaScriptEscape;
import org.unbescape.javascript.JavaScriptEscapeLevel;
import org.unbescape.javascript.JavaScriptEscapeType;
import org.unbescape.json.JsonEscape;
import org.unbescape.json.JsonEscapeLevel;
import org.unbescape.json.JsonEscapeType;
import org.unbescape.properties.PropertiesEscape;
import org.unbescape.properties.PropertiesValueEscapeLevel;

import net.gcardone.junidecode.Junidecode;

@BindTemplate("templates/asciivaincra.html")
public class AsciiVaincra extends ApplicationTemplate {
	private String source = "";
	private String converted = "";
	private String conversion = "text";

	public static void main(String[] args) {
		AsciiVaincra client = new AsciiVaincra();
		client.bind("application-content");
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
		convert();
	}

	public String getConverted() {
		return converted;
	}

	public void setConverted(String converted) {
		this.converted = converted;
	}

	public String getConversion() {
		return conversion;
	}

	public void setConversion(String conversion) {
		this.conversion = conversion;
		convert();
	}

	private void convert() {
		switch (conversion) {
		case "properties":
			this.converted = PropertiesEscape.escapePropertiesValue(source,
					PropertiesValueEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
			break;
		case "json":
			this.converted = JsonEscape.escapeJson(source, JsonEscapeType.UHEXA,
					JsonEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
			break;
		case "javascript":
			this.converted = JavaScriptEscape.escapeJavaScript(source, JavaScriptEscapeType.UHEXA,
					JavaScriptEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
			break;
		case "java":
			this.converted = JavaEscape.escapeJava(source, JavaEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
			break;
		case "html":
			this.converted = HtmlEscape.escapeHtml5(source);
			break;
		case "css":
			this.converted = CssEscape.escapeCssString(source, CssStringEscapeType.COMPACT_HEXA,
					CssStringEscapeLevel.LEVEL_2_ALL_NON_ASCII_PLUS_BASIC_ESCAPE_SET);
			break;
		case "text":
		default:
			this.converted = Junidecode.unidecode(source);
		}
	}
}
