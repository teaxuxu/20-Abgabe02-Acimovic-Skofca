

##Was ist eine Queue
Eine Warteschlange (Queue) verwaltet eine Folge von Objekten, wobei man immer Objekte (an das Ende) anfügen kann und zu jedem Zeitpunkt das Objekt löschen kann, welches (von den vorhandenen) als erstes eingefügt wurde.

**Typische Anwendungen für Warteschlangen in der Informatik sind:**

- Druckerschlange
- Tastatureingabe
- Multitask-Systeme
- Breitensuche

Source: http://www.inf.fu-berlin.de/lehre/SS10/infb/queues.pdf

```javascript
import java.util.*;

public class Main {
public static void main(String[] args) {
//declare a Queue
Queue<String> str_queue = new LinkedList<>();
//initialize the queue with values
str_queue.add("one");
str_queue.add( "two");
str_queue.add("three");
str_queue.add("four");
//print the Queaue
System.out.println("The Queue contents" + str_queue);
}
}
```




**Output:**

The Queue contents: [one, two, three, four]
<br>
<br>
##Wie kann ich eine Queue testen

<p>Die Überprüfung einer beliebigen, nicht allzu einfachen Warteschlange erfordert den Einsatz einer ganzen Gruppe von Tests. Wenn ein Knoten nur eine eingehende Verbindung hat und wir Grund zu der Annahme haben, dass diese Warteschlange von der durch diesen Knoten repräsentierten Komponente verwaltet wird, dann sollten wir es vorziehen, die in der Warteschlange befindlichen Komponenten mit Hilfe des Komponententestansatzes zu testen. Wenn es einen Zusammenführungs-, Erfassungs- oder Verbindungsknoten (mehrere eingehende Verbindungen) gibt, dann müssen wir die Warteschlange auf Komponentenebene testen und diese Tests dann während des Systemtests wiederholen. Wir wählen die Tests in Abhängigkeit von der Warteschlangendisziplin und der Server-Auswahlregel, falls vorhanden.
Source: https://testmatick.com/queue-testing/</p>


##Was sind Generics

<p>Generics wurden mit der Version 1.5 in Java eingeführt, um den Umgang mit polymorphen Datenstrukturen zu verbessern.
Mit generischen Java-Methoden und generischen Klassen können Programmierer mit einer einzigen Methoden-Deklaration eine Reihe von verwandten Methoden bzw. mit einer einzigen Klassen-Deklaration eine Reihe von verwandten Typen angeben.
Unter Verwendung des Java Generic-Konzepts könnten wir eine generische Methode zum Sortieren eines Arrays von Objekten schreiben und dann die generische Methode mit Integer-Arrays, Double-Arrays, String-Arrays usw. aufrufen, um die Array-Elemente zu sortieren.</p>

https://www.tutorialspoint.com/java/java_generics.htm

```javascript
List meineListe = new ArrayList();
meineListe.add( new Integer(42) );
String s = (String) meineListe.get( 0 ); // <-- Laufzeit-Exception !

List<String> meineListe = new ArrayList<String> ();
meineListe.add( new Integer(42)  ); // <-- Kompilierfehler
String s = meineListe.get( 0 );
```
<br>
<br>


##Was ist ein code coverage bei source code tests

<p>Die Codeabdeckung ist der Prozentsatz des Codes, der durch automatisierte Tests abgedeckt wird. Bei der Messung der Codeabdeckung wird einfach festgestellt, welche Anweisungen in einem Codebody durch einen Testlauf ausgeführt wurden und welche Anweisungen nicht.</p>

<br>
<br>

![Alt Text](https://media.giphy.com/media/cLqcNGQcQhyn4uRWzR/giphy.gif )
