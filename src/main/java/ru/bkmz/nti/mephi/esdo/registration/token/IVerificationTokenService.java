package ru.bkmz.nti.mephi.esdo.registration.token;

import ru.bkmz.nti.mephi.esdo.user.User;

import java.util.Optional;

public interface IVerificationTokenService {

    String validateToken(String token);
    void saveVerificationTokenForUser(User user, String token);
    Optional<VerificationToken> findByToken(String token);
}
