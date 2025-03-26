package juego.ports;

import java.util.*;
/*
public class PortGraph {
    private Map<String, Map<String, Integer>> adjacencyList;

    public PortGraph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addPort(String port) {
        adjacencyList.putIfAbsent(port, new HashMap<>());
    }

    public void addConnection(String port1, String port2, int distance) {
        adjacencyList.get(port1).put(port2, distance);
        adjacencyList.get(port2).put(port1, distance);
    }

    public void depthFirstSearch(String startPort, Set<String> visited) {
        if (!visited.contains(startPort)) {
            System.out.println("Visited: " + startPort);
            visited.add(startPort);
            for (String neighbor : adjacencyList.getOrDefault(startPort, Collections.emptyMap()).keySet()) {
                depthFirstSearch(neighbor, visited);
            }
        }
    }

    public String findShortestPath(String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue);

        distances.put(start, 0);
        queue.add(new AbstractMap.SimpleEntry<>(start, 0));

        while (!queue.isEmpty()) {
            String current = queue.poll().getKey();
            if (current.equals(end)) break;

            for (Map.Entry<String, Integer> neighbor : adjacencyList.getOrDefault(current, Collections.emptyMap()).entrySet()) {
                int newDist = distances.get(current) + neighbor.getValue();
                if (newDist < distances.getOrDefault(neighbor.getKey(), Integer.MAX_VALUE)) {
                    distances.put(neighbor.getKey(), newDist);
                    previous.put(neighbor.getKey(), current);
                    queue.add(new AbstractMap.SimpleEntry<>(neighbor.getKey(), newDist));
                }
            }
        }

        String path = end;
        String step = previous.get(end);
        while (step != null) {
            path = step + " -> " + path;
            step = previous.get(step);
        }
        return path;
    }

    public void removeHighestDegreePort() {
        String highestPort = null;
        int maxConnections = -1;
        for (Map.Entry<String, Map<String, Integer>> entry : adjacencyList.entrySet()) {
            if (entry.getValue().size() > maxConnections) {
                maxConnections = entry.getValue().size();
                highestPort = entry.getKey();
            }
        }
        if (highestPort != null) {
            adjacencyList.remove(highestPort);
            for (Map<String, Integer> neighbors : adjacencyList.values()) {
                neighbors.remove(highestPort);
            }
            System.out.println("Removed port: " + highestPort);
        }
    }
}
 */