package dev.patika.spring.solid.lsp.good;

import javax.swing.text.ChangedCharSetException;
import java.io.IOException;

public interface Walk extends Bird{

    void walking() throws Exception, ChangedCharSetException;
}
