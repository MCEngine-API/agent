package io.github.mcengine.api.agent.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Agent contract for components that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this to integrate Agent-related logic into the plugin system.
 */
public interface IMCEngineAgent {

    /**
     * Invoked when the Agent is loaded by the engine.
     *
     * @param plugin the plugin instance providing the runtime context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Agent is being disabled/unloaded by the engine.
     * <p>
     * Implementations should release resources and revert transient state here.
     *
     * @param plugin the plugin instance providing the runtime context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns the unique identifier for this Agent instance.
     *
     * @param id the unique identifier assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
