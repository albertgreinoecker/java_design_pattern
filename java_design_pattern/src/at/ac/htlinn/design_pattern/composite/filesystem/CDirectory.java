package at.ac.htlinn.design_pattern.composite.filesystem;

import java.util.ArrayList;
import java.util.Date;


public class CDirectory implements FileSystemObject {

	private String name;
	private Date created;
	private ArrayList<FileSystemObject> fsos = new ArrayList<FileSystemObject>();
	
	public CDirectory(String name) {
		this.name = name;
		this.created = new Date();
	}

	public void add(FileSystemObject fso)
	{
		fsos.add(fso);
	}

	@Override
	public void ls() {
		System.out.println("DIR:" + name + "-" + created);
		for (FileSystemObject fso : fsos)
		{
			fso.ls();
		}
	}
}
