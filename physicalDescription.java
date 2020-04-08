import java.util.Random;
public class physicalDescription
{
    public int age;
    public int height;
    public int weight;
    public String haircolor;
    public String eyecolor;
    public String skincolor;
    
    public void setage(int agenum){
        age = agenum;
    }
    public int getage() {
        return age;
    }
    
    public void setheight(int heightnum){
        height = heightnum;
    }
    public int getheight() {
        return height;
    }
    
    public void setweight(int weightnum){
        weight = weightnum;
    }
    public int getweight() {
        return weight;
    }
    
    public void RandomizeName() {
        String[] hair = {"Black","Gray","Platinum","White","Dark Blonde","Blonde","Bleach Blonde","Dark Redhead","Redhead","Light Redhead","Brunette","Auburn","Yellow","Amber","Brown","Hazel","Green","Blue","Aqua","Red","Purple","Pale Brown","Pale Blue","Pale Green","Pale Gray","Violet Red","Orange","Spring Green","Sea Green","Emerald Green"};
        String[] eye = {"Yellow","Amber","Brown","Hazel","Green","Blue","Gray","Aqua","Red","Purple","Pale Brown","Pale Blue","Pale Green","Pale Gray","Deep Blue","Violet Red","Orange","Spring Green","Sea Green","Emerald Green"};
        String[] skin = {"Pale","Fair","Light","Light Tan","Tan","Brown","Dark Brown","Black","Gray","White","Gold","Silver","Bronze","Red","Orange","Yellow","Green","Blue","Purple","Pale Yellow","Dark Red","Red-Orange","Light Red","Amber","Olive","Aqua","Pale Brown","Pale Blue","Pale Green","Pale Gray","Deep Blue","Violet Red","Spring Green","Sea Green","Emerald Green"};
        
        Random color = new Random();
        
        int hairLen = hair.length;
        int hc = color.nextInt(hairLen - 1);
        String hcolor = hair[hc];
        
        int eyeLen = eye.length;
        int ec = color.nextInt(eyeLen - 1);
        String ecolor = eye[ec];
        
        int skinLen = skin.length;
        int sc = color.nextInt(skinLen - 1);
        String scolor = skin[sc];
        
        haircolor = hcolor;
        eyecolor = ecolor;
        skincolor = scolor;
    }
    
    // AGE(in years): dwarf - 40, gnome - 40, halfling - 20, dragonborn - 120,
    //                eladrin - 120, elf - 110, half-elf - 20, human - 15,
    //                half-orc - 14, tiefling - 20
    
    // HEIGHT(inches/in): dwarf - 44, gnome - 35, halfling - 31, dragonborn - 66,
    //                eladrin - 70, elf - 64, half-elf - 61, human - 56,
    //                half-orc - 58, tiefling - 57
    
    // WEIGHT(Ibs.): dwarf - 135, gnome - 35, halfling - 35, dragonborn - 175,
    //                eladrin - 155, elf - 95, half-elf - 110, human - 110,
    //                half-orc - 140, tiefling - 110
}
