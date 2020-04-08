import java.util.*;
public class defenseStats
{
    public static String[] ListOfArmor = { "Leather Armor", "Chainmail Armor", "Platemail Armor" };
    public String ArmorSet;
    
    public int rollNum;
    public String Shield() {
        if (ShieldType() == 1) {
            //1 = yes shield, say how much they got added as bonus
            String yShield = "Character Has Shield  -   +1";
            return yShield;
        } else {
            //0 = no shield
            String nShield = "No shield  -   +0";
            return nShield;
        }
    }
    
    public int ArmorClass;
    public int ShieldType() {
        if (1 == rollNum) {
            //1 = yes
            return 1;
        } else {
            //2 = no
            return 0;
        }
    }
    public int ArmorType() {
        if (ArmorSet.equals("Leather Armor")) {
            return 3;
        } else if (ArmorSet.equals("Chainmail Armor")) {
            return 5;
        } else if (ArmorSet.equals("Platemail Armor")) {
            return 7;
        } else {
            return 0;
        }
        //   ArmorType      ArmorBonus
        //       ||             ||
        // Leather Armor    -   +3 
        // Chainmail Armor  -   +5
        // Platemail Armor  -   +7
        
        // Shield     -    +1(shieldbonus)
        // 
        // ArmorClass = 10 + ArmorBonus(3 or 5 or 7) + ShieldBonus(1 or 0)
    }
    
    private int roll2() {
        Random ynroll = new Random();
        int ynr = ynroll.nextInt(2)+1;
        return ynr;
    }
    public void rollRandomize(){
        //1 - yes, character HAS sheild            - +1
        //2 - no, character DOESNT HAVE sheild     - +0
        rollNum = roll2();
    }
    
    public void setArmorClass() {
       ArmorClass = 10 + ArmorType() + ShieldType();
    }
}
