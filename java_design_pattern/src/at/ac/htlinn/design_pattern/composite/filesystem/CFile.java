package at.ac.htlinn.design_pattern.composite.filesystem;

import java.util.Date;

public class CFile implements FileSystemObject {

	private String name;
	private Date created;
	private int size;
			
	public CFile(String name, int size) {
		this.name = name;
		this.created = new Date();
		this.size = size;
	}

	@Override
	public void ls() {
		System.out.println(name + "-" + created + "-" + size);
	}
}
