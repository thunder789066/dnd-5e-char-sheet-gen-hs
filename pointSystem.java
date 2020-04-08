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
    
    // d12 - barbarian
    // d10 - fighter, paladin
    // d8 - cleric, druid, monk, warlock, ranger
    // d6 - rogue, bard
    // d4 - wizard, mage, sorcerer
    //   hitpoints = d(#) + ConModifier
    //   initiative = d(#) + DexModifier
}
