package player;

import java.util.List;

public class ConnectNNode {

	ConnectNNode state;
	int player;

	public ConnectNNode() {

	}

	public ConnectNNode getState() {
		return state;
	}

	public int getPlayer() {
		return player;
	}
	
	public List<ConnectNNode> getChildren(){
		return children;
	}
	
	
	
}