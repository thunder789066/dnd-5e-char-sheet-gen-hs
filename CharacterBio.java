import java.util.Random;
public class CharacterBio {
    public String CharacterClass;
    public String PlayerName;
    public String Race;
    public String Alignment;
    public String CharacterName;
    
    public static String[] ListOfClasses = { "Fighter", "Wizard", "Rogue", "Barbarian", "Bard", "Cleric", "Druid", "Mage", "Monk", "Paladin", "Ranger", "Sorcerer", "Warlock" };
    public static String[] ListOfRaces = { "Dragonborn", "Dwarf", "Eladrin", "Elf", "Gnome", "Half-elf", "Half-orc", "Halfling", "Human", "Tiefling" };
    public static String[] ListOfAlignment = { "Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "(True) Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil" };
    
    public void setCharacterClass(String charclass) {
        CharacterClass = charclass;
    }
    public String getCharacterClass() {
        return CharacterClass;
    }
    
    public void RandomizeName() {
        String[] consonents = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","y","z"};
        String[] vowels = {"a","e","i","o","u"};
        String[] last = {"Smoke","Plume","Flare","Flame","Rumble","Chilly","Ice","Dark","Glint","Light","Fire","Sand","Time","Jikan","Space","Supesu","Lightning","Magma","Swamp","Gas","Snow","Moku","Mera","Suna","Goro","Yami","Pika","Magu","Numa","Gasu","Yuki","Fog","Kiri","Steam","Joki","Cloud","Kumo","Dust","Hokori","Crystal","Salt","Shio","Mizu","Water","Kessho"};
        
        Random rnd = new Random();
        int consonantLen = consonents.length;
        int vowelLen = vowels.length;
        
        // firstchar6 = c + v + c + v + c + v
        // character name = firstcher6 + last
        
        String firstchar6 = "";
        for(int i=0; i<3; i++){
            int c = rnd.nextInt(consonantLen - 1);
            String consonant = consonents[c];
            int v = rnd.nextInt(vowelLen -1);
            String vowel = vowels[v];
            firstchar6 += consonant + vowel;
        }
        firstchar6 = firstchar6.substring(0,1).toUpperCase() + firstchar6.substring(1);
        
        int lastLen = last.length;
        int L = rnd.nextInt(lastLen - 1);
        String lastName = last[L];
        
        CharacterName = firstchar6 + " " + lastName;
        
    }
}
