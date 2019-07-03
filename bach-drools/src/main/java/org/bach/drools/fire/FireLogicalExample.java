package org.bach.drools.fire;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class FireLogicalExample {

	public static void main(String[] args) {
		KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
		KieSession ksession = kc.newKieSession("FireLogicalKS");

		String[] names = new String[] { "kitchen", "bedroom", "office", "livingroom" };
		Map<String, Room> name2room = new HashMap<String, Room>();

		for (String name : names) {
			Room room = new Room(name);
			name2room.put(name, room);
			ksession.insert(room);
			Sprinkler sprinkler = new Sprinkler(room);
			ksession.insert(sprinkler);
		}

		ksession.fireAllRules();
		pause();

		Fire kitchenFire = new Fire(name2room.get("kitchen"));

		FactHandle kitchenFireHandle = ksession.insert(kitchenFire);

		ksession.fireAllRules();
		pause();

		ksession.delete(kitchenFireHandle);

		ksession.fireAllRules();
		pause();

		ksession.dispose(); // Stateful rule session must always be disposed when finished
	}

	public static void pause() {
		System.out.println("Pressure enter to contnue");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
	}

}
