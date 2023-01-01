/*
 * 321/2015050
 * Exizoglou Athanasios
 * Askhsh 4
 * 
 */
package pkg3haskhsh;
//dhlwsh vivliothhkwn
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//dhmiourgia antikeimwnou
        Trivial game = new Trivial();
       
        int w = 10;
        int sum = 0;            //dhlwsh metavlhtwn
        do {                //dhmiourgia do wile gia na aknei epanalhpseis sugkekrimees fores
            int p = 0;
            
            Random r = new Random();        //dhmiourgia tuxaiou arithmou
            p = r.nextInt(w);
            game.randomquestion(p);         //kalei sunarthsh gia na kanei mia tuxaia erwthsh
            Scanner k = new Scanner(System.in); //arxikopoihsh scanner
            String a = k.nextLine();            //vazoume mesa se mia metavlhth to alfarhthmitiko pou eisagei o xrhsths
            game.answer(a, sum);                //pairnoume thn apanthsh pou exei dwsei o xrhsths kai ena sunolo poswn pou einai to kerdos apo tis swstes apanthseis tou paixth
            sum = sum + (game.answer(a, sum));                  //prosthetei kathe fora to poso pou kerdizei o paixths
            System.out.println("To sunoliko sas poso einai:" + sum);        
            game.removequestion(p);         //svhnei thn erwthsh analoga me ton tuxaio arithmo pou dwsame sthn arxh
            w = w - 1;                      //miwnoume kathe fora thn metavlhth mas sto telos gia na dinoume kathe fora tuxaious arithmous oso kai to euros ths listas mas 
        } while (w > 0);                //oso h w einai megaluterh apo to 0 dhladh kai apo to eurs ths listas ;) kane epanalhpseis
        System.out.println("");
        System.out.println("Ftasame sto telos tou paixnidiou!");
        System.out.print("SUGXARHTHRIA KERDISATE "+sum);
        System.out.println("$");
    }

}

















/* 
        Data listT = new Data("Which is the only American state to begin with the letter 'p'?", " Pennsylvania.", 10);
        listT.addQuest("Name the world's biggest island.", "Greenland.", 20);
        listT.addQuest("What is the world's longest river?", "Amazon.", 20);
        listT.addQuest("Name the world's largest ocean.", "Pacific", 20);
        listT.addQuest("What is the diameter of Earth?", "8,000 miles.", 20);
        listT.addQuest("Where would you find the world's most ancient forest?", "Daintree Forest north of Cairns, Australia.", 20);
        listT.addQuest("Which four British cities have underground rail systems?", "Liverpool, Glasgow, Newcastle and London.", 20);
        listT.addQuest("What is the capital city of Spain?", "Madrid", 20);
        listT.addQuest("Which country is Prague in?", "Czech Republic", 20);
        listT.addQuest("In 2011, which country hosted a Formula 1 race for the first time?", "India", 20);
        */
