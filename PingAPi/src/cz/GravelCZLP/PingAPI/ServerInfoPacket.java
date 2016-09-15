package cz.GravelCZLP.PingAPI;

public interface ServerInfoPacket {
	public void send();
	public PingReply getPingReply();
	public void setPingReply(PingReply reply);
}
