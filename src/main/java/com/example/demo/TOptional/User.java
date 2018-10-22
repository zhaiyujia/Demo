package com.example.demo.TOptional;

import java.util.Optional;

/**
 * @author zhai
 * @date 2018/9/12 19:55
 */
public class User {

    public User(Integer id) {
        this.id = id;
    }

    private Integer id;

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
