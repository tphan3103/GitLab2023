package edu.unl.raikes.git;

public class GitLabHelper {

	private String person1;
	private String person2;
	private String person3;

	GitLabHelper(String person1, String person2, String person3) {
		this.person1 = person1;
		this.person2 = person2;
		this.person3 = person3;
	}

	public void PrintWelcomeMessage() {
		System.out.print("This is a lesson on git made by " + person1 + " and " + person2 + " and " + person3);
	}

}
