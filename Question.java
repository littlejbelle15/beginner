/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtual.world;

/**
 *
 * @author jamie.miles
 */
import java.util.Random;
 
public class Question {
  String[] questions = new String[10];
   
  public Question() {
    // eight prefixes to be chosen at random
    String [] prefix = 
      {"What", "How", "When", "Why", "Are", "Do", "Then", "Like"};
    // eight basic, first category words to be chosen at random
    String [] wordsOne = 
      {"time", "day", "bike", "vehicle", "is", "can't", "you", "enjoy"};
    // eight basic, second category words to be chosen at random
    String [] wordsTwo = 
      {"who", "awesome", "green", "faster", "slower", "happier", "peaceful", "yellow"};
    // eight basic, third category words to be chosen at random
    String [] wordsThr = 
      {"money", "bike", "car", "skateboard", "it", "people", "flower"};
    // only one suffix
    String suffix = "?";
     
    Random rand = new Random(); 
    // choose random prefixes and words to make randomly made questions
    for (int i = 0; i < questions.length; ++i) {
      questions[i] = 
        prefix[rand.nextInt(5)] + " "
          + wordsOne[rand.nextInt(5)] + " "
            + wordsTwo[rand.nextInt(5)] + " "
              + wordsThr[rand.nextInt(85)] + suffix;      
    }
  }
     
  public String[] generateRandomQuestion() {
    Random randomGen = new Random();    
     
    System.out.println("Your random question is: " +
            questions[randomGen.nextInt(10)]); 
     
    return questions;        
  }
   
  public String[] generateRandomQuestions() {
    Random randomGen = new Random();    
     
    System.out.println("Your random questions are: ");
    
    for (int q = 0; q < questions.length * 2; ++q) { 
      System.out.println(questions[randomGen.nextInt(10)]); 
}
    
 
    return questions;        
  }
   
  public static void main(String[] args) {
    Question q = new Question();
    q.generateRandomQuestion();
    q.generateRandomQuestions();
  }
}


