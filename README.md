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
