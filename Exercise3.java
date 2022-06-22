package lesson10.exercises;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise3 {
	
	/***
	 *	Nje student i deges informatike 
	 *	mund te regjistrohet ne lendet 
	 *	e deges se tij deri kur te marre
	 *	prej tyre nje vleresim kalues.
	 *
	 * 	Nderto nje program qe lexon per cdo student emer dhe mbiemer:
	 * 
	 * 	Emer Mbiemer
	 * 	Emer Mbiemer
	 * 	Emer Mbiemer
	 * 	Emer Mbiemer
	 * 	Emer Mbiemer
	 * 
	 * 	Me pas lexohen emrat e te gjithe lendeve, sigurisht
	 * 	pa perseritje.
	 * 
	 * 	Me pas studentet regjistrohen per te ndjekur keto
	 * 	lende. Cdo regjistrim duht te perfundoj me nje note
	 * 	qe mund te jepet menjehere ne regjistrim, ose me
	 *  vone. Nqs nota nuk eshte kaluese, studenti do mund
	 *  te regjistrohet serish.
	 *  
	 *  Denis Balla Matematike 10
	 *  Denis Balla	Fizik 4
	 *  Denis Balla Fizik 1
	 *  Denis Balla Fizik 5
	 *  
	 *  Programi ne perfundim duhet te printoje per cdo student
	 *  sa here eshte regjistruar ai ne secilen lende.
	 * 	
	 **/
	
	
	public static void main(String[] args) {
		Map<String, TreeMap<String, LinkedList<Integer>>> map = new TreeMap<>();	
		Scanner input = new Scanner(System.in);
		System.out.println("Jep te dhenat e studenteve: ");
		while (true) {
			String nameSurname = input.next();
			if (nameSurname.equalsIgnoreCase("stop")) {
				break;
			}
			String subject = input.next();
			int value = input.nextInt();
			if (!map.containsKey(nameSurname)) {
				map.put(nameSurname, new TreeMap<>());
			}
			if (!map.get(nameSurname).containsKey(subject)) {
				map.get(nameSurname).put(subject, new LinkedList<Integer>());
			}
			if (map.get(nameSurname).get(subject).isEmpty()) {
				map.get(nameSurname).get(subject).add(value);
			} else if (map.get(nameSurname).get(subject).getLast() < 5) {
					map.get(nameSurname).get(subject).add(value);
			}
		}
		input.close();
		System.out.println(map);
	}

}
