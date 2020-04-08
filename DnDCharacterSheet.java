import java.util.*;

public class DnDCharacterSheet extends GameCharacterSheet
{
    public static void main(String args[]) {
        // CharacterBio Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        CharacterBio Bio = new CharacterBio();
        Bio.RandomizeName();
        
//         Scanner pn = new Scanner(System.in);
//         System.out.print("What is your first name?    ");
//         String playerfnlname = pn.nextLine();
//         Bio.PlayerName = playerfnlname;
//         
        String listofclasses = "Select your character's base class - ";   //base class
        for(int i = 0; i < CharacterBio.ListOfClasses.length; i++) {
            listofclasses += "\r\n\t" + (i+1) + ") " + CharacterBio.ListOfClasses[i];
        }        
        System.out.println(listofclasses);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("# Selection: ");
            int characterclassNumber = sc.nextInt();
            Bio.CharacterClass = CharacterBio.ListOfClasses[characterclassNumber-1];
        }
        catch(InputMismatchException exception) {
            System.out.println("Invalid. Please select a different choice."); 
        }
        String listofraces = "Select your character's race - ";    //race
        for(int i = 0; i < CharacterBio.ListOfRaces.length; i++) {
            listofraces += "\r\n\t" + (i+1) + ") " + CharacterBio.ListOfRaces[i];
        }        
        System.out.println(listofraces);
        Scanner cr = new Scanner(System.in);
        try {
            System.out.print("# Selection: ");
            int characterraceNumber = cr.nextInt();
            Bio.Race = CharacterBio.ListOfRaces[characterraceNumber-1];
        }
        catch(InputMismatchException exception) {
            System.out.println("Invalid. Please select a different choice."); 
        }
//         String listofalignment = "Select your character's Alignment - ";   //alignment
//         for(int i = 0; i < CharacterBio.ListOfAlignment.length; i++) {
//             listofalignment += "\r\n\t" + (i+1) + ") " + CharacterBio.ListOfAlignment[i];
//         }        
//         System.out.println(listofalignment);
//         Scanner calign = new Scanner(System.in);
//         try {
//             System.out.print("# Selection: ");
//             int characteralignNumber = calign.nextInt();
//             Bio.Alignment = CharacterBio.ListOfAlignment[characteralignNumber-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
//         
        //DnDDtat Class ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         //-------------------------------------------------------------------------------------------------
//         List<DnDStat> Stats = new ArrayList<DnDStat>();
//         
//         Stats.add(new DnDStat());
//         Stats.add(new DnDStat());
//         Stats.add(new DnDStat());
//         Stats.add(new DnDStat());
//         Stats.add(new DnDStat());
//         Stats.add(new DnDStat());
//         
//         Stats.get(0).StatName = "Strength";
//         Stats.get(0).Randomize();
//         Stats.get(1).StatName = "Dexterity";
//         Stats.get(1).Randomize();
//         Stats.get(2).StatName = "Constitution";
//         Stats.get(2).Randomize();
//         Stats.get(3).StatName = "Intelligence";
//         Stats.get(3).Randomize();
//         Stats.get(4).StatName = "Wisdom   ";
//         Stats.get(4).Randomize();
//         Stats.get(5).StatName = "Charisma";
//         Stats.get(5).Randomize();
        
//         //treasure Class ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         //-------------------------------------------------------------------------------------------------
//         List<treasure> money = new ArrayList<treasure>();
//         
//         money.add(new treasure());
//         money.add(new treasure());
//         money.add(new treasure());
//         money.add(new treasure());
//         money.add(new treasure());
//         
//         money.get(0).PieceName = "Copper Piece:     ";
//         money.get(0).Randomize();
//         money.get(1).PieceName = "Silver Piece:     ";
//         money.get(1).Randomize();
//         money.get(2).PieceName = "Electrum Piece:   ";
//         money.get(2).Randomize();
//         money.get(3).PieceName = "Gold Piece:       ";
//         money.get(3).Randomize();
//         money.get(4).PieceName = "Platinum Piece:   ";
//         money.get(4).Randomize();
//         
        // savingThrows Class -------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
//         savingThrows savethrowfa = new savingThrows();
//         
//         String listofsthrow = "Choose 2 abilities - ";
//         for(int i = 0; i < savingThrows.ListOfST.length; i++) {
//             listofsthrow += "\r\n\t" + (i+1) + ") " + savingThrows.ListOfST[i];
//         }        
//         System.out.println(listofsthrow);
//         Scanner fsta = new Scanner(System.in);              // 1st ability
//         try {
//             System.out.print("# Selection 1st ability: ");
//             int firstsavingtnum = fsta.nextInt();
//             savethrowfa.firstchoice = savingThrows.ListOfST[firstsavingtnum-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
//         Scanner ssta = new Scanner(System.in);              // 2nd ability
//         try {
//             System.out.print("# Selection 2nd ability: ");
//             int secondsavingtnum = ssta.nextInt();
//             savethrowfa.secondchoice = savingThrows.ListOfST[secondsavingtnum-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
//         savethrowfa.setupSavingThrows(Stats);
//         
        // weapon Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        
        weapon charweapon = new weapon();
        charweapon.RandomizeWeapon();
        if (Bio.CharacterClass == "Mage") {
            charweapon.WeaponName = "None";
        } else if (Bio.CharacterClass == "Wizard") {
            charweapon.WeaponName = "Staff";
        }
        
