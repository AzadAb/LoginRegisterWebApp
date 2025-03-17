package com.azad.doa;

public interface UserDo {
abstract  boolean isvalidUser(String username,String password);
boolean addUser(User user);
}
