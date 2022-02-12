package com.bradyrussell.apijar.runtime.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ApiClassAnnotation {
    /**
     * The Api Class portion of the path.
     * Paths are built like so:
     * example.com/{Global Path}/{Plugin Path}/{Api Class Path}/{Api Method Path}
     * Do not provide leading or trailing slashes.
     * @return The Api Class portion of the path.
     */
    String path() default ""; // a/b/c

    /**
     * The name of this Api Class. Defaults to the Java class name.
     * @return The name of this Api Class.
     */
    String name() default ""; // testApiClass
}
