
Function Kata �LOC�

Entwickle eine Funktion, die die Lines of Code (LOC) in einem wohlgeformten C# Quelltext z�hlt.

Der Quelltext wird als String angeliefert, zur�ckgegeben wird die Zahl der Zeilen, die ausf�hrbaren Code enthalten. 
Zeilen, die nur aus Kommentar oder Whitespace bestehen, sollen also herausgefiltert werden [1].

Variation #1

Liefere auch die Zahl der Zeilen zur�ck, die als reiner Kommentar bzw. reiner Whitespace herausgefiltert wurden.
Endnoten

[1] Zeichenketten werden als ausf�hrbarer Code gewertet. 
Sollen sie sich �ber mehrere Zeilen erstrecken oder gar Whitespace-Zeilen enthalten, sind die mitzuz�hlen.