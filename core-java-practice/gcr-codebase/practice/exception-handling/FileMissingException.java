package practicesProgram;

import java.io.IOException;

public class FileMissingException extends IOException {

    String fileName;

    public FileMissingException(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getMessage() {
        return "File not found!\nFile Name:- " + fileName;
    }
}