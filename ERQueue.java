package LabExam;

import java.util.PriorityQueue;

public class ERQueue {
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

