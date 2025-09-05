package org.example.DTO;

// Classe interne pour récupérer l’email et mot de passe reçus dans la requête
public class LoginRequest {
    private String email;
    private String motDePasse;

    // Getters et setters
    public String getEmail() { return email; }
    public String getmotDePasse() { return motDePasse; }
}
