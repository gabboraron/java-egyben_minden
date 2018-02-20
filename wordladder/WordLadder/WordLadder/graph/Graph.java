package graph;

public interface Graph<V>{
	
	public boolean hasEdge(V v1, V v2);
	public void addNode(V v);
	public void addEdge(V v1, V v2);
}