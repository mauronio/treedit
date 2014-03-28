package com.td.model.project;

import com.td.model.Node;

public class Folder extends Node {

	@Override
	public int getType() {
		return Project.typeFolder;
	}

	@Override
	public boolean supportsChildType(int childType) {
		boolean isSupported = false;
		
		switch (childType) { 
			case Project.typeFolder: isSupported = true;
			case Project.typeFile: isSupported = true;
		}
		return isSupported;
	}

}
