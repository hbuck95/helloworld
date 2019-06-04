package com.bae.helloworld.logic;

import java.util.HashMap;
import java.util.Map;

public class MapManager {
	private static MapManager instance;
	private Map<Integer, String> stringMap = new HashMap<Integer, String>();

	private MapManager() {

	}

	public static MapManager getInstance() {
		if (instance == null)
			instance = new MapManager();
		return instance;
	}

	public Map<Integer, String> getStringMap() {
		return stringMap;
	}

	public String retrieveString(int key) {
		return stringMap.get(key);

	}

	public void addString(int key, String value) {
		stringMap.put(key, value);
	}

}
