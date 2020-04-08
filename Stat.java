import java.util.Random;

public abstract class Stat
{
    // instance variables - replace the example below with your own
    public String StatName;
    public int Score;
    
    private int dice6() {
        Random roll = new Random();
        int r = roll.nextInt(6)+1;
        return r;
    }
    
    public void Randomize(){
        //roll dice three times
        Score = dice6() + dice6() + dice6();
    }
}
