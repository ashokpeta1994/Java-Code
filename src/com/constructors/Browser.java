package com.constructors;

import java.util.ArrayList;
import java.util.List;

public class Browser {
	
	String browserName;
	String vendorName;
	double currentVersion;
	List<String> pl=new ArrayList<String>();
	
	public Browser(String browserName, String vendorName, double currentVersion, List<String> pl) {
		super();
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.pl = pl;
	}
	public String getBrowserName() {
		return browserName;
	}
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public double getCurrentVersion() {
		return currentVersion;
	}
	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}
	public List<String> getPl() {
		return pl;
	}
	public void setPl(List<String> pl) {
		this.pl = pl;
	}
	
	

}
