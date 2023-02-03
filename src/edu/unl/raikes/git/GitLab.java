package edu.unl.raikes.git;

public class GitLab {
    

	public static void main(String[] args) {
	    
	    String[] people = {"emily", "tan", "vaughn"};
		GitLabHelper helper = new GitLabHelper(people);
		helper.PrintWelcomeMessage();
	}
}
