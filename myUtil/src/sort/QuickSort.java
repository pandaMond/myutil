package sort;


/**
 * 快速排序
 * @author LQ
 *
 */
public class QuickSort {
	 int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
	  
	 public QuickSort(){  
	   
	     quick(a);  
	   
	     for(int i=0;i<a.length;i++)  
	   
	        System.out.println(a[i]);  
	   
	 }  
	
	public int getMiddle(int []list,int low,int high){
		int tmp=list[low]; //数组的第一个作为中轴
		while(low<high){
			while(low<high&&list[high]>=tmp){
				high--;
			}
			list[low]=list[high];
			while(low<high&&list[low]<=tmp){
				low++;
			}
			list[high]=list[low];
		}
		list[low]=tmp;
		
		return low;
	}
	public void _quicksork(int[]list,int low,int high){
		if(low<high){
			int middle=getMiddle(list,low,high);
			_quicksork(list, low, middle-1);
			_quicksork(list, middle+1, high);
		}
	}
	public void quick(int []a2){
		if(a2.length>0){
			_quicksork(a2, 0, a2.length-1);
		}
		
	}

}
