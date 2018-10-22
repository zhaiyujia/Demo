package com.example.demo.TOptional;

import java.util.Optional;

/**
 * @author zhai
 * @date 2018/9/13 9:21
 */
public class Address {

    private Country country;

    public Optional<Country> getCountry() {
        return Optional.ofNullable(country);
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
