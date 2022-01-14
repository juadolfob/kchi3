package model;

public interface User {

	default public void whoAmI() {
		System.out.println(getClass().getSimpleName());
	};
}
