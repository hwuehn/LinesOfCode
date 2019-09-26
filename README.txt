
Function Kata “LOC”

Entwickle eine Funktion, die die Lines of Code (LOC) in einem wohlgeformten C# Quelltext zählt.

Der Quelltext wird als String angeliefert, zurückgegeben wird die Zahl der Zeilen, die ausführbaren Code enthalten. 
Zeilen, die nur aus Kommentar oder Whitespace bestehen, sollen also herausgefiltert werden [1].

Variation #1

Liefere auch die Zahl der Zeilen zurück, die als reiner Kommentar bzw. reiner Whitespace herausgefiltert wurden.
Endnoten

[1] Zeichenketten werden als ausführbarer Code gewertet. 
Sollen sie sich über mehrere Zeilen erstrecken oder gar Whitespace-Zeilen enthalten, sind die mitzuzählen.