        // physicalDescription Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        physicalDescription thehcolor = new physicalDescription();
        thehcolor.RandomizeName();
        physicalDescription theecolor = new physicalDescription();
        theecolor.RandomizeName();
        physicalDescription thescolor = new physicalDescription();
        thescolor.RandomizeName();
        
        physicalDescription phofraces = new physicalDescription();
        if (Bio.Race == "Dragonborn") {
            phofraces.setage(120);
            phofraces.getage();
            phofraces.setweight(175);
            phofraces.getweight();
            phofraces.setheight(66);
            phofraces.getheight();
        } else if (Bio.Race == "Dwarf") {
            phofraces.setage(40);
            phofraces.getage();
            phofraces.setweight(135);
            phofraces.getweight();
            phofraces.setheight(44);
            phofraces.getheight();
        } else if (Bio.Race == "Eladrin") {
            phofraces.setage(120);
            phofraces.getage();
            phofraces.setweight(155);
            phofraces.getweight();
            phofraces.setheight(70);
            phofraces.getheight();
        } else if (Bio.Race == "Elf") {
            phofraces.setage(110);
            phofraces.getage();
            phofraces.setweight(95);
            phofraces.getweight();
            phofraces.setheight(64);
            phofraces.getheight();
        } else if (Bio.Race == "Half-elf") {
            phofraces.setage(20);
            phofraces.getage();
            phofraces.setweight(110);
            phofraces.getweight();
            phofraces.setheight(61);
            phofraces.getheight();
        } else if (Bio.Race == "Half-orc") {
            phofraces.setage(14);
            phofraces.getage();
            phofraces.setweight(140);
            phofraces.getweight();
            phofraces.setheight(58);
            phofraces.getheight();
        } else if (Bio.Race == "Human") {
            phofraces.setage(15);
            phofraces.getage();
            phofraces.setweight(110);
            phofraces.getweight();
            phofraces.setheight(56);
            phofraces.getheight();
        } else if (Bio.Race == "Tiefling") {
            phofraces.setage(20);
            phofraces.getage();
            phofraces.setweight(110);
            phofraces.getweight();
            phofraces.setheight(57);
            phofraces.getheight();
        } else if (Bio.Race == "Gnome") {
            phofraces.setage(40);
            phofraces.getage();
            phofraces.setweight(35);
            phofraces.getweight();
            phofraces.setheight(35);
            phofraces.getheight();
        } else if (Bio.Race == "Halfling") {
            phofraces.setage(20);
            phofraces.getage();
            phofraces.setweight(35);
            phofraces.getweight();
            phofraces.setheight(31);
            phofraces.getheight();
        }
        
        // backgroundInfo Class ------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        backgroundInfo Description = new backgroundInfo();
        
//         Scanner ptr = new Scanner(System.in);
//         System.out.print("Enter your Personality Traits:     ");
//         String persontraits = ptr.nextLine();
//         Description.PersonalityTraits = persontraits;
//         
//         Scanner idls = new Scanner(System.in);
//         System.out.print("Enter your Ideals:     ");
//         String ideal = idls.nextLine();
//         Description.Ideals = ideal;
//         
        Description.setupLanguages(Bio);
        
        // pointSystem Class -------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
//         pointSystem thecpoints = new pointSystem();
//         if (Bio.Race == "Dragonborn" || Bio.Race == "Eladrin" || Bio.Race == "Elf" || Bio.Race == "Half-elf" || Bio.Race == "Half-orc" || Bio.Race == "Human" || Bio.Race == "Tiefling") {
//             thecpoints.setSpeed(30);
//             thecpoints.getSpeed();
//         } else if (Bio.Race == "Dwarf" || Bio.Race == "Gnome" || Bio.Race == "Halfling") {
//             thecpoints.setSpeed(25);
//             thecpoints.getSpeed();
//         }
//         
//         for(int i=0; i<Stats.size(); i++){
//             String name = Stats.get(i).StatName;
//             if(name == "Constitution"){
//                 thecpoints.HitPoints = Stats.get(i).Modifier();
//                 if(Bio.CharacterClass == "Barbarian"){
//                     thecpoints.HitPoints += 12;
//                 }
//                 if(Bio.CharacterClass == "Fighter" || Bio.CharacterClass == "Paladin"){
//                     thecpoints.HitPoints += 10;
//                 }
//                 if(Bio.CharacterClass == "Cleric" || Bio.CharacterClass == "Druid" || Bio.CharacterClass == "Monk" || Bio.CharacterClass == "Warlock" || Bio.CharacterClass == "Ranger"){
//                     thecpoints.HitPoints += 8;
//                 }
//                 if(Bio.CharacterClass == "Rogue" || Bio.CharacterClass == "Bard"){
//                     thecpoints.HitPoints += 6;
//                 }
//                 if(Bio.CharacterClass == "Wizard" || Bio.CharacterClass == "Mage" || Bio.CharacterClass == "Sorcerer"){
//                     thecpoints.HitPoints += 4;
//                 }
//                 break;
//             }
//         }
        
