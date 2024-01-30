package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commadant;
	public Camp (Soldat commandant) {
		this.commadant = commandant;
	}
	public Soldat getCommandant() {
		return commadant;
	}
	public void setCommandant(Soldat commandant) {
		this.commadant = commandant;
	}
}
