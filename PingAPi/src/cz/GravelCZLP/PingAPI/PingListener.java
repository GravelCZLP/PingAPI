package cz.GravelCZLP.PingAPI;

public interface PingListener {
	public void onPingAPIEnable(PingAPI api);
	public void onPing(PingEvent event);
	public void onPingAPIDisable(PingAPI api);
}