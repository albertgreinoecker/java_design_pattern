package at.ac.htlinn.design_pattern.command.game_undo_redo;

import java.util.Stack;

public class CommandRecorder 
{
	private Stack<CommandInterface> undo = new Stack<CommandInterface>();
	private Stack<CommandInterface> redo = new Stack<CommandInterface>();
	
	public void ausfuehren(CommandInterface ci)
	{
		ci.ausfuehren();
		undo.push(ci);
	}
	
	public void undo()
	{
		CommandInterface ci = undo.pop();
		redo.push(ci);
		ci.rueckgaengig();	
	}
	
	public void redo()
	{
		CommandInterface ci = redo.pop();
		undo.push(ci);
		ci.ausfuehren();
	}
}