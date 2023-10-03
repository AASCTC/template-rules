package com.aasctc.template_rules;

/**
 * A result extracted from a Lucene document search.
 */
public class ResultSet {

	private String filename;
	private String content;
	private String truncatedContent; //  like content but only first 200 characters are shown.
	
	public ResultSet() {
		
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
		String tempContent = this.content.replaceAll("\\s*templaterules-keyword=\"(wd:Q\\d+)?\"", "");
		if (tempContent.length() > 800) {
			this.truncatedContent = tempContent.substring(0, 800) + "...";
		}
		else {
			this.truncatedContent = tempContent;
		}
		
	}

	public String getTruncatedContent() {
		return truncatedContent;
	}

	public void setTruncatedContent(String truncatedContent) {
		// No-op
	}
}
