package com.td.model.project;

import com.td.model.Node;

public class File extends Node {

	@Override
	public int getType() {
		return Project.typeFile;
	}

	@Override
	public boolean supportsChildType(int childType) {
		return false;
	}

}
