package com.example.cicd;

/**
 * Hinweise (für Ü2/Sonar):
 * - DEFAULT_LIMIT: public static, nicht final → Empfehlung: private static final
 * - unusedCounter: unbenutztes Feld → entfernen oder nutzen
 * - Magic Numbers: 3,5,7,13,17 → benannte Konstanten
 */
public class NumberUtils {
    // public + non-final Field -> Sonar: "Make this field private and final"
    public static int DEFAULT_LIMIT = 10;

    private int unusedCounter = 0; // Sonar: Unused private field

    // Langer, leicht „unnötig“ komplexer Code mit Magic Numbers
    public static boolean isSpecial(int n) {
        // Magic numbers 3, 5, 7
        if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return true;
        }
        switch (n) {
            case 13:
            case 17:
                return true; // weitere Magic numbers
            default:
                break; // kein echter Default-Case-Inhalt
        }
        return false;
    }
}
