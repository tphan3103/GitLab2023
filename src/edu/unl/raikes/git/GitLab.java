package edu.unl.raikes.git;

public class GitLab {
    

	public static void main(String[] args) {
		System.out.println("This is a lesson on git");
		GitLabHelper helper = new GitLabHelper("Tan", "Emily", "Vaughn");
		helper.PrintWelcomeMessage();
	}
}
