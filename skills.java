import java.util.*;

public class skills implements SkillsInterface
{
    public int Acrobatics;       // Dex 1
    public int AnimalHandling;    // Wis 2
    public int Arcana;             // Int 3
    public int Athletics;            // Str 4
    public int Deception;           // Cha 5
    public int History;            // Int 6
    public int Insight;           // Wis 7
    public int Intimidation;        // Cha 8
    public int Investigation;      // Int 9
    public int Medicine;          // Wis 10
    public int Nature;             // Int 11
    public int Perception;          // Cha 12
    public int Performance;         // Cha 13
    public int Persuasion;        // Wis 14
    public int Religion;           // Int 15
    public int SleightOfHand;    // Dex 16
    public int Stealth;          // Dex 17
    public int Survival;          // Wis 18
    
    public static String[] ListOfSkills = { "Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", "History", "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance", "Persuasion", "Religion", "Sleight Of Hand", "Stealth", "Survival" };
    public String skillset1;
    public String skillset2;
    public String skillset3;
    public String skillset4;
    
    public void setupSkills(List<DnDStat> stats){
        // setup Acrobatics
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Dexterity")){
                Acrobatics = stats.get(i).Modifier();
                if(skillset1 == "Acrobatics"){
                    Acrobatics += 2;
                }
                if(skillset2 == "Acrobatics"){
                    Acrobatics += 2;
                }
                if(skillset3 == "Acrobatics"){
                    Acrobatics += 2;
                }
                if(skillset4 == "Acrobatics"){
                    Acrobatics += 2;
                }
                break;
            }
        }
        // setup Animal Handling
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Wisdom")){
                AnimalHandling = stats.get(i).Modifier();
                if(skillset1 == "Animal Handling"){
                    AnimalHandling += 2;
                }
                if(skillset2 == "Animal Handling"){
                    AnimalHandling += 2;
                }
                if(skillset3 == "Animal Handling"){
                    AnimalHandling += 2;
                }
                if(skillset4 == "Animal Handling"){
                    AnimalHandling += 2;
                }
                break;
            }
        }
        // setup Arcana
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Intelligence")){
                Arcana = stats.get(i).Modifier();
                if(skillset1 == "Arcana"){
                    Arcana += 2;
                }
                if(skillset2 == "Arcana"){
                    Arcana += 2;
                }
                if(skillset3 == "Arcana"){
                    Arcana += 2;
                }
                if(skillset4 == "Arcana"){
                    Arcana += 2;
                }
                break;
            }
        }
         // setup Athletics
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Strength")){
                Athletics = stats.get(i).Modifier();
                if(skillset1 == "Athletics"){
                    Athletics += 2;
                }
                if(skillset2 == "Athletics"){
                    Athletics += 2;
                }
                if(skillset3 == "Athletics"){
                    Athletics += 2;
                }
                if(skillset4 == "Athletics"){
                    Athletics += 2;
                }
                break;
            }
        }
         // setup Deception
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Charisma")){
                Deception = stats.get(i).Modifier();
                if(skillset1 == "Deception"){
                    Deception += 2;
                }
                if(skillset2 == "Deception"){
                    Deception += 2;
                }
                if(skillset3 == "Deception"){
                    Deception += 2;
                }
                if(skillset4 == "Deception"){
                    Deception += 2;
                }
                break;
            }
        }
         // setup History
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Intelligence")){
                History = stats.get(i).Modifier();
                if(skillset1 == "History"){
                    History += 2;
                }
                if(skillset2 == "History"){
                    History += 2;
                }
                if(skillset3 == "History"){
                    History += 2;
                }
                if(skillset4 == "History"){
                    History += 2;
                }
                break;
            }
        }
         // setup Insight
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Wisdom")){
                Insight = stats.get(i).Modifier();
                if(skillset1 == "Insight"){
                    Insight += 2;
                }
                if(skillset2 == "Insight"){
                    Insight += 2;
                }
                if(skillset3 == "Insight"){
                    Insight += 2;
                }
                if(skillset4 == "Insight"){
                    Insight += 2;
                }
                break;
            }
        }
         // setup Intimidation
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Charisma")){
                Intimidation = stats.get(i).Modifier();
                if(skillset1 == "Intimidation"){
                    Intimidation += 2;
                }
                if(skillset2 == "Intimidation"){
                    Intimidation += 2;
                }
                if(skillset3 == "Intimidation"){
                    Intimidation += 2;
                }
                if(skillset4 == "Intimidation"){
                    Intimidation += 2;
                }
                break;
            }
        }
         // setup Investigation
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Intelligence")){
                Investigation = stats.get(i).Modifier();
                if(skillset1 == "Investigation"){
                    Investigation += 2;
                }
                if(skillset2 == "Investigation"){
                    Investigation += 2;
                }
                if(skillset3 == "Investigation"){
                    Investigation += 2;
                }
                if(skillset4 == "Investigation"){
                    Investigation += 2;
                }
                break;
            }
        }
         // setup Medicine
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Wisdom")){
                Medicine = stats.get(i).Modifier();
                if(skillset1 == "Medicine"){
                    Medicine += 2;
                }
                if(skillset2 == "Medicine"){
                    Medicine += 2;
                }
                if(skillset3 == "Medicine"){
                    Medicine += 2;
                }
                if(skillset4 == "Medicine"){
                    Medicine += 2;
                }
                break;
            }
        }
         // setup Nature
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Intelligence")){
                Nature = stats.get(i).Modifier();
                if(skillset1 == "Nature"){
                    Nature += 2;
                }
                if(skillset2 == "Nature"){
                    Nature += 2;
                }
                if(skillset3 == "Nature"){
                    Nature += 2;
                }
                if(skillset4 == "Nature"){
                    Nature += 2;
                }
                break;
            }
        }
         // setup Perception
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Wisdom")){
                Perception = stats.get(i).Modifier();
                if(skillset1 == "Perception"){
                    Perception += 2;
                }
                if(skillset2 == "Perception"){
                    Perception += 2;
                }
                if(skillset3 == "Perception"){
                    Perception += 2;
                }
                if(skillset4 == "Perception"){
                    Perception += 2;
                }
                break;
            }
        }
         // setup Performance
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Charisma")){
                Performance = stats.get(i).Modifier();
                if(skillset1 == "Performance"){
                    Performance += 2;
                }
                if(skillset2 == "Performance"){
                    Performance += 2;
                }
                if(skillset3 == "Performance"){
                    Performance += 2;
                }
                if(skillset4 == "Performance"){
                    Performance += 2;
                }
                break;
            }
        }
         // setup Persuasion
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Charisma")){
                Persuasion = stats.get(i).Modifier();
                if(skillset1 == "Persuasion"){
                    Persuasion += 2;
                }
                if(skillset2 == "Persuasion"){
                    Persuasion += 2;
                }
                if(skillset3 == "Persuasion"){
                    Persuasion += 2;
                }
                if(skillset4 == "Persuasion"){
                    Persuasion += 2;
                }
                break;
            }
        }
         // setup Religion
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Intelligence")){
                Religion = stats.get(i).Modifier();
                if(skillset1 == "Religion"){
                    Religion += 2;
                }
                if(skillset2 == "Religion"){
                    Religion += 2;
                }
                if(skillset3 == "Religion"){
                    Religion += 2;
                }
                if(skillset4 == "Religion"){
                    Religion += 2;
                }
                break;
            }
        }
         // setup Sleight Of Hand
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Dexterity")){
                SleightOfHand = stats.get(i).Modifier();
                if(skillset1 == "Sleight Of Hand"){
                    SleightOfHand += 2;
                }
                if(skillset2 == "Sleight Of Hand"){
                    SleightOfHand += 2;
                }
                if(skillset3 == "Sleight Of Hand"){
                    SleightOfHand += 2;
                }
                if(skillset4 == "Sleight Of Hand"){
                    SleightOfHand += 2;
                }
                break;
            }
        }
         // setup Stealth
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Dexterity")){
                Stealth = stats.get(i).Modifier();
                if(skillset1 == "Stealth"){
                    Stealth += 2;
                }
                if(skillset2 == "Stealth"){
                    Stealth += 2;
                }
                if(skillset3 == "Stealth"){
                    Stealth += 2;
                }
                if(skillset4 == "Stealth"){
                    Stealth += 2;
                }
                break;
            }
        }
         // setup Survival
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Wisdom")){
                Survival = stats.get(i).Modifier();
                if(skillset1 == "Survival"){
                    Survival += 2;
                }
                if(skillset2 == "Survival"){
                    Survival += 2;
                }
                if(skillset3 == "Survival"){
                    Survival += 2;
                }
                if(skillset4 == "Survival"){
                    Survival += 2;
                }
                break;
            }
        }
    }
}
