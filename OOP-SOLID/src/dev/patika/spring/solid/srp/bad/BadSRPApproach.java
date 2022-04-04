package dev.patika.spring.solid.srp.bad;

import java.sql.Connection;
import java.util.List;

public interface BadSRPApproach {

    Connection open();

    <T> List<T> fetchFromData(Class<T> returnClass, String query);

    void writeDataToExternalFile(byte[] data);
}
