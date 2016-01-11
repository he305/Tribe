import java.util.ArrayList;

public class Tribe
{
    private ArrayList<Person> tribe;

    public Tribe()
    {
        tribe = new ArrayList<>(100);
        for (int i = 0; i < 10; i++)
        {
            tribe.add(new Person());
        }
    }
}
