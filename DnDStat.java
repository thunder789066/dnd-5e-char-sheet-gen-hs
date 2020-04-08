import java.util.Random;

public class DnDStat extends Stat
{
   public int Modifier(){
        if(1 == Score) {
            return -5;
        } else if(2 <= Score && Score <= 3){
            return -4;
        } else if(4 <= Score && Score <= 5){
            return -3;
        } else if(6 <= Score && Score <= 7){
            return -2;
        } else if(8 <= Score && Score <= 9){
            return -1;
        } else if(10 <= Score && Score <= 11){
            return 0;
        } else if(12 <= Score && Score <= 13){
            return 1;
        } else if(14 <= Score && Score <= 15){
            return 2;
        } else if(16 <= Score && Score <= 17){
            return 3;
        } else if(18 <= Score && Score <= 20){
            return 4;
        } else {
            return 0;
        }
    }
}
