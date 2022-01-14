package main;

import factory.UserFactory;
import model.*;

public class Application {

	public static void main(String[] args) {

		UserFactory userFactory = new UserFactory();

		Developer developer = (Developer) userFactory.getUser("Developer");
		developer.whoAmI();

		ERS ers = (ERS) userFactory.getUser("ERS");
		ers.whoAmI();

		FunctionalAnalyst functionalAnalyst = (FunctionalAnalyst) userFactory.getUser("FunctionalAnalyst");
		functionalAnalyst.whoAmI();

		ProjectLeader projectLeader = (ProjectLeader) userFactory.getUser("ProjectLeader");
		projectLeader.whoAmI();

		QA qa = (QA) userFactory.getUser("QA");
		qa.whoAmI();
	}
}
