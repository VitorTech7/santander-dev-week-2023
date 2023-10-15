package com.techSolutions.santanderdevweek2023.service.impl;

import com.techSolutions.santanderdevweek2023.domain.model.User;
import com.techSolutions.santanderdevweek2023.repository.UserRepository;
import com.techSolutions.santanderdevweek2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User creat(User userToCreat) {
        if(userRepository.existsByAccountNumber(userToCreat.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exist");
        }
        return userRepository.save(userToCreat);
    }
}
