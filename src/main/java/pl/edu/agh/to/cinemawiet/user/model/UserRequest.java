package pl.edu.agh.to.cinemawiet.user.model;


public record UserRequest(String name, String secondName, String email,
                          UserRole role) {
}
