package test_animals;
public class Mamma implements animal
{
    int legs;
    String FavFood;

    public Mamma(String fv_food)
    {
        FavFood = fv_food;
        
    }

    
    public void eat()
    {
        
    }
   public void travel()
   {
       
   }
   public int get_NoOfLegs(int leg )
   {
       return leg;
   }

    public String FavFoo(String fv_food)
    {
        if(fv_food =="leave"|| fv_food =="stems"||fv_food ==" roots"||fv_food ==" nut"  )
            return fv_food;   
        return null;
    }
}
