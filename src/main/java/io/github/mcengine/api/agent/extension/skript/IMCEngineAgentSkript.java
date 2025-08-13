package io.github.mcengine.api.agent.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Skript-based Agent contract for modules that can be dynamically loaded into MCEngine.
 * <p>
 * These modules typically encapsulate custom scripted Agent behavior and are used to extend game logic.
 */
public interface IMCEngineAgentSkript {

    /**
     * Called when the Agent Skript module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Agent Skript module is being disabled/unloaded by the engine.
     * <p>
     * Use this to clean up event handlers, memory, or tasks created during {@link #onLoad(Plugin)}.
     *
     * @param plugin the plugin instance providing context; never {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Agent Skript module.
     *
     * @param id the unique ID assigned by the engine; never {@code null} or empty
     */
    void setId(String id);
}
