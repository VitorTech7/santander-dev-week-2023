package com.techSolutions.santanderdevweek2023.service;

import com.techSolutions.santanderdevweek2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User creat(User userToCreat);
}
