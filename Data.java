/*
 * 321/2015050
 * Exizoglou Athanasios
 * Askhsh 4
 * 
 */
package pkg3haskhsh;


public class Data {//dhmiourgia klashs
//dhlwsh metavlhtwn 
    private String question;
    private String answers;
    private int amount;
      //dhmiourgia constructor
    public Data(String question, String answers, int amount) {
        this.question = question;
        this.answers = answers;
        this.amount = amount;
    }
//dhkwsh twn antistoixwn getters
    public String getQuestion() {
        return question;
    }

    public String getAnswers() {
        return answers;
    }

    public int getAmount() {
        return amount;
    }
   
      
}
