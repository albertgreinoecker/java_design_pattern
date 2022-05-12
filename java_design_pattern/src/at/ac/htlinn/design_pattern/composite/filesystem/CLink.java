package at.ac.htlinn.design_pattern.composite.filesystem;

import java.util.Date;


public class CLink implements FileSystemObject {

	private String name;
	private Date created;
	private String linkTo;
	
	
	
	public CLink(String name, String linkTo) {
		this.name = name;
		this.linkTo = linkTo;
		this.created = new Date();
	}



	@Override
	public void ls() {
		System.out.println(name + "-" + created + "--->" + linkTo);

	}

}
