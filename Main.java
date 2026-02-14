import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("casa", "house");
        dictionary.put("perro", "dog");
        dictionary.put("helado", "ice cream");
        dictionary.put("gato", "cat");
        dictionary.put("iglesia", "church");
        dictionary.put("libro", "book");
        dictionary.put("naranja", "orange");
        dictionary.put("mesa", "table");
        dictionary.put("guitarra", "guitar");
        dictionary.put("silla", "chair");
        dictionary.put("agua", "water");
        dictionary.put("ventana", "window");
        dictionary.put("tortuga", "turtle");
        dictionary.put("puerta", "door");
        dictionary.put("uva", "grape");
        dictionary.put("coche", "car");
        dictionary.put("manzana", "apple");
        dictionary.put("ciudad", "city");
        dictionary.put("arbol", "tree");
        dictionary.put("comida", "food");
        dictionary.put("delfin", "dolphin");
        dictionary.put("escuela", "school");
        dictionary.put("rosa", "rose");
        dictionary.put("trabajo", "work");
        dictionary.put("elefante", "elephant");

        List<String> spanishWords = new ArrayList<>(dictionary.keySet());
        Collections.shuffle(spanishWords);

        int correct = 0;
        int incorrect = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5 && i < spanishWords.size(); i++) {
            String spanish = spanishWords.get(i);
            System.out.print("Translate to English: " + spanish + " -> ");
            String userAnswer = scanner.nextLine().trim();

            String expected = dictionary.get(spanish);
            if (expected.equalsIgnoreCase(userAnswer)) {
                correct++;
                System.out.println("Correct.");
            } else {
                incorrect++;
                System.out.println("Incorrect. Expected: " + expected);
            }
        }

        System.out.println("Correct answers: " + correct);
        System.out.println("Incorrect answers: " + incorrect);
    }
}