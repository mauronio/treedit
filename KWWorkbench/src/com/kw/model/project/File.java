package com.kw.model.project;

import com.kw.model.Node;

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
