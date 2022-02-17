package com.bradyrussell.apijar.runtime.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ApiMethod {
    /**
     * The Api Method portion of the path.
     * Paths are built like so:
     * example.com/{Global Path}/{Plugin Path}/{Api Class Path}/{Api Method Path}
     * Do not provide leading or trailing slashes.
     * @return The Api Method portion of the path.
     */
    String path() default ""; // a/b/c
    /**
     * The name of this Api Method. Defaults to the Java method name.
     * @return The name of this Api Method.
     */
    String name() default ""; // testMethod

    /**
     * The duration in seconds to cache the returned values of calls to this method.
     * @return The duration in seconds to cache the returned values of calls to this method.
     */
    long cacheDuration() default 0; //seconds
}
