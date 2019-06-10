package com.app.runner;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.data")
public class AppRunner  implements CommandLineRunner{
		
	private int eid;
	private String ename;
	private double esal;
	//private String[] prjs;
	//private Set<String> prjs;
	private List<String> prjs;
	private Map<String,String> dept;
	//private Properties dept;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public List<String> getPrjs() {
		return prjs;
	}
	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}
	public Map<String, String> getDept() {
		return dept;
	}
	public void setDept(Map<String, String> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "AppRunner [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", prjs=" + prjs + ", dept=" + dept
				+ "]";
	}
	
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	
	
	



	

	
}

	