package id.orume.mccoinapi;

import id.orume.mccoin.CoinManager;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCCoinAPI extends JavaPlugin {

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PUBLIC)
    private CoinManager coinManager;

    @Override
    public void onEnable() {

        this.getLogger().info("MCCoinAPI is enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
