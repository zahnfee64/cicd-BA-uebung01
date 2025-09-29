package com.example.cicd;

import java.util.List;

/**
 * Hinweise (für Ü2/Sonar):
 * - public static nicht-finales Feld: MAX_OPERANDS → Empfehlung: private final
 * - Magic Number 42 in add()
 * - divide(): Rückgabe 0 bei Division durch 0 → lieber Exception
 * - Doppelte Logik (sumUp / addAll) → Refactoring (gemeinsame Hilfsmethode/Stream)
 */
public class Calculator {

    // Absichtlich nicht final: Sonar kann das bemängeln (Mutable static)
    public static int MAX_OPERANDS = 100;

    // Einfacher Addierer
    public int add(int a, int b) {
        // Magic Number (42) wird (noch) ignoriert -> kleiner „Smell“
        if ((a + b) > 42) { // Sonar: Magic number
            // do nothing, just an odd rule
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Problematisches Verhalten: Division durch 0 liefert 0 statt Exception
    // (Bug/Code Smell – wird von Sonar i.d.R. markiert)
    public int divide(int a, int b) {
        if (b == 0) {
            return 0; // TODO(Ü2): geeignete Exception werfen
        }
        return a / b; // Integer Division
    }

    // Duplizierte Logik (sumUp vs. addAll) für Sonar "Duplicated code"
    public int sumUp(List<Integer> nums) {
        int s = 0;
        for (Integer n : nums) {
            if (n != null) {
                s += n;
            }
        }
        return s;
    }

    public int addAll(List<Integer> nums) {
        int s = 0;
        for (Integer n : nums) {
            if (n != null) {
                s += n;
            }
        }
        return s;
    }
}
