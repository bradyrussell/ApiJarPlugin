package com.bradyrussell.apijar.runtime;

import java.util.List;
import java.util.function.Supplier;

public interface ApiJarCache {
    String get(String key);
    void set(String key, String value);
    boolean has(String key);
    List<String> keys();
    String getOrDefault(String key, String ifNotFound, boolean cacheDefaultIfNotFound);
    String getOrCall(String key, Supplier<String> ifNotFound, boolean cacheDefaultIfNotFound);
}
