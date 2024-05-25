package com.cleancoder.args;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler<Boolean> {
    private boolean booleanValue = false;

    public void set(Iterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }

    public Boolean get() {
        return booleanValue;
    }
}
