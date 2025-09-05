package com.example.for_dummies.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.for_dummies.model.User;
import com.example.for_dummies.repo.UserRepository;

@Service
public class UserService {

    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }


    public String signup(SignupRequest request) {

        User utilisateur = new User();
        utilisateur.setEmail(request.getEmail());
        utilisateur.setMotDePasse(request.getMotDePasse());
        String role = utilisateur.setRole(request.getRole());
        utilisateur.setDepartment(request.getDepartment());
        if (Objects.equals(role, "USER")) {
            utilisateur.setStatus("PENDING");
        }
        if (Objects.equals(role, "ADMIN")) {
            utilisateur.setStatus("CONFIRMED");
        }

        if (repo == null){
            return "NO";
        }else{
            repo.save(utilisateur);
            return "Utilisateur inscrit avec succès ✅";
        }

    }

    public ResponseEntity<Map<String, String>> signin(LoginRequest request) {
        User user = repo.findByEmail(request.getEmail());
        if (user == null) {
            return ResponseEntity.ok(Map.of("error", "Utilisateur non trouvé"));
        }
        if (!user.getMotDePasse().equals(request.getmotDePasse())) {
            return ResponseEntity.ok(Map.of("error", "Mot de passe incorrect"));
        }
        if (user.getStatus() == null || !user.getStatus().equals("CONFIRMED")) {
            return ResponseEntity.ok(Map.of("error", "Vous n'avez pas l'accès encore"));
        }

        // Return role and department
        return ResponseEntity.ok(Map.of(
                "role", user.getRole(),
                "department", user.getDepartment()
        ));
    }
}
