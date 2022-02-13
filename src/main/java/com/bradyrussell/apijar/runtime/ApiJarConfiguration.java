package com.bradyrussell.apijar.runtime;

public interface ApiJarConfiguration {
    String get(String key);
    void set(String key, String value);
}
