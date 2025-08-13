package io.github.mcengine.api.agent.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Library contract for Agent modules that can be dynamically loaded into MCEngine.
 * <p>
 * Typically used to support Agent backend logic or infrastructure without player interaction.
 */
public interface IMCEngineAgentLibrary {

    /**
     * Called when the Agent library is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Agent library is being disabled/unloaded by the engine.
     * <p>
     * Implementations should use this to release any services or dependencies registered during {@link #onLoad(Plugin)}.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Agent library module.
     *
     * @param id the unique ID assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
