package com.example.demo.TOptional;

import java.util.Optional;

/**
 * @author zhai
 * @date 2018/9/13 9:20
 */
public class UserO {

    private Address address;

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
