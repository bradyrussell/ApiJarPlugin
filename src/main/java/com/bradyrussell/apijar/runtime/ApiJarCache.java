package com.bradyrussell.apijar.runtime;

import java.time.Instant;
import java.util.List;
import java.util.function.Supplier;

public interface ApiJarCache {
    String get(String key);
    void set(String key, String value, long duration);
    boolean has(String key);
    Instant expires(String key);
    List<String> keys();
    String getOrDefault(String key, String ifNotFound, boolean cacheDefaultIfNotFound, long defaultDuration);
    String getOrCall(String key, Supplier<String> ifNotFound, boolean cacheDefaultIfNotFound, long defaultDuration);
}
