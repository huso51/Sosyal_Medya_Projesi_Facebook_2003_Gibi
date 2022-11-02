package com.huseyinaydin.comparator;

import java.util.Comparator;

import com.huseyinaydin.model.Message;
import com.huseyinaydin.model.Share;

public class ShareReverseComparator implements Comparator<Share> {

	@Override
	public int compare(Share a, Share b) {
		Long long1 = a.getShare_Id();
		Long long2 = b.getShare_Id();
		return long2.compareTo(long1);
	}

}
