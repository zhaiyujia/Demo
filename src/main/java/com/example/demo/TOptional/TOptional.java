package com.example.demo.TOptional;

import com.google.common.collect.Lists;
import org.springframework.util.Assert;

import javax.validation.constraints.AssertTrue;
import java.util.List;
import java.util.Optional;

/**
 * @author zhai
 * @date 2018/9/12 19:55
 */
public class TOptional {

    public static void main(String[] args) {
//        Optional<User> emp = Optional.empty();
//        System.out.println(emp.get());

//        User user = null;
//        Optional<User> emp = Optional.of(user);
//        System.out.println(emp.get());

//        User user = new User(2);
//        Optional<User> emp1 = Optional.ofNullable(user);
//        System.out.println(emp1.isPresent());
//        System.out.println(emp1.ifPresent(user1 -> user.getId()));
//        System.out.println(emp1.get().getId());

//        User user1 = Optional.ofNullable(retUser()).orElse(user);
//        System.out.println(user1.getId());


//        User user = null;
//        User result = Optional.ofNullable(user).orElse(retUser());
//
//        User result2 = Optional.ofNullable(user).orElseGet(() -> retUser());


//        User user  = retUser();
//        Integer id = Optional.ofNullable(user)
//                .map(user1 -> user1.getId()).orElse(2);
//        System.out.println(id);
//        User u = new User(1);
//        Optional<User> user = Optional.ofNullable(retUser())
//                .filter(user1 -> user1.getId()!=0 && user1.getId()!=null);
//        System.out.println(user.get().getId());


//        UserO user = new UserO("anna@gmail.com", "1234");

        List<User> list = Lists.newArrayList();


    }

    public  static User retUser(){
        User user = new User(1);
        return user;
    }
}
