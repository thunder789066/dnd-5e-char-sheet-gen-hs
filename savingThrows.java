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
            if(name == "Strength"){
                Strength = stats.get(i).Modifier();
                if(firstchoice == "Strength"){
                    Strength += 2;
                }
                if(secondchoice == "Strength"){
                    Strength += 2;
                }
                break;
            }
        }
        //setup Dexterity
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name == "Dexterity"){
                Dexterity = stats.get(i).Modifier();
                if(firstchoice == "Dexterity"){
                    Dexterity += 2;
                }
                if(secondchoice == "Dexterity"){
                    Dexterity += 2;
                }
                break;
            }
        }
        //setup Constitution
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name == "Constitution"){
                Constitution = stats.get(i).Modifier();
                if(firstchoice == "Constitution"){
                    Constitution += 2;
                }
                if(secondchoice == "Constitution"){
                    Constitution += 2;
                }
                break;
            }
        }
        //setup Intelligence
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name == "Intelligence"){
                Intelligence = stats.get(i).Modifier();
                if(firstchoice == "Intelligence"){
                    Intelligence += 2;
                }
                if(secondchoice == "Intelligence"){
                    Intelligence += 2;
                }
                break;
            }
        }
        //setup Wisdom
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name == "Wisdom"){
                Wisdom = stats.get(i).Modifier();
                if(firstchoice == "Wisdom"){
                    Wisdom += 2;
                }
                if(secondchoice == "Wisdom"){
                    Wisdom += 2;
                }
                break;
            }
        }
        //setup Charisma
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name == "Charisma"){
                Charisma = stats.get(i).Modifier();
                if(firstchoice == "Charisma"){
                    Charisma += 2;
                }
                if(secondchoice == "Charisma"){
                    Charisma += 2;
                }
                break;
            }
        }
    }
}
