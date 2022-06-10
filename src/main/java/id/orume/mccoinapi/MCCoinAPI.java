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

        if(this.coinManager == null) {
            this.getLogger().severe("MCCoin is not loaded! please install MCCoin first!");
            this.getServer().getPluginManager().disablePlugin(this);
            return;
        }

        this.getLogger().info("MCCoinAPI is successfully loaded!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
