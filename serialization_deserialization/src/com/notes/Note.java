package com.notes;

public class Note {

	/*
	 * serialization :
	 * 
	 * > Serialization > Deserialization > How to Implement - ObjectOutputStream and
	 * ObjectInputStream and their methods > Transient > Transient with static and
	 * final
	 * 
	 * > Order of serialization and deserialization must be same > If we dont know
	 * order of serialization then still we can have one option - "instanceOf"
	 * operator. by using this we can deserialize.
	 * 
	 * >>https://www.journaldev.com/2452/serialization-in-java
	 * 
	 * > Object Graph
	 * >>https://www.geeksforgeeks.org/object-graph-java-serialization/#:~:text=An%
	 * 20Object%20Graph%20is%20the,well%20as%20its%20object%20references.
	 * 
	 * > Inheritance in serialization : > Parent (serializable) - child (not) -- If
	 * parent is serializable then child will be automatically serializable
	 * (serializable nature inherits from parent)
	 * 
	 * > Parent (not) - child (serializable) -- need to take extra care -
	 * 
	 * :1: To serialize child, Parent need not to be serializable. (Object class is
	 * parent of all and its not serializable!!!) :2: if any instance variable
	 * inheriting from parent in child then JVM will ignore its original value and
	 * replaces by default value - at the time of serialization.!!
	 * 
	 * :3: But at the time of deserialization, if parent is not serializable, then
	 * JVM will execute instance control flow and shares its instance variable
	 * value.!! -- To execute instance control flow, JVM will always call no-arg
	 * constructor!(else we will get InvalidClassException)
	 * 
	 * What is instance control flow :
	 * its 3 step process : 
	 *        > 1. Identify instance variables 
	 *        > 2. Execution of instance variable assignments and execution of instance block if any. 
	 *        > 3. Execution of constructor
	 * 
	 * > Customized Serialization
	 * 
	 * : during default serialization, there may be a chance of loss of information
	 * because of the transient keyword. To recover this loss, we will have to use
	 * Customized Serialization. 
	 * > we have to provide readObject() and writeObject() methods explicitly!!
	 * 
	 * >>
	 * https://www.geeksforgeeks.org/customized-serialization-and-deserialization-in
	 * -java/ >>
	 * https://howtodoinjava.com/java/serialization/custom-serialization-readobject-
	 * writeobject/
	 * 
	 * > SerialVersionUID :
	 * 
	 * > Sender and recevier might be at different locations / different machines 
	 * > Basic thing is : sender and recevier creates .class file of respective object
	 * at their machines. 
	 * > But while serialization, only objects state gets transeferred over network/file, not the .class file!! 
	 * > So to identify the actual serialized object, JVM adds an unique id(SerialVersionUID)to every
	 * objects state while serializing!! 
	 * > simillarly, at the time of deserialization, JVM cross checks the SerialVersionUID is matching or not
	 * with the local .class file's SerialVersionUID.. if it is matching, then only
	 * it deserialize the object successfully.
	 * 
	 * > Some problems with default SerialVersionUID : 
	 * 
	 * > If sender and recevier are using different versions of JVM, then there might be possibility of different
	 * SerialVersionUID will get generated. 
	 * > Even if we have same versions of JVM at sender and recevier, still if we get any modifications in .class file at
	 * recevier, SerialVersionUID at recevier will get changed.
	 * > JVM have a very complex algorithm to calculate SerialVersionUID and it costs performance 
	 * > So to avoid these problems, we should declare our own SerialVersionUID 
	 * > Some IDEs explicitly promts/puts/generates SerialVersionUID automatically
	 */}
