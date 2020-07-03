

##Was ist eine queue:<h2>
<br>
*Eine Warteschlange (Queue) verwaltet eine Folge von Objekten, wobei man immer Objekte (an das Ende) anfügen kann und zu jedem Zeitpunkt das Objekt löschen kann, welches (von den vorhandenen) als erstes eingefügt wurde.

**Typische Anwendungen für Warteschlangen in der Informatik sind:**

1. • Druckerschlange
1. • Tastatureingabe
1. • Multitask-Systeme
1. • Breitensuche*

Source: http://www.inf.fu-berlin.de/lehre/SS10/infb/queues.pdf

import java.util.*;

´´´java
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


<br>

**Output:**

The Queue contents: [one, two, three, four]

##Wie kann ich eine Queue testen<h2>
<br>
<p>Die Überprüfung einer beliebigen, nicht allzu einfachen Warteschlange erfordert den Einsatz einer ganzen Gruppe von Tests. Wenn ein Knoten nur eine eingehende Verbindung hat und wir Grund zu der Annahme haben, dass diese Warteschlange von der durch diesen Knoten repräsentierten Komponente verwaltet wird, dann sollten wir es vorziehen, die in der Warteschlange befindlichen Komponenten mit Hilfe des Komponententestansatzes zu testen. Wenn es einen Zusammenführungs-, Erfassungs- oder Verbindungsknoten (mehrere eingehende Verbindungen) gibt, dann müssen wir die Warteschlange auf Komponentenebene testen und diese Tests dann während des Systemtests wiederholen. Wir wählen die Tests in Abhängigkeit von der Warteschlangendisziplin und der Server-Auswahlregel, falls vorhanden.
Source: https://testmatick.com/queue-testing/</p>


##Was sind Generics<h2>
<br>
<p>Generics wurden mit der Version 1.5 in Java eingeführt, um den Umgang mit polymorphen Datenstrukturen zu verbessern.
Mit generischen Java-Methoden und generischen Klassen können Programmierer mit einer einzigen Methoden-Deklaration eine Reihe von verwandten Methoden bzw. mit einer einzigen Klassen-Deklaration eine Reihe von verwandten Typen angeben.
Unter Verwendung des Java Generic-Konzepts könnten wir eine generische Methode zum Sortieren eines Arrays von Objekten schreiben und dann die generische Methode mit Integer-Arrays, Double-Arrays, String-Arrays usw. aufrufen, um die Array-Elemente zu sortieren.</p>
https://www.tutorialspoint.com/java/java_generics.htm



##Was ist ein code coverage bei source code tests<h>
<br>
<p>Die Codeabdeckung ist der Prozentsatz des Codes, der durch automatisierte Tests abgedeckt wird. Bei der Messung der Codeabdeckung wird einfach festgestellt, welche Anweisungen in einem Codebody durch einen Testlauf ausgeführt wurden und welche Anweisungen nicht. ... Die Code-Abdeckung ist Teil einer Feedback-Schleife im Entwicklungsprozess.</p>
