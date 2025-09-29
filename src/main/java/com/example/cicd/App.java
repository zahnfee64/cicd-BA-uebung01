package com.example.cicd;

/**
 * Hinweis (für Ü2/Sonar):
 * - System.out.println statt Logger → Code Smell
 * - auskommentierter Code → Code Smell
 * - TODO: In Übung 2 Logging/Linter-Regeln besprechen
 */
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3);
        System.out.println("Sum(2,3) = " + sum); // TODO: Logger verwenden

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int s1 = calc.sumUp(numbers);    // absichtliche Duplikation
        int s2 = calc.addAll(numbers);   // absichtliche Duplikation
        System.out.println("sumUp=" + s1 + ", addAll=" + s2);

        System.out.println("isPalindrome('Anna')? " + TextUtils.isPalindrome("Anna"));
        System.out.println("safeParseInt('42'): " + TextUtils.safeParseInt("42"));
        System.out.println("safeParseInt('x'): " + TextUtils.safeParseInt("x"));

        // TODO(Ü2): Logging statt println, auskommentierten Code entfernen
        // System.out.println("commented out code"); // Sonar-Hinweis
    }
}
