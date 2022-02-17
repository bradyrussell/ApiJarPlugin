package com.bradyrussell.apijar.runtime.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskMethod {
    /**
     * The name of this Task Method. Defaults to the Java method name.
     * @return The name of this Task Method.
     */
    String name() default ""; // testMethod

    /**
     * The duration in seconds after which to repeat the task.
     * @return The duration in seconds after which to repeat the task.
     */
    long repeatPeriod() default 0; //seconds

    /**
     * The duration in seconds after which to initiate the first execution of the task.
     * @return The duration in seconds after which to initiate the first execution of the task.
     */
    long initialDelay() default 0; //seconds

    /**
     * The TaskRunType that indicates how this task should be run.
     * @return The TaskRunType that indicates how this task should be run.
     */
    TaskRunType runType() default TaskRunType.ONCE;

    /**
     * The number of times to repeat the task when using TaskRunType.N_TIMES.
     * @return The number of times to repeat the task when using TaskRunType.N_TIMES.
     */
    long repetitions() default 1; //times

    enum TaskRunType {
        ONCE,
        INDEFINITE,
        N_TIMES
    }
}
