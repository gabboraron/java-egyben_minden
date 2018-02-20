package graph.undirected;

import graph.Graph;
import java.util.*;

public class UndirectedGraph<V> implements Graph<V>{
	private Map<V, Set<V>> edges;
	private Map<V, V> prev;
	private Map<V, Integer> dist;

	public UndirectedGraph(){
		edges = new HashMap<V, Set<V>>();
		prev = new TreeMap<V, V>();
		dist = new TreeMap<V, Integer>();
	}

	public boolean hasEdge(V v1, V v2) {
		if(!edges.keySet().contains(v1) || !edges.keySet().contains(v2)){
			throw new NoSuchElementException("Nonexistent node.");
		}
		return edges.get(v1).contains(v2) && edges.get(v2).contains(v1);
	}

	public void addNode(V v){
		if(edges.keySet().contains(v)){
			return;
		}
		edges.put(v,new HashSet<V>());
	}

	public void addEdge(V v1, V v2){
		addNode(v1);
		addNode(v2);
		edges.get(v1).add(v2);
		edges.get(v2).add(v1);
	}

	public List<V> bfs(V v){
		List<V> bfsResult = new ArrayList<V>();
		Queue<V> queue = new LinkedList<V>();
		queue.offer(v);
		dist.put(v, 0);
		while(!queue.isEmpty()){
			V peek = queue.peek();
			for (V neighbour : edges.get(peek)){
				if (!dist.keySet().contains(neighbour)){
					queue.offer(neighbour);
					prev.put(neighbour, peek);
					dist.put(neighbour, dist.get(peek)+1);
				}
			}
			bfsResult.add(queue.poll());
		}
		return bfsResult;
	}

	public boolean hasPathTo(V v){
		return dist.keySet().contains(v);
	}

	public int distTo(V v){
		if(!hasPathTo(v)){
			return Integer.MAX_VALUE;
		}
		return dist.get(v);
	}

	public List<V> pathTo(V v){
		if(!hasPathTo(v)){
			return null;
		}
		List<V> retval = new LinkedList<V>();
		retval.add(v);
		V temp = v;
		while(temp!=null){
			if(prev.get(v)!=null){
				retval.add(prev.get(v));
			}
			temp = prev.get(v);
		}
		Collections.reverse(retval);
		return retval;
	}

}