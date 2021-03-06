# Maven Build  
## MSD Studium - Konfigurationsmanagement Aufgabe 2/2020 

<p>
Bei der folgenden Aufgabenstellung handelt es sich um eine 30 Punkte Aufgabe im Fach Konfigurationsmanagement im Zuge des Mobile Software Development Studiums. Diese Aufgabe dient dazu, sich mit Maven Build Automatisierung auseinander zu setzen und die Zusammenarbeit im Team auch zu üben über Git Hub. Ebenso sollen Fehler im Code behandelt werden und tests erstellt werden. 

Hierzu haben wir im folgenden eine genaue Schritt für Schritt Aufgaben Liste zusammengestellt, die von den Dozenten so vorgegeben wurden in einer Vorlesung. 
Diese werden von uns laufend so Committet im Git Hub, dass man sofort sieht, wenn wir etwas davon erledigt haben. 

Ziel ist dabei zunächst 3 Fehler zu finden in einem vorhandenen Code der Dozenten bei dem es um Queues geht und diese beheben und dann eine eigene Generics Queue Klasse implementieren und diese laufen kommentieren und auch alle Schritte am Anfang richtig ausführen. 

Der effizienzhalber, halten wir hier im Report die selben Umfänge fest wie in unserer Read me, da bereits alle Themen von uns sehr detailliert im Report behandelt wurden mit weit über 30 Seiten stetig während der Übungen, auch mit Schritt für Schritt Bildeinleitungen. 

Wie man daher die Maven Sites erstellt, JavaDoc etc. Haben wir alles sehr detailliert im Report bereits abgedeckt, daher anbei nur für uns zur Orientierung die Aufgabenstellung und unten noch welche Fehler wir nun gefunden haben, Behebung und Wie wir das ganze angegangen sind, wenn es nicht schon abgedeckt ist im Report. 
</p>


## Unsere Taskliste Schritt für Schritt:

### Vorbereitung 
- [x] Übung runterladen von Git der Dozenten <br>
- [x] Repository erstellen, Achtung alles im root keine Unterordner <br>
- [x] Kurzes Readme erstellen mit Infos was wir jetzt tun werden (1 Punkt)<br>
- [x] Taskliste erstellen im read me (1P)<br>
- [x] Taskliste laufend abhacken und commiten (2P)<br>
- [x] Labreport laufend schreiben (Namen aller Mitglieder, Repository das neue verlinken) <br>


### Git commits 
- [x] Zusammenarbeit committen (2P)<br>
- [x] Qualität der Git Messages prüfen (2P)<br>

### Maven und Pom
- [x] Maven Build Automatisierung (Standard einhalten - target clean, validate, compile, tests, libaries runterladen)<br>
- [x] WICHTIG! Avatarbild Comic z.B. und Pom befüllen mit uns als Entwickler anderen raus löschen, jede Person soll sich selbst eintragen und Committen (1P)<br>
- [x] Adresse des Repository (1P)<br>
- [x] Auch mit mvm Compiler build starten um zu prüfen ob alle geht, also auch ohne intellJ<br>
 
### Fehler finden
- [x] Selbst implementieren: eine neue Implementierung die mit unterschiedlichen Klassen/Datentypen funktioniert also Generics dafür verwenden. <br>
- [x] Wir dürfen den Code auch wiederverwenden von den Dozenten nur wirklich separate Datei dafür nutzen und nicht vorhandene löschen also neue Klasse (2,5P) <br>
- [x] Code dabei immer nachvollziehbar kommentieren - JavaDoc <br>

### Testen 
- [x] Hier ist wichtig das die vorhandene Implementierung mit 100% Testabdeckung funktioniert (2P)<br>
- [x] Dann noch eine Testklasse erstellen wo wir unsere Generics mit Strings auch mit 100% abdecken (3P)<br>
- [x] JavaDoc Kommentare was wir testen (1P)<br>
- [x] Zusätzliche Testfiles um die Generic zu testen mit einer anderen Klasse (2P)<br>

### Maven Site - Markdown Sprache 
- [x] Entwickler Infos <br>
- [x] JavaDoc als Maven Site Exortieren (1P)<br>
- [x] Manuell erstelle Inhalte aus als Site exportieren (was ist eine Queue und wie kann die getestet werden) <br>
- [x] Code Snipped oder Grafiken verwenden <br>
- [x] Mögliche Einsatzgebiete von Queues, was sind Generics, Was ist ein Code Coverade bei Source Code Tests?<br>

### LabReport erweitern
- [x] ergänzungen nachtragen welche fehler und wie behoben 

<p> <br>
Welche Fehler haben wir nur gefunden?
 - Pull Methode war falsch da sie leere Queues nicht richtig behandelt hat (!= statt ==)
 - maxSize statt maxsize musste im Konstruktor angepasst werden
 - remove setzt element auf leeren String "" dies wurde entfernt

<br>
Wie haben wir die Generics gemacht?
Wir haben alle Fehler aus der vorhandenen Klasse korrigiert, indem wir Testfälle gemacht haben. 
Wenn diese fehlgeschlagen sind, haben wir den Fehler mit debugg gesucht und geändert. 
Danach haben wir diese Klasse kopiert, das Interface auf Generics umgebaut, die neue Klasse auch auf Generics umgebaut.
Dann haben wir eine eigene Test Klasse gemacht mit Integer Werten statt String und diese auch auf 100% getestet. 
Die Maven Site wurde generiert mit allen notwendigen Informationen, inkl. Fragen zu Generics. 

Vielen Dank und viel spaß beim bewerten :)


</p>


