# A1---Top-Streaming-Music-Artists

This project demonstrates how to read in a file of the top streaming music artist in spotify and convert those data into the format of the number of times the artist appeared on the list and also sorted it by their names alphabetically.

In this project I've used Linked List and Map.

I use linkedlist to read in the data in the file. The reason that I use linked list is that the operation 
with linked list is much easier and furthermore, it can grow and shrink during run time,
which makes insertion and deletion much easier.

I also use Map in the case to store and the data and sort it.
HashMap does not allows duplicates keys in which is good for me to detect the duplicates element and delete them from the list.
TreeMap allows me to store the data and sort them in an ascending order based on the key.

At the end is to use FileReader and PrintWriter to output to a file.

# Setup
These are the steps to compile A1.java and run the program A1. Source code is found in the src folder. These steps are for use with command line workflow such as with a terminal.

1. Sign up for a GitHub account if you don't have one. Set up your SSH keys with github.
2. Clone this repository git clone git@github.com:victorliangzheng88/A1---Top-Streaming-Music-Artists.git to your machine to get a copy.
3. Move into the project's root directory with cd A1---Top-Streaming-Music-Artists [^1]
4. Move again into the subdirectory src using the command cd src
5. Compile the java file using the java compiler command javac A1.java
6. Run the compiled java program with the java command java A1
You should see an output similar to the following:

$ javac A1.java
$ java A1
Artist -- Times Appeared: 1
"Demi Lovato" -- Times Appeared: 1
"Jack Harlow" -- Times Appeared: 1
Surfaces -- Times Appeared: 1
"Thiaguinho MT" -- Times Appeared: 1
"SAINt JHN" -- Times Appeared: 1
Lizzo -- Times Appeared: 2
...
