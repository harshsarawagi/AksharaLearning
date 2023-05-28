package class11;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("text")
public class ReqResSupportPOJO {

	private String url;
	private String text;

	// Getter Methods
	public String getUrl() {
		return url;
	}
	public String getText() {
		return text;
	}

	// Setter Methods
	public void setUrl(String url) {
		this.url = url;
	}
	public void setText(String text) {
		this.text = text;
	}
}
