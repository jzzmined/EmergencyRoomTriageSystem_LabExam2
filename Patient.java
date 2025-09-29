package LabExam;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.*;

	class Patient implements Comparable<Patient>{
		private String name;
		private int priority;
		private String condition;
		private String arrivalTime;
		
		//PATIENT
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
	}

