# CI/CD Übung – Java Basisprojekt (mit Hinweisen)

Dieses Repository ist der Startpunkt für **Übung 1** und wird in **allen folgenden Übungen** weiterverwendet
(CI mit GitHub Actions → SonarCloud → Docker → Security-Scan).

---

## Voraussetzungen (VS Code)
- Installiere **Extension Pack for Java** (Language Support, Debugger, Test Runner, Maven).
- Stelle sicher, dass **JDK 17** aktiv ist: *Java: Configure Java Runtime*.
- Öffne **den Projektroot** (Ordner mit `pom.xml`), nicht nur `src/`.
- Tests ausführen: *Test Explorer* oder per Terminal `mvn -q -DskipTests=false test`.

---

## Build & Test (lokal)
```bash
mvn -q -DskipTests=false test
```

Coverage-Report (für Übung 2 / SonarCloud): `target/site/jacoco/index.html`

---

## Projektstruktur
- `src/main/java`: `App`, `Calculator`, `TextUtils`, `NumberUtils`
- `src/test/java`: `CalculatorTest`, `TextUtilsTest` (enthält TODOs & einen bewusst fehlschlagenden Test)

---

## Übung 1 – Aufgaben (24 Punkte)

### 1) Repository einrichten (4 P.)
- **Repo:** `ci-cd-uebung-[Nachname]` in GitHub (wird weiterverwendet)
- `README.md`: Name, Studiengang, Erwartungen
- Lokal klonen

### 2) Projektgrundlage + erste Tests (6 P.)
- Kleine App in `src/` (bereits enthalten)
- **Unit-Tests** in `src/test/` ergänzen (mind. 1 zusätzlicher Testfall)
- Lokaler Testlauf erfolgreich

### 3) Branching (6 P.)
- Branch **`feature/about-me`**
- Datei `about-me.md`: *3 Fakten* + *„Warum ist CI/CD für mich relevant?“*
- Commit & Push

### 4) PR-Workflow & Reviews (6 P.)
- Pull Request auf `main` mit sinnvoller Beschreibung
- **Team-Review** (2–3er Teams, je eigenes Repo), mind. 1 Kommentar
- Feedback adressieren & **Merge**

### 5) Dokumentation (2 P.)
- `README.md` um Abschnitt **„Übung 1“** ergänzen (Autor, Besonderheit/Erfahrung in 1–2 Sätzen)

---

## Bewertung (Rubrik, 24 Punkte)

| Teilaufgabe | Beschreibung | Punkte |
|---|---|---:|
| Repo einrichten | Repo + README vorhanden, lokal geklont | 4 |
| Projektgrundlage & Tests | zusätzliche Tests vorhanden, laufen lokal | 6 |
| Branching | Branch erstellt, `about-me.md` vollständig | 6 |
| PR & Review | PR mit Beschreibung, 1 Review-Kommentar, Merge | 6 |
| Dokumentation | README-Abschnitt „Übung 1“ ergänzt | 2 |
| **Summe** | | **24** |

---

## Konventionen (für alle Übungen)
- **Branch-Namen:** `feature/<kurz>`, `fix/<issue-id>-<kurz>`
- **Commit-Messages:** *Conventional Commits* (`feat:`, `fix:`, `docs:`, `test:`, `refactor:` …)
- **PR-Qualität:** kleine Diffs, klare Beschreibung, mindestens 1 Review-Kommentar
- **Issues:** Labels (`bug`, `feat`, `docs`, …), PRs mit Issues verlinken (`Fixes #<nr>`)

---

## Sonar-Hinweise (werden in Übung 2 sichtbar)
- **String-Vergleich mit `==`** in `TextUtils.isPalindrome` (Bug)
- **Leerer `catch`-Block** + zu generische Exception in `TextUtils.safeParseInt`
- **Duplizierter Code** in `Calculator.sumUp` / `addAll`
- **Magic Numbers** (`42`, `3/5/7/13/17`)
- **`System.out.println`** statt Logger in `App`
- **öffentliche, nicht finale statische Felder** (`MAX_OPERANDS`, `DEFAULT_LIMIT`)
- **unbenutztes Feld** in `NumberUtils`

---

## Ausblick
- **Übung 2 (22.10.)**: GitHub Actions – Build & Tests automatisiert ausführen; SonarCloud integrieren.