        // skills Class ---------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
//         skills setofskills = new skills();
//         String skillList = "Choose 4 skill's - ";
//         for(int i = 0; i < skills.ListOfSkills.length; i++) {
//             skillList += "\r\n\t" + (i+1) + ") " + skills.ListOfSkills[i];
//         }        
//         System.out.println(skillList);
//         Scanner fskill = new Scanner(System.in);            // 1st skill
//         try {
//             System.out.print("# Selection 1st skill: ");
//             int firstskillnum = fskill.nextInt();
//             setofskills.skillset1 = skills.ListOfSkills[firstskillnum-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
//         Scanner sskill = new Scanner(System.in);            // 2nd skill
//         try {
//             System.out.print("# Selection 2nd skill: ");
//             int secskillnum = sskill.nextInt();
//             setofskills.skillset2 = skills.ListOfSkills[secskillnum-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
//         Scanner tskill = new Scanner(System.in);            // 3rd skill
//         try {
//             System.out.print("# Selection 3rd skill: ");
//             int thirdskillnum = tskill.nextInt();
//             setofskills.skillset3 = skills.ListOfSkills[thirdskillnum-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
//         Scanner foskill = new Scanner(System.in);           // 4th skill
//         try {
//             System.out.print("# Selection 4th skill: ");
//             int fourskillnum = foskill.nextInt();
//             setofskills.skillset4 = skills.ListOfSkills[fourskillnum-1];
//         }
//         catch(InputMismatchException exception) {
//             System.out.println("Invalid. Please select a different choice."); 
//         }
// //         setofskills.setupSkills(Stats);
        
        //output results ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------
        System.out.println("---------------------------------------------------");
        String newline = System.getProperty("line.separator");
        System.out.println("Player's Name: " + Bio.PlayerName + "\t\tCharacter's Name: " + Bio.CharacterName + "\t\tClass: " + Bio.CharacterClass + "\t\tRace: " + Bio.Race + "\t\tAlignment: " + Bio.Alignment + newline);
        System.out.println("Hair Color: " + thehcolor.haircolor +"\t\tEye Color: " + theecolor.eyecolor + "\t\tSkin Color: " + thescolor.skincolor + "\t\tAge: " + phofraces.age + " yrs old\t\t" + "Height: " + phofraces.height + " in.\t\t" + "Weight: " + phofraces.weight + " Ibs." + newline);
//         for(int i =0; i < Stats.size(); i++){
//             DnDStat currentStat = Stats.get(i);
//             System.out.println(currentStat.StatName + "\t" + currentStat.Score + "\t" + currentStat.Modifier());
//         }
//         System.out.println(newline + "Saving Throws:");
//         System.out.println("Strength: " + savethrowfa.Strength + "\t\tDexterity: " + savethrowfa.Dexterity + "\t\tConstitution: " + savethrowfa.Constitution + "\t\tIntelligence: " + savethrowfa.Intelligence + "\t\tWisdom: " + savethrowfa.Wisdom + "\t\tCharisma: " + savethrowfa.Charisma + newline);
//         
        System.out.println("Weapon: " + charweapon.WeaponName + newline);
        
        System.out.println("Languages:\t\t\tClass: " + Description.languageclass + "\t\tRace: " + Description.languagerace);
//         System.out.println("Personality Traits: " + Description.PersonalityTraits);
//         System.out.println("Ideals: " + Description.Ideals + newline);
//         
        //System.out.println("Max Hit Points: " + thecpoints.HitPoints + "\t\tSpeed: " + thecpoints.Speed + newline);
//         for(int i =0; i < money.size(); i++){
//             treasure currentPrice = money.get(i);
//             System.out.println(currentPrice.PieceName + "\t" + currentPrice.MoneyAmt);
//         }
//         System.out.println(newline + "Skills:");
//         System.out.println("Acrobatics: " + setofskills.Acrobatics + "\t\tAnimal Handling: " + setofskills.AnimalHandling + "\t\tArcana: " + setofskills.Arcana + "\t\tAthletics: " + setofskills.Athletics + "\t\tDeception: " + setofskills.Deception + "\t\tHistory: " + setofskills.History + "\t\tInsight: " + setofskills.Insight);
//         System.out.println("Intimidation: " + setofskills.Intimidation + "\t\tInvestigation: " + setofskills.Investigation + "\t\tMedicine: " + setofskills.Medicine + "\t\tNature: " + setofskills.Nature + "\t\tPerception: " + setofskills.Perception + "\t\tPerformance: " + setofskills.Performance);
//         System.out.println("Persuasion: " + setofskills.Persuasion + "\t\tReligion: " + setofskills.Religion + "\t\tSleight Of Hand: " + setofskills.SleightOfHand + "\t\tStealth: " + setofskills.Stealth + "\t\tSurvival: " + setofskills.Survival);
//         
    }
}
