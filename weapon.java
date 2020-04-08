import java.util.*;
public class weapon
{
    public String WeaponName;
    public int AttackBonus;
    
    public int Strength;
    //weapons - club, dagger, great club, handaxe, javelin, light hammer,
    //          mace, staff, sickle, spear, sling, sword
    public void RandomizeWeapon() {
        String[] ListOfWeapons = {"Club", "Dagger", "Great Club", "Handaxe", "Javelin", "Light Hammer", "Mace", "Staff", "Sickle", "Spear", "Sling", "Sword"};
        
        Random weapons = new Random();
        
        int weaponLen = ListOfWeapons.length;
        int wpn = weapons.nextInt(weaponLen - 1);
        String cwpn = ListOfWeapons[wpn];
        
        WeaponName = cwpn;
    }
    
    public void setupweapon(List<DnDStat> stats){
        //use Strength for attack bonus
        for(int i=0; i<stats.size(); i++){
            String nameofab = stats.get(i).StatName;
            if(nameofab.equals("Strength")){
                Strength = stats.get(i).Modifier();
                AttackBonus = Strength;
            }
        }
    }
}
