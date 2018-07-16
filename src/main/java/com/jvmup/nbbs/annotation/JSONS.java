package com.jvmup.nbbs.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface JSONValues {
    JSONValue[] value();
}
