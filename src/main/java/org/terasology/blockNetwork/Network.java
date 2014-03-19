package org.terasology.blockNetwork;

import org.terasology.math.Side;

import java.util.Collection;

public interface Network {
    public boolean hasNetworkingNode(NetworkNode networkNode);
    public boolean hasLeafNode(NetworkNode networkNode);
    public int getNetworkSize();
    public int getDistance(NetworkNode from, NetworkNode to);
    public boolean isInDistance(int distance, NetworkNode from, NetworkNode to);
    public byte getLeafSidesInNetwork(NetworkNode networkNode);
    public boolean isInDistanceWithSide(int distance, NetworkNode from, NetworkNode to, Side toSide);
    public Collection<NetworkNode> getNetworkingNodes();
    public Collection<NetworkNode> getLeafNodes();
}
