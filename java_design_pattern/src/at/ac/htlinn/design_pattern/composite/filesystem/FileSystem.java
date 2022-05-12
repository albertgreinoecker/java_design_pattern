package at.ac.htlinn.design_pattern.composite.filesystem;


public class FileSystem {

	public static void main(String[] args) {
		CFile f1 = new CFile("info.txt", 500);
		CFile f2 = new CFile("log.txt", 100);
		CLink l1 = new CLink("info", "info.txt");
		CLink l2 = new CLink("log", "log.txt");
		
		CDirectory d1 = new CDirectory("texts");
		d1.add(f1);
		d1.add(f2);
		d1.add(l1);
		d1.add(l2);
		
		CDirectory d2 = new CDirectory("images");
		d2.add(d1);
		d2.ls();
	}

}
