package LabExam;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.*;

	class Patient implements Comparable<Patient>{
		private String name;
		private int priority;
		private String condition;
		private String arrivalTime;
		
		public Patient(String name,int priority,String condition,String arrivalTime) {
			this.name = name;
			this.priority = priority;
			this.condition = condition;
			this.arrivalTime = arrivalTime;
		}
		public String getname() {
			return name;
		}
		public int getPriority() {
			return priority;
		}
		public String getCondition() {
			return condition;
		}
		public String getarrivalTime() {
			return arrivalTime;
		}
		@Override
		public int compareTo(Patient o) {
			if(this.priority != o.priority) {
				return Integer.compare(priority, priority);
			}
			return this.arrivalTime.compareToIgnoreCase(arrivalTime);
		}
		public String toString() {
			return "[P" +this.priority+ "]" +this.name+ "--" +this.condition+ "(" +this.arrivalTime+ ")";
		}
		class ERQueue{
		public PriorityQueue<Patient> queue;
		
		public ERQueue() {
			queue = new PriorityQueue<>();
		}
		public void arrive(String name,int priority,String condition,String arrivalTime) {
			Patient p = new Patient(name,priority,condition,arrivalTime);
			queue.add(p);
		}
		public void treatNext() {
			if(queue.isEmpty()) {
				System.out.println(">>> No Patient to treat...");
			}else {
				Patient next = queue.poll();
				System.out.println(">>> Treating patient now...");
				System.out.println("Treated: "+ next);
			}
		}
		public void display() {
			System.out.println("=== UPDATED QUEUE ===");
			System.out.println("Patient Waiting: "+ queue.size());
			
			int i = 1;
			for(Patient p : queue.stream().sorted().toList()) {
				System.out.println(" "+ i + "."+p);
				i++;
			}
		}
	}

public class Cadelina_PriorityQueue {
	public static void main(String[]args) {
		ERQueue er = new ERQueue();
		 
		er.arrive("Pedro Cruz", 1, "Head injury - NOW UNCONSCIOUS ⚠️", "23:52");
		er.arrive("Carlos Mendoza", 2, "Compound fracture - leg", "23:50");
		er.arrive("Lisa Wang", 2, "Severe asthma attack", "23:56");
		er.arrive("Maria Santos", 3, "Deep laceration on arm", "23:48");
		er.arrive("Ana Lim", 4, "Sprained ankle", "23:49");
		 
		er.display();
		er.treatNext();
		er.display();
	}
