/*
 * 321/2015050
 * Exizoglou Athanasios
 * Askhsh 4
 * 
 */
package pkg3haskhsh;

import java.util.ArrayList;

public class Trivial {

    private ArrayList<Data> listT = new ArrayList<Data>();

    public Trivial() {
        listT.add(new Data("Which is the only American state to begin with the letter 'p'?", " Pennsylvania", 20));
        listT.add(new Data("Name the world's biggest island.", "Greenland", 30));
        listT.add(new Data("What is the world's longest river?", "Amazon", 20));
        listT.add(new Data("Name the world's largest ocean.", "Pacific", 20));
        listT.add(new Data("What is the diameter of Earth?", "8,000 miles", 50));
        listT.add(new Data("Where would you find the world's most ancient forest?", "Daintree Forest north of Cairns, Australia", 80));     //dhmiourgia listas
        listT.add(new Data("Which four British cities have underground rail systems?", "Liverpool, Glasgow, Newcastle and London", 100));
        listT.add(new Data("What is the capital city of Spain?", "Madrid", 10));
        listT.add(new Data("Which country is Prague in?", "Czech Republic", 20));
        listT.add(new Data("In 2011, which country hosted a Formula 1 race for the first time?", "India", 20));

    }

    public void randomquestion(int p) {
        System.out.println(listT.get(p).getQuestion());
    }

    public int answer(String a,int sum)
    {
        
        int c = 0;
        
        for (int i = 0; i < listT.size(); i++) {
            if (a.equalsIgnoreCase(listT.get(i).getAnswers())) {                //dhmiourgia sunarthshs gia thn apanthsh tou xrhsth
                System.out.println("Eisai swstos");
                c++;
                
                System.out.println("Ta xrimata pou kerdisate einai:");
                System.out.println(listT.get(i).getAmount());
                sum = listT.get(i).getAmount();
                return sum;
            }
        }
        if (c == 0) {
            System.out.println("Dustuxos h apanthsh sas den htan swsth");
            
        }
        
        return 0;
        
    }

    public void removequestion(int p) {             //diagrafh entolhs kathe fora sto telos ths erwthshs pou ekane sthn arxh
        listT.remove(p);
    }

}
