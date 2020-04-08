import java.util.*;
import java.io.*;
public class DnDCharacterSheet
{
    public static void main(String args[]) {
        String newline = System.getProperty("line.separator");
        // CharacterBio Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        CharacterBio Bio = new CharacterBio();
        Bio.RandomizeName();
        
        Scanner pn = new Scanner(System.in);
        System.out.print("What is your first name?    ");
        String playerfnlname = pn.nextLine();
        Bio.PlayerName = playerfnlname;
        
        String listofclasses = "Select your character's base class - ";           //base class
        for(int i = 0; i < CharacterBio.ListOfClasses.length; i++) {
            listofclasses += "\r\n\t" + (i+1) + ") " + CharacterBio.ListOfClasses[i];
        }        
        System.out.println(listofclasses);
        Scanner sc = new Scanner(System.in);
        int ccmin = 1; int ccmax = 13; int characterclassNumber = 0; boolean error = true;
        do {
            System.out.print("Enter a number from the list of class's: ");
            if (sc.hasNextInt()) {characterclassNumber = sc.nextInt();}
            else {String emptystr = ""; emptystr += sc.nextLine(); emptystr = emptystr.toLowerCase(); String nem = emptystr.trim(); continue;} error = false;
        } while (characterclassNumber > ccmax || characterclassNumber < ccmin);
        Bio.CharacterClass = CharacterBio.ListOfClasses[characterclassNumber-1];
        String listofraces = "Select your character's race - ";                    //race
        for(int i = 0; i < CharacterBio.ListOfRaces.length; i++) {
            listofraces += "\r\n\t" + (i+1) + ") " + CharacterBio.ListOfRaces[i];
        }        
        System.out.println(listofraces);
        Scanner cr = new Scanner(System.in);
        int crmin = 1; int crmax = 10; int characterraceNumber = 0; boolean error1 = true;
        do {
            System.out.print("Enter a number from the list of race's: ");
            if (cr.hasNextInt()) {characterraceNumber = cr.nextInt();}
            else {String emptystr1 = ""; emptystr1 += cr.nextLine(); emptystr1 = emptystr1.toLowerCase(); String nem1 = emptystr1.trim(); continue;} error1 = false;
        } while (characterraceNumber > crmax || characterraceNumber < crmin);
        Bio.Race = CharacterBio.ListOfRaces[characterraceNumber-1];
        String listofalignment = "Select your character's Alignment - ";         //alignment
        for(int i = 0; i < CharacterBio.ListOfAlignment.length; i++) {
            listofalignment += "\r\n\t" + (i+1) + ") " + CharacterBio.ListOfAlignment[i];
        }        
        System.out.println(listofalignment);
        Scanner calign = new Scanner(System.in);
        int calignmin = 1; int calignmax = 9; int characteralignNumber = 0; boolean error2 = true;
        do {
            System.out.print("Enter a number from the list of alignment: ");
            if (calign.hasNextInt()) {characteralignNumber = calign.nextInt();}
            else {String emptystr2 = ""; emptystr2 += calign.nextLine(); emptystr2 = emptystr2.toLowerCase(); String nem2 = emptystr2.trim(); continue;} error2 = false;
        } while (characteralignNumber > calignmax || characteralignNumber < calignmin);
        Bio.Alignment = CharacterBio.ListOfAlignment[characteralignNumber-1];
        //DnDDtat Class ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        List<DnDStat> Stats = new ArrayList<DnDStat>();
        Stats.add(new DnDStat());
        Stats.add(new DnDStat());
        Stats.add(new DnDStat());
        Stats.add(new DnDStat());
        Stats.add(new DnDStat());
        Stats.add(new DnDStat());
        Stats.get(0).StatName = "Strength";
        Stats.get(0).Randomize();
        Stats.get(1).StatName = "Dexterity";
        Stats.get(1).Randomize();
        Stats.get(2).StatName = "Constitution";
        Stats.get(2).Randomize();
        Stats.get(3).StatName = "Intelligence";
        Stats.get(3).Randomize();
        Stats.get(4).StatName = "Wisdom   ";
        Stats.get(4).Randomize();
        Stats.get(5).StatName = "Charisma";
        Stats.get(5).Randomize();
        //treasure Class ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        List<treasure> money = new ArrayList<treasure>();
        money.add(new treasure());
        money.add(new treasure());
        money.add(new treasure());
        money.add(new treasure());
        money.add(new treasure());
        money.get(0).PieceName = "Copper Piece:     ";
        money.get(0).Randomize();
        money.get(1).PieceName = "Silver Piece:     ";
        money.get(1).Randomize();
        money.get(2).PieceName = "Electrum Piece:   ";
        money.get(2).Randomize();
        money.get(3).PieceName = "Gold Piece:       ";
        money.get(3).Randomize();
        money.get(4).PieceName = "Platinum Piece:   ";
        money.get(4).Randomize();
        // savingThrows Class -------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        savingThrows savethrowfa = new savingThrows();
        
        String listofsthrow = "Choose 2 abilities - ";
        for(int i = 0; i < savingThrows.ListOfST.length; i++) {
            listofsthrow += "\r\n\t" + (i+1) + ") " + savingThrows.ListOfST[i];
        }        
        System.out.println(listofsthrow);
        Scanner fsta = new Scanner(System.in);
        int stmin = 1; int stmax = 6; int firstsavingtnum = 0; boolean error3 = true;                       // 1st ability
        do {
            System.out.print("Enter a number from the list of abilities" + newline + "\t1st ability: ");
            if (fsta.hasNextInt()) {firstsavingtnum = fsta.nextInt();}
            else {String emptystr3 = ""; emptystr3 += fsta.nextLine(); emptystr3 = emptystr3.toLowerCase(); String nem3 = emptystr3.trim(); continue;} error3 = false;
        } while (firstsavingtnum > stmax || firstsavingtnum < stmin);
        savethrowfa.firstchoice = savingThrows.ListOfST[firstsavingtnum-1];
        Scanner ssta = new Scanner(System.in);
        int secondsavingtnum = 0; boolean error4 = true;                                                   // 2nd ability
        do {
            System.out.print("Enter a number from the list of abilities" + newline + "\t2nd ability: ");
            if (ssta.hasNextInt()) {secondsavingtnum = ssta.nextInt();}
            else {String emptystr4 = ""; emptystr4 += ssta.nextLine(); emptystr4 = emptystr4.toLowerCase(); String nem4 = emptystr4.trim(); continue;} error4 = false;
        } while (secondsavingtnum > stmax || secondsavingtnum < stmin);
        savethrowfa.secondchoice = savingThrows.ListOfST[secondsavingtnum-1];
        savethrowfa.setupSavingThrows(Stats);
        // weapon Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        weapon charweapon = new weapon();
        charweapon.RandomizeWeapon();
        if (Bio.CharacterClass.equals("Mage")) {
            charweapon.WeaponName = "None";
        } else if (Bio.CharacterClass.equals("Wizard")) {
            charweapon.WeaponName = "Staff";
        } charweapon.setupweapon(Stats);
        // physicalDescription Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        physicalDescription thehcolor = new physicalDescription();
        thehcolor.RandomizeName();
        physicalDescription theecolor = new physicalDescription();
        theecolor.RandomizeName();
        physicalDescription thescolor = new physicalDescription();
        thescolor.RandomizeName();
        physicalDescription phofraces = new physicalDescription();
        if (Bio.Race.equals("Dragonborn")) {
            phofraces.setage(120);
            phofraces.setweight(175);
            phofraces.setheight(66);
        } else if (Bio.Race.equals("Dwarf")) {
            phofraces.setage(40);
            phofraces.setweight(135);
            phofraces.setheight(44);
        } else if (Bio.Race.equals("Eladrin")) {
            phofraces.setage(120);
            phofraces.setweight(155);
            phofraces.setheight(70);
        } else if (Bio.Race.equals("Elf")) {
            phofraces.setage(110);
            phofraces.setweight(95);
            phofraces.setheight(64);
        } else if (Bio.Race.equals("Half-elf")) {
            phofraces.setage(20);
            phofraces.setweight(110);
            phofraces.setheight(61);
        } else if (Bio.Race.equals("Half-orc")) {
            phofraces.setage(14);
            phofraces.setweight(140);
            phofraces.setheight(58);
        } else if (Bio.Race.equals("Human")) {
            phofraces.setage(15);
            phofraces.setweight(110);
            phofraces.setheight(56);
        } else if (Bio.Race.equals("Tiefling")) {
            phofraces.setage(20);
            phofraces.setweight(110);
            phofraces.setheight(57);
        } else if (Bio.Race.equals("Gnome")) {
            phofraces.setage(40);
            phofraces.setweight(35);
            phofraces.setheight(35);
        } else if (Bio.Race.equals("Halfling")) {
            phofraces.setage(20);
            phofraces.setweight(35);
            phofraces.setheight(31);
        }
        phofraces.getage();
        phofraces.getweight();
        phofraces.getheight();
        // backgroundInfo Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        backgroundInfo Description = new backgroundInfo();
        
        Scanner ptr = new Scanner(System.in);
        System.out.print("Enter your Personality Traits:     ");
        String persontraits = ptr.nextLine();
        Description.PersonalityTraits = persontraits;
        
        Scanner idls = new Scanner(System.in);
        System.out.print("Enter your Ideals:     ");
        String ideal = idls.nextLine();
        Description.Ideals = ideal;
        
        Description.setupLanguages(Bio);
        // pointSystem Class -------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        pointSystem thecpoints = new pointSystem();
        if (Bio.Race .equals("Dragonborn") || Bio.Race.equals("Eladrin") || Bio.Race.equals("Elf") || Bio.Race.equals("Half-elf") || Bio.Race.equals("Half-orc") || Bio.Race.equals("Human") || Bio.Race.equals("Tiefling")) {
            thecpoints.setSpeed(30);
        } else if (Bio.Race.equals("Dwarf") || Bio.Race.equals("Gnome") || Bio.Race.equals("Halfling")) {
            thecpoints.setSpeed(25);
        } thecpoints.getSpeed();
        for(int i=0; i<Stats.size(); i++){
            String name = Stats.get(i).StatName;
            if(name.equals("Constitution")) {
                thecpoints.HitPoints = Stats.get(i).Modifier();
                if(Bio.CharacterClass.equals("Barbarian")){
                    thecpoints.HitPoints += 12;
                } if(Bio.CharacterClass.equals("Fighter") || Bio.CharacterClass.equals("Paladin")){
                    thecpoints.HitPoints += 10;
                } if(Bio.CharacterClass.equals("Cleric") || Bio.CharacterClass.equals("Druid") || Bio.CharacterClass.equals("Monk") || Bio.CharacterClass.equals("Warlock") || Bio.CharacterClass.equals("Ranger")){
                    thecpoints.HitPoints += 8;
                } if(Bio.CharacterClass .equals("Rogue") || Bio.CharacterClass.equals("Bard")){
                    thecpoints.HitPoints += 6;
                } if(Bio.CharacterClass.equals("Wizard") || Bio.CharacterClass.equals("Mage") || Bio.CharacterClass.equals("Sorcerer")){
                    thecpoints.HitPoints += 4;
                } break; }
            if(name.equals("Dexterity")) {
                thecpoints.Initiative = Stats.get(i).Modifier();
                if(Bio.CharacterClass.equals("Barbarian")){
                    thecpoints.Initiative += 12;
                } if(Bio.CharacterClass.equals("Fighter") || Bio.CharacterClass.equals("Paladin")){
                    thecpoints.Initiative += 10;
                } if(Bio.CharacterClass.equals("Cleric") || Bio.CharacterClass.equals("Druid") || Bio.CharacterClass.equals("Monk") || Bio.CharacterClass.equals("Warlock") || Bio.CharacterClass.equals("Ranger")){
                    thecpoints.Initiative += 8;
                } if(Bio.CharacterClass .equals("Rogue") || Bio.CharacterClass.equals("Bard")){
                    thecpoints.Initiative += 6;
                } if(Bio.CharacterClass.equals("Wizard") || Bio.CharacterClass.equals("Mage") || Bio.CharacterClass.equals("Sorcerer")){
                    thecpoints.Initiative += 4;
                } break; }
        }
        // skills Class ---------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        skills setofskills = new skills();
        String skillList = "Choose 4 skill's - ";
        for(int i = 0; i < skills.ListOfSkills.length; i++) {
            skillList += "\r\n\t" + (i+1) + ") " + skills.ListOfSkills[i];
        }        
        System.out.println(skillList);
        Scanner fskill = new Scanner(System.in);
        int cskillmin = 1; int cskillmax = 18; int firstskillnum = 0; boolean error5 = true;                            // 1st skill
        do {
            System.out.print("Enter a number from the list of skill's" + newline + "\t1st skill: ");
            if (fskill.hasNextInt()) {firstskillnum = fskill.nextInt();}
            else {String emptystr5 = ""; emptystr5 += fskill.nextLine(); emptystr5 = emptystr5.toLowerCase(); String nem5 = emptystr5.trim(); continue;} error5 = false;
        } while (firstskillnum > cskillmax || firstskillnum < cskillmin);
        setofskills.skillset1 = skills.ListOfSkills[firstskillnum-1];
        Scanner sskill = new Scanner(System.in);
        int secskillnum = 0; boolean error6 = true;                                                                     // 2nd skill
        do {
            System.out.print("Enter a number from the list of skill's" + newline + "\t2nd skill: ");
            if (sskill.hasNextInt()) {secskillnum = sskill.nextInt();}
            else {String emptystr6 = ""; emptystr6 += sskill.nextLine(); emptystr6 = emptystr6.toLowerCase(); String nem6 = emptystr6.trim(); continue;} error6 = false;
        } while (secskillnum > cskillmax || secskillnum < cskillmin);
        setofskills.skillset2 = skills.ListOfSkills[secskillnum-1];
        Scanner tskill = new Scanner(System.in);
        int thirdskillnum = 0; boolean error7 = true;                                                                  // 3rd skill
        do {
            System.out.print("Enter a number from the list of skill's" + newline + "\t3rd skill: ");
            if (tskill.hasNextInt()) {thirdskillnum = tskill.nextInt();}
            else {String emptystr7 = ""; emptystr7 += tskill.nextLine(); emptystr7 = emptystr7.toLowerCase(); String nem7 = emptystr7.trim(); continue;} error7 = false;
        } while (thirdskillnum > cskillmax || thirdskillnum < cskillmin);
        setofskills.skillset3 = skills.ListOfSkills[thirdskillnum-1];
        Scanner foskill = new Scanner(System.in);
        int fourskillnum = 0; boolean error8 = true;                                                                  // 4th skill
        do {
            System.out.print("Enter a number from the list of skill's" + newline + "\t4th skill: ");
            if (foskill.hasNextInt()) {fourskillnum = foskill.nextInt();}
            else {String emptystr8 = ""; emptystr8 += foskill.nextLine(); emptystr8 = emptystr8.toLowerCase(); String nem8 = emptystr8.trim(); continue;} error8 = false;
        } while (fourskillnum > cskillmax || fourskillnum < cskillmin);
        setofskills.skillset4 = skills.ListOfSkills[fourskillnum-1];
        setofskills.setupSkills(Stats);
        //defenseStats Class ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        defenseStats defendchar = new defenseStats();
        defendchar.rollRandomize();
        String armorList = "Choose a piece of Armor - ";
        for(int i = 0; i < defenseStats.ListOfArmor.length; i++) {
            armorList += "\r\n\t" + (i+1) + ") " + defenseStats.ListOfArmor[i];
        }        
        System.out.println(armorList);
        Scanner carmor = new Scanner(System.in);
        int armormin = 1; int armormax = 3; int armorNumber = 0; boolean error9 = true;                          // choosing armor
        do {
            System.out.print("Enter a number from the list of armor: ");
            if (carmor.hasNextInt()) {armorNumber = carmor.nextInt();}
            else  {String emptystr9 = ""; emptystr9 += carmor.nextLine(); emptystr9 = emptystr9.toLowerCase(); String nem9 = emptystr9.trim(); continue;} error9 = false;
        } while (armorNumber > armormax || armorNumber < armormin);
        defendchar.ArmorSet = defenseStats.ListOfArmor[armorNumber-1];
        defendchar.setArmorClass();
        //output results ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        System.out.println("---------------------------------------------------" + newline);
        System.out.println("Player's Name: " + Bio.PlayerName + "\t\tCharacter's Name: " + Bio.CharacterName + "\t\tClass: " + Bio.CharacterClass + "\t\tRace: " + Bio.Race + "\t\tAlignment: " + Bio.Alignment + newline);
        System.out.println("Hair Color: " + thehcolor.haircolor +"\t\tEye Color: " + theecolor.eyecolor + "\t\tSkin Color: " + thescolor.skincolor + "\t\tAge: " + phofraces.age + " yrs old\t\t" + "Height: " + phofraces.height + " in.\t\t" + "Weight: " + phofraces.weight + " Ibs." + newline);
        for(int i =0; i < Stats.size(); i++){
            DnDStat currentStat = Stats.get(i);
            System.out.println(currentStat.StatName + "\t" + currentStat.Score + "\t" + currentStat.Modifier());
        }
        System.out.println(newline + "Saving Throws:");
        System.out.println("Strength: " + savethrowfa.Strength + "\t\tDexterity: " + savethrowfa.Dexterity + "\t\tConstitution: " + savethrowfa.Constitution + "\t\tIntelligence: " + savethrowfa.Intelligence + "\t\tWisdom: " + savethrowfa.Wisdom + "\t\tCharisma: " + savethrowfa.Charisma + newline);
        
        System.out.println("Weapon: " + charweapon.WeaponName + "\t\tAttack Bonus: " + charweapon.AttackBonus + newline);
        
        System.out.println("Languages:\t\t\tClass: " + Description.languageclass + "\t\tRace: " + Description.languagerace);
        System.out.println("Personality Traits: " + Description.PersonalityTraits);
        System.out.println("Ideals: " + Description.Ideals + newline);
        
        System.out.println("Armor Class: " + defendchar.ArmorClass + "\t\tInitiative: " + thecpoints.Initiative + "\t\tMax Hit Points: " + thecpoints.HitPoints + "\t\tSpeed: " + thecpoints.Speed);
        System.out.println(newline + "Equipment:");
        System.out.println("Armor: " + defendchar.ArmorSet + "\t\tShield: " + defendchar.Shield() + newline);
        for(int i =0; i < money.size(); i++){
            treasure currentPrice = money.get(i);
            System.out.println(currentPrice.PieceName + "\t" + currentPrice.MoneyAmt);
        }
        System.out.println(newline + "Skills:");
        System.out.println("Acrobatics: " + setofskills.Acrobatics + "\t\tAnimal Handling: " + setofskills.AnimalHandling + "\t\tArcana: " + setofskills.Arcana + "\t\tAthletics: " + setofskills.Athletics + "\t\tDeception: " + setofskills.Deception + "\t\tHistory: " + setofskills.History + "\t\tInsight: " + setofskills.Insight);
        System.out.println("Intimidation: " + setofskills.Intimidation + "\t\tInvestigation: " + setofskills.Investigation + "\t\tMedicine: " + setofskills.Medicine + "\t\tNature: " + setofskills.Nature + "\t\tPerception: " + setofskills.Perception + "\t\tPerformance: " + setofskills.Performance);
        System.out.println("Persuasion: " + setofskills.Persuasion + "\t\tReligion: " + setofskills.Religion + "\t\tSleight Of Hand: " + setofskills.SleightOfHand + "\t\tStealth: " + setofskills.Stealth + "\t\tSurvival: " + setofskills.Survival);
    }
}
