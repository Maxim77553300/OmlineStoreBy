package by.shumkov.onlineShopby.service.impl;

import by.shumkov.onlineShopby.repository.UserRepository;
import by.shumkov.onlineShopby.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private static final String USER_NOT_FOUND = "User not Found";


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {


        return userRepository.findUserByLogin(userName).orElseThrow(() -> new UsernameNotFoundException(USER_NOT_FOUND));
    }


}
