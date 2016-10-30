package cz.GravelCZLP.PingAPI;

import java.net.InetAddress;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.util.CachedServerIcon;

public class PingReply {
	@SuppressWarnings("unused")
	private Object ctx;
	private String motd;
	private int onlinePlayers;
	private int maxPlayers;
	private int protocolVersion;
	private List<String> playerSample;
	private String protocolName;
	private boolean hidePlayers = false;
	private CachedServerIcon icon = Bukkit.getServerIcon();
	private InetAddress address;
	
	public PingReply(Object ctx, String motd, int onlinePlayers, int maxPlayers, int protocolVersion, String protocolName, List<String> playerSample, InetAddress address) {
		this.ctx = ctx;
		this.motd = motd;
		this.onlinePlayers = onlinePlayers;
		this.maxPlayers = maxPlayers;
		this.protocolVersion = protocolVersion;
		this.playerSample = playerSample;
		this.protocolName = protocolName;
		this.address = address;
	}
	
	public int getOnlinePlayers() {
		return this.onlinePlayers;
	}
	
	public int getMaxPlayers() {
		return this.maxPlayers;
	}
	
	public String getMOTD() {
		return this.motd;
	}
	
	public int getProtocolVersion() {
		return this.protocolVersion;
	}
	
	public List<String> getPlayerSample() {
		return this.playerSample;
	}
	
	public InetAddress getAddress() {
		return address;
	}
	
	public boolean arePlayersHidden() {
		return this.hidePlayers;
	}
	
	public CachedServerIcon getIcon() {
		return this.icon;
	}
	
	public void setOnlinePlayers(int onlinePlayers) {
		this.onlinePlayers = onlinePlayers;
	}
	
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	
	public void setMOTD(String motd) {
		this.motd = motd;
	}
	
	public void setProtocolVersion(int protocolVersion) {
		this.protocolVersion = protocolVersion;
	}
	
	public void setPlayerSample(List<String> playerSample) {
		this.playerSample = playerSample;
	}
	
	public void hidePlayers(boolean hide) {
		this.hidePlayers = hide;
	}
	
	public void setIcon(CachedServerIcon icon) {
		this.icon = icon;
	}

	public String getProtocolName() {
		return protocolName;
	}
	public void setProtocolName(String newName) {
		protocolName = newName;
	}
}