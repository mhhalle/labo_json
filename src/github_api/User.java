package github_api;

public class User {

    String name;
    int followers;
    int repos;
    int gist;
    String avatar;

    public User(String name, int followers, int repos, int gist, String avatar){
        this.avatar = avatar;
        this.repos = repos;
        this.gist = gist;
        this.followers = followers;
    }
}
