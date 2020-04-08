import java.util.*;
 public class pointSystem {
    public int Initiative;
    public int HitPoints;
    public int Speed;
    
    public String charclassname;
    
    public void setSpeed(int speednum) {
        Speed = speednum;
    }
    public int getSpeed() {
        return Speed;
    }
    
    //   mspeed = 30    dragonborn, elf, half-elf, half-orc, tiefling    
    //   sspeed = 25    dwarf, halfling, gnome
    
    public void setuphitpoints(List<DnDStat> stats) {
        for(int i=0; i<stats.size(); i++){
            String name = stats.get(i).StatName;
            if(name.equals("Constitution") || name.equals("Dexterity")) {
                HitPoints = stats.get(i).Modifier();
                if(CharacterBio.getCharacterClass().equals("Barbarian")){
                    HitPoints += 12;
                } if(Bio.CharacterClass.equals("Fighter") || Bio.CharacterClass.equals("Paladin")){
                    HitPoints += 10;
                } if(Bio.CharacterClass.equals("Cleric") || Bio.CharacterClass.equals("Druid") || Bio.CharacterClass.equals("Monk") || Bio.CharacterClass.equals("Warlock") || Bio.CharacterClass.equals("Ranger")){
                    HitPoints += 8;
                } if(Bio.CharacterClass .equals("Rogue") || Bio.CharacterClass.equals("Bard")){
                    HitPoints += 6;
                } if(Bio.CharacterClass.equals("Wizard") || Bio.CharacterClass.equals("Mage") || Bio.CharacterClass.equals("Sorcerer")){
                    HitPoints += 4;
                } 
            }
        }
    }
    
    // d12 - barbarian
    // d10 - fighter, paladin
    // d8 - cleric, druid, monk, warlock, ranger
    // d6 - rogue, bard
    // d4 - wizard, mage, sorcerer
    //   hitpoints = d(#) + ConModifier
    //   initiative = d(#) + DexModifier
}
