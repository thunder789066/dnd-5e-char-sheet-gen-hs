import java.util.*;
public class backgroundInfo
{
    public String PersonalityTraits;
    public String Ideals;
    
    public String languagerace;
    public String languageclass;
    public void setupLanguages(CharacterBio Bio) {
        //setup languge by class/race
        String namerace = Bio.Race;
        if (namerace == "Dragonborn") {
            languagerace = "Common, Draconic";
        } else if (namerace == "Dwarf") {
            languagerace = "Common, Dwarvish";
        } else if (namerace == "Eladrin" || namerace == "Gnome" || namerace == "Elf" || namerace == "Half-elf") {
            languagerace = "Common, Elvish";
        } else if (namerace == "Half-orc") {
            languagerace = "Common, Giant";
        } else {
            languagerace = "Common";
        }
        
        String nameclass = Bio.CharacterClass;
        if (nameclass == "Druid") {
            languageclass = "Druidic";
        } else if (nameclass == "Cleric") {
            languageclass = "Celestial, Abyssal";
        } else if (nameclass == "Paladin") {
            languageclass = "Celestial";
        } else {
            languageclass = "None";
        }
    }
    
    // all races: common language
    // other:   dragonborn - draconic, dwarf - dwarvish, eladrin - elvish,
    //            gnome - elvish, elf - elvish, half-elf - elvish,
    //            half-orc - giant
    // choice of another language: halfling, human, tiefling
    
    // class languages: druid - druidic, cleric - celestial &
    //                  abyssal, paladin - celestial
}
