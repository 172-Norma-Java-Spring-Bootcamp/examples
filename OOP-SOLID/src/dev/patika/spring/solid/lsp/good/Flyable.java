package dev.patika.spring.solid.lsp.good;

import javax.management.RuntimeErrorException;
import java.io.IOException;

public interface Flyable extends Bird {

    void fly() throws IOException;

}
