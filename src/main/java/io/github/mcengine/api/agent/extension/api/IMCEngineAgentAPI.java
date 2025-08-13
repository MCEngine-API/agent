package io.github.mcengine.api.agent.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Core Agent API module contract that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this to expose Agent capabilities to the core system.
 */
public interface IMCEngineAgentAPI {

    /**
     * Called when the Agent API module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Agent API module is being disabled/unloaded by the engine.
     * <p>
     * Use this to deregister resources, cancel tasks, or clean up systems related to this module.
     *
     * @param plugin the plugin instance providing the context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Agent API module.
     *
     * @param id the unique ID assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
