package com.cleancoder.args;

import static com.cleancoder.args.ArgsException.ErrorCode.*;

import java.util.*;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler<String[]> {
    private final List<String> strings = new ArrayList<String>();

    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            strings.add(currentArgument.next());
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public String[] get() {
        return strings.toArray(new String[0]);
    }
}
