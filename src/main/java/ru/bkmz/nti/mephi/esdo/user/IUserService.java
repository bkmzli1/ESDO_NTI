package ru.bkmz.nti.mephi.esdo.user;

import ru.bkmz.nti.mephi.esdo.registration.RegistrationRequest;

import java.util.List;


public interface IUserService {

    List<User> getAllUsers();
    User findByEmail(String email);
    User registerUser(RegistrationRequest registration);
}
