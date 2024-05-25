package com.cleancoder.args;

import java.util.Iterator;

public interface ArgumentMarshaler<T> {
    void set(Iterator<String> currentArgument) throws ArgsException;
    T get();
}
