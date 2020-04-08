import java.util.*;
public class weapon
{
    public String WeaponName;
    public int AttackBonus;
    
    //weapons - club, dagger, great club, handaxe, javelin, light hammer,
    //          mace, staff, sickle, spear, sling, sword
    public void RandomizeWeapon() {
        String[] ListOfWeapons = {"Club", "Dagger", "Great Club", "Handaxe", "Javelin", "Light Hammer", "Mace", "Staff", "Sickle", "Spear", "Sling", "Sword"};
        
        Random weapons = new Random();
        
        int weaponLen = ListOfWeapons.length;
        int wpn = weapons.nextInt(weaponLen - 1);
        String cwpn = ListOfWeapons[wpn];
        
        WeaponName = cwpn;
        //Use the strength bonus for the attack bonus
    }
}
