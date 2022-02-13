package com.bradyrussell.apijar.runtime;

public interface ApiJarPlugin {
    String getName();
    String getDescription();
    long getVersion();
    default long getInitializeOrder() {
        return 1;
    }
    boolean initialize();
    void shutdown();
}
