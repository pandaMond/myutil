package list;

import java.util.List;

public class ListUtil {
	
	/**
	 * ����list�ڵ�Ԫ�أ�Ҫ���µľɶ���Ҫ���µĶ���
	 * @param objlist
	 * @param oldObj
	 * @param newObj
	 * @return
	 */
	public List<Object> updateElement(List<Object> objlist,Object oldObj,Object newObj){
		int position=objlist.indexOf(oldObj);
		objlist.remove(position);
		objlist.add(position, newObj);
		
		return objlist;
	}
	

}
