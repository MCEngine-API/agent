package io.github.mcengine.api.agent.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Agent AddOn contract for modules that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this to integrate Agent-related features via the AddOn extension system.
 */
public interface IMCEngineAgentAddOn {

    /**
     * Called when the Agent AddOn is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Agent AddOn is being disabled/unloaded by the engine.
     * <p>
     * Use this method to release resources, unregister listeners, or perform any necessary cleanup.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Agent AddOn instance.
     *
     * @param id the unique ID assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
