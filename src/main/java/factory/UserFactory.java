package factory;

import model.Developer;
import model.ERS;
import model.FunctionalAnalyst;
import model.ProjectLeader;
import model.QA;
import model.User;

public class UserFactory {

	public User getUser(String UserType) {
		switch (UserType) {
		case "Developer":
			return (User) new Developer();
		case "ERS":
			return (User) new ERS();
		case "FunctionalAnalyst":
			return (User) new FunctionalAnalyst();
		case "ProjectLeader":
			return (User) new ProjectLeader();
		case "QA":
			return (User) new QA();
		}

		return null;

	};
}
