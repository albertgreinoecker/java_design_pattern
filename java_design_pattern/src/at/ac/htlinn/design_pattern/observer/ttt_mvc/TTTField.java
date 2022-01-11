package at.ac.htlinn.design_pattern.observer.ttt_mvc;

/**
 * @author albert
 * 0 1 2
 * 3 4 5
 * 6 7 8
 */
public class TTTField
{
	public enum CELL {EMPTY, X, O};
	
	CELL[] fields = new CELL[9];
	
	public TTTField()
	{
		init();
	}
	
	
	void init()
	{
		for (int i = 0; i < fields.length;i++)
		{
			fields[i] = CELL.EMPTY;
		}
	}
	
	public boolean full()
	{
		for (CELL c : fields)
		{
			if (c.equals(CELL.EMPTY))
			{
				return false;
			}
		}
		return true;
	}
	
	
	public boolean set(int pos, CELL c)
	{
		if (!fields[pos].equals(CELL.EMPTY))
		{
			return false;
		}
		fields[pos] = c;
		return true;
	}
	
	private String str(int i1, int i2, int i3)
	{
		return fields[i1].toString() + fields[i2].toString() + fields[i3].toString();
	}
	
	public boolean won()
	{
		String all = str(0,1,2) + "|" + str(3,4,5) + "|" + str(6,7,8) + "|" + 
			str(0,3,6) + "|" + str(1,4,7) + "|" + str(2,5,8) + "|" +
			str(0,4,8) + "|" + str(2,4,6);
		
		return all.contains("XXX") || all.contains("OOO");
	}
	
	
	
	
	
	
	
	
	
	
}
