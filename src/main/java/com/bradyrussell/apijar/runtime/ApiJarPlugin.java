package com.bradyrussell.apijar.runtime;

import java.util.HashMap;

public interface ApiJarPlugin {
    String getName();
    default String getPath() {
        return getName();
    }
    default String getDescription() {
        return "An ApiJar plugin called "+ getName() +".";
    }
    default long getVersion() {
        return 1;
    }
    default long getInitializeOrder() {
        return 1;
    }
    default boolean initialize() {
        return true;
    }
    default void shutdown() {

    }
    default ApiJarConfiguration getConfiguration() {
        return getConfiguration(getName());
    }
    HashMap<String, ApiJarConfiguration> configuration = new HashMap<>();
    static ApiJarConfiguration getConfiguration(String pluginName) {
        return configuration.get(pluginName);
    }
    HashMap<String, ApiJarCache> cache = new HashMap<>();
    static ApiJarCache getCache(String pluginName) {
        return cache.get(pluginName);
    }
}
