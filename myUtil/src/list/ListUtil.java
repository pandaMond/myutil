package list;

import java.util.List;

public class ListUtil {
	
	/**
	 * 更新list内的元素，要更新的旧对象，要更新的对象。
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
