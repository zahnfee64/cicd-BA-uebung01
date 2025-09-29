package com.example.cicd;

/**
 * Hinweise (für Ü2/Sonar):
 * - isPalindrome(): '==' statt equalsIgnoreCase → Bug
 * - safeParseInt(): leerer Catch + zu generische Exception → spezifischer fangen, loggen
 * - TODO(Ü2): Unit-Tests so erweitern, dass Bug sichtbar wird und danach fixen
 */
public class TextUtils {

    // Bug: String-Vergleich mit '==' statt equalsIgnoreCase -> Sonar sollte das finden
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.toLowerCase() == reversed.toLowerCase(); // absichtlich falsch
    }

    // Leerer Catch-Block + sehr generische Exception
    public static int safeParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) { // TODO(Ü2): NumberFormatException fangen, optional loggen
            // absichtlich leer gelassen
        }
        return 0; // „Fallback“ – diskutabel
    }
}
