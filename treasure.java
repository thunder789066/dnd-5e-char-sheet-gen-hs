import java.util.Random;

public class treasure
{
    public String PieceName;
    public int MoneyAmt;
    
    private int dice6() {
        Random roll = new Random();
        int r = roll.nextInt(6)+1;
        return r;
    }
    
    public void Randomize(){
        //roll dice only once
        MoneyAmt = dice6();
    }
}
