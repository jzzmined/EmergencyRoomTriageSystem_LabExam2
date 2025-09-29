package LabExam;

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
}
