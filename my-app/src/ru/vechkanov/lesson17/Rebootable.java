package ru.vechkanov.lesson17;

import java.io.IOException;

public interface Rebootable {
    void rebootSave(String name) throws IOException;
    Library rebootLoad(String name) throws IOException, ClassNotFoundException;




}
