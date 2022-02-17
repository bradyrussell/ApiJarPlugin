package com.bradyrussell.apijar.runtime.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TaskClass {
    /**
     * The name of this Task Class. Defaults to the Java class name.
     * @return The name of this Task Class.
     */
    String name() default ""; // testTaskClass
}
