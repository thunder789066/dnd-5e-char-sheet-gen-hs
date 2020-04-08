import java.util.*;

public class savingThrows implements SavingThrowsInterface
{
    public int Strength;
    public int Dexterity;
    public int Constitution;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    
    public static String[] ListOfST = { "Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma" };
    public String firstchoice;
    public String secondchoice;
    
    public void setupSavingThrows(List<DnDStat> stats){
        //setup Strength
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Strength")){
                Strength = stats.get(i).Modifier();
                if(firstchoice.equals("Strength")){
                    Strength += 2;
                }
                if(secondchoice.equals("Strength")){
                    Strength += 2;
                }
                break;
            }
        }
        //setup Dexterity
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Dexterity")){
                Dexterity = stats.get(i).Modifier();
                if(firstchoice.equals("Dexterity")){
                    Dexterity += 2;
                }
                if(secondchoice.equals("Dexterity")){
                    Dexterity += 2;
                }
                break;
            }
        }
        //setup Constitution
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Constitution")){
                Constitution = stats.get(i).Modifier();
                if(firstchoice.equals("Constitution")){
                    Constitution += 2;
                }
                if(secondchoice.equals("Constitution")){
                    Constitution += 2;
                }
                break;
            }
        }
        //setup Intelligence
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Intelligence")){
                Intelligence = stats.get(i).Modifier();
                if(firstchoice.equals("Intelligence")){
                    Intelligence += 2;
                }
                if(secondchoice.equals("Intelligence")){
                    Intelligence += 2;
                }
                break;
            }
        }
        //setup Wisdom
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Wisdom")){
                Wisdom = stats.get(i).Modifier();
                if(firstchoice.equals("Wisdom")){
                    Wisdom += 2;
                }
                if(secondchoice.equals("Wisdom")){
                    Wisdom += 2;
                }
                break;
            }
        }
        //setup Charisma
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Charisma")){
                Charisma = stats.get(i).Modifier();
                if(firstchoice.equals("Charisma")){
                    Charisma += 2;
                }
                if(secondchoice.equals("Charisma")){
                    Charisma += 2;
                }
                break;
            }
        }
    }
}
