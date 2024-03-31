package classWork;

public class Player {
	private String playername;
	private int pid;
	private int playerrun;

	private int palyerarrrounder;

	public int getPalyerarrrounder() {
		return palyerarrrounder;
	}

	public void setPalyerarrrounder(int palyerarrrounder) {
		this.palyerarrrounder = palyerarrrounder;
	}

	public Player(String playername, int pid, int playerrun, int palyerarrrounder) {
		super();
		this.playername = playername;
		this.pid = pid;
		this.playerrun = playerrun;
		this.palyerarrrounder = palyerarrrounder;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPlayerrun() {
		return playerrun;
	}

	public void setPlayerrun(int playerrun) {
		this.playerrun = playerrun;
	}

	@Override
	public String toString() {
		return playername;
	}

}
