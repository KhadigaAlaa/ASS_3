package assim_3;
public class Ball implements Tossable
{
protected String brandName;

    public Ball(String Brand_name)
    {
        brandName = Brand_name;
    }
    
    public void SetBand_name(String Brand_name)
    {
        brandName=Brand_name;
    }
    
    public String getBand_name()
    {
        return brandName;
    }
    public void bounce()
    {
        
    }
    
@Override
    public void toss()
    {
        
    }
}
