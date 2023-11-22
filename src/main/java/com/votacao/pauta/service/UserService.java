package com.votacao.pauta.service;
import com.votacao.pauta.exception.BadRequestException;
import com.votacao.pauta.models.User;
import com.votacao.pauta.repository.UserRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User searchUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new ObjectNotFoundException(id, User.class.getSimpleName());
        }
    }

    public User insertUser( User user) {
        if (user.getName().isEmpty()) {
            throw new BadRequestException("Não é possível criar um usuário com nome vazio");
        } else {
            return userRepository.save(user);
        }
    }
}
