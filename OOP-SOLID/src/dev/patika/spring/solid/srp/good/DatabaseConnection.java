package dev.patika.spring.solid.srp.good;

import java.sql.Connection;

public interface DatabaseConnection {

    Connection open();


}
