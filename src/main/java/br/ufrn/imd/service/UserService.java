package br.ufrn.imd.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.ufrn.imd.modelo.User;
import br.ufrn.imd.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}