/* Class: CISC 3130
 * Section: TY9
 * EmplId: 23731694
 * Name: Victor Liang Zheng
 */

import java.util.*;
import java.io.*;

public class A1{
	public static void main(String[] args) throws Exception{
		//Read in the file
		FileReader fr = new FileReader("regional-global-weekly-latest.csv");
		BufferedReader reader = new BufferedReader(fr);
		LinkedList<String> positionList = new LinkedList<String>();
		LinkedList<String> trackList = new LinkedList<String>();
		LinkedList<String> artistList = new LinkedList<String>();
		LinkedList<String> streamList = new LinkedList<String>();
		LinkedList<String> urlList = new LinkedList<String>();
		String row;
		//Inserting the data into the list created above
		while((row = reader.readLine()) != null) {
			String[] data = row.split(",");
			String position = data[0];
			positionList.add(position);
			String track = data[1];
			trackList.add(track);
			String artist = data[2];
			artistList.add(artist);
			String stream = data[3];
			streamList.add(stream);
			String url = data[4];
			urlList.add(url);
			}
		reader.close();
		//Using Map to remove the duplicate artists and count their times appeared on the list
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : artistList){
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
			}
		//Calling method to print the list to console and into a file
		printList(map);
		printListToFile(map);
		System.out.println("\nSorted Artist List:\n");
		//Using TreeMap to sort
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		//Calling method to print the sorted list to console and into a file
		printSortedList(treeMap);
		printSortedListToFile(treeMap);
		}
	
	//Method to print the list and the number of times the duplicate element appeared on the list
	public static void printList(Map<String, Integer> map){
		for (Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " -- Times Appeared: " + entry.getValue());
			}
		}
	//Method to print the sorted list
	public static void printSortedList(Map<String, Integer> map){
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());}
		}
	//Method to print the list and the number of times the duplicate element appeared on the list into a file
	public static void printListToFile(Map<String, Integer> map)throws Exception{
		FileWriter fileWriter = new FileWriter("List.txt");
		PrintWriter pw = new PrintWriter(fileWriter);  
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			pw.println(entry.getKey() + " -- Times Appeared: " + entry.getValue());
			}
		pw.close();
		}
	//Method to print the sorted list into a file
	public static void printSortedListToFile(Map<String, Integer> map)throws Exception{
		FileWriter fileWriter = new FileWriter("SortedList.txt");
		PrintWriter pw = new PrintWriter(fileWriter);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			pw.println(entry.getKey());
			}
		pw.close();
		}
	}
