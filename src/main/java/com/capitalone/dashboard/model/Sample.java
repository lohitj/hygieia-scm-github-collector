package com.capitalone.dashboard.model;

public class Sample extends GitHubRepo{
	  private String title;
	  private String Sampledescr;
	  
	public String getSampledescr() {
		return Sampledescr;
	}
	public void setSampledescr(String sampledescr) {
		Sampledescr = sampledescr;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
