package objectOrientation.UltraEmojiCombat;
import objectOrientation.UltraEmojiCombat.Fighter.Nationality;

public class Main {

    public static void main(String[] args) {


        Fighter fighters[] = new Fighter[10];

        fighters[0] = new Fighter(
            "Joao Glass", 
            Nationality.BRAZIL, 
            (short)22, 
            (float)73.5,
            1.92f,
            (short)10, 
            (short)5, 
            (short)0
        );

        fighters[1] = new Fighter(
            "Henri Panceta", 
            Nationality.FRANCE, 
            (short)58, 
            102f,
            1.85f,
            (short)9, 
            (short)0, 
            (short)0
        );

        fighters[0].show();
        fighters[0].status();

        fighters[1].show();
        fighters[1].status();

        fighters[1].lose();
        fighters[1].status();

    }


}
