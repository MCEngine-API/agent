package io.github.mcengine.api.agent.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Agent-based DLC contract for components that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this to integrate Agent-related DLC into the plugin system.
 */
public interface IMCEngineAgentDLC {

    /**
     * Called when the Agent DLC is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Agent DLC is being disabled/unloaded by the engine.
     * <p>
     * Use this to clean up resources or state that should not persist after disabling.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Agent DLC module.
     *
     * @param id the unique ID assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
