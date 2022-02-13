package com.bradyrussell.apijar.runtime;

import java.util.List;

public interface ApiJarConfiguration {
    String get(String key);
    void set(String key, String value);
    boolean has(String key);
    List<String> keys();
}
