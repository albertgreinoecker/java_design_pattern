package at.ac.htlinn.design_pattern.factory.kitchen;
import java.util.List;

public interface Meal 
{
	void prepare();
	List<Ingredient> ingredients();
}
