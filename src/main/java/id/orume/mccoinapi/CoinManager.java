package id.orume.mccoinapi;

import id.orume.mccoin.ICoinManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class CoinManager implements ICoinManager {
    private final id.orume.mccoin.CoinManager coinManager;
    public CoinManager() {
        MCCoinAPI plugin = JavaPlugin.getPlugin(MCCoinAPI.class);
        this.coinManager = plugin.getCoinManager();
    }


    @Override
    public boolean createCoinKey(String name) {
        return coinManager.createCoinKey(name);
    }

    @Override
    public boolean deleteCoinKey(String name) {
        return coinManager.deleteCoinKey(name);
    }

    @Override
    public boolean deleteCoinKey(int id) {
        return coinManager.deleteCoinKey(id);
    }

    @Override
    public boolean renameCoinKey(String oldName, String newName) {
        return coinManager.renameCoinKey(oldName, newName);
    }

    @Override
    public Integer getCoinKeyId(String name) {
        return coinManager.getCoinKeyId(name);
    }

    @Override
    public String getCoinKeyName(int id) {
        return coinManager.getCoinKeyName(id);
    }

    @Override
    public List<String> getCoinNames() {
        return coinManager.getCoinNames();
    }

    @Override
    public Integer getPlayerCoinAmount(String username, int coinId) {
        return coinManager.getPlayerCoinAmount(username, coinId);
    }

    @Override
    public boolean setPlayerCoinAmount(String username, int coinId, int amount, Integer currentCoinAmount) {
        return coinManager.setPlayerCoinAmount(username, coinId, amount, currentCoinAmount);
    }
}
