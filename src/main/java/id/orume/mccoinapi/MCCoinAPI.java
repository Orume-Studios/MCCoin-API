package id.orume.mccoinapi;

import id.orume.mccoin.CoinManager;
import id.orume.mccoin.MCCoin;
import lombok.AccessLevel;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCCoinAPI extends JavaPlugin {

    @Getter(AccessLevel.PROTECTED)
    private final CoinManager coinManager;

    public MCCoinAPI() {
        MCCoin mcCoin = JavaPlugin.getPlugin(MCCoin.class);
        this.coinManager = mcCoin.getCoinManager();
    }

    @Override
    public void onEnable() {

        this.getLogger().info("MCCoinAPI is enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